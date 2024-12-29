package recursiongoodluck;

public class RecursionGoodLUCK1 {
    // f(f(f(a)) --- a = 20
    // f(a) = 5 + a
    // f(20) = 5 + 20 = 25
    // f(f(f(25)) 
    // f(f(f(a)) --- a = 25
    // f(25) = 30
    // f(f(f(a)) --- a = 30
    // f(30) = 35

    // base case: when it stops repeating
    // recursive case: function that will repeat
    
    public static int Summation(int n) {
        // base case; at the end!
        if (n <= 0) { 
            return 0; // return 0 for adding (will not affect result)
        // recursive case; keep going!
        } else {
            // 3 + Summation(2)
            // 3 + 2 + Summation(1)
            // 3 + 2 + 1 + Summation(0)
            // 3 + 2 + 1 + 0 = 6
            return n + Summation(n-1); // plus makes it additive
            // return calculates
        }
    }
    
    public static int Factorial(int n) {
        // base case
        if (n <= 1) {
            return 1; // return 1 for multiplying (0 will 0 result)
        }
        // recursive case
        else {
            return n * Factorial(n-1); // star makes it multiplicative
        }
        // 5*4*3*2*1 ---> 5 * 4!
    }
    
    public static int Exponentiation(int n, int p) {
        // 5^3 = 5 * 5 * 5, where p is power
        // n will always be 5!
        if (p <= 0) { // multiply identity
            return 1; // 5*5*5*1
        }
        else {
            return n * Exponentiation(n, p-1);
        }
    }
    
    
    public static void main(String[] args) {
        System.out.println(Summation(3)); // n = 3
        System.out.println(Factorial(5)); 
        System.out.println(Exponentiation(5,4));

    }
}

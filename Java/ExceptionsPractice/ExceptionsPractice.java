package exceptionspractice;

public class ExceptionsPractice {
    // can handle exceptions two ways: checked and unchecked
    // 1. checked: occurs at compile time (syntax), red exclamation
    // 2. unchecked: occurs at time of program execution (logic)
    // can also throw error inside of method when we know something will error
    // can also create our own exceptions

    public static void main(String[] args) {
     //   int[] intArray = new int[10];
     //   System.out.println(intArray.length);
        // try-catch-finally block
        try {
        int[] c = new int[6];
        System.out.println("Element 6 at index 5 = " + c[5]); // executes error code
    }   catch(ArrayIndexOutOfBoundsException e) { // catches error
        System.out.println("Exception thrown" + e); // returns message and keeps 
        // program running
    }   finally { // do this no matter what
            System.out.println("Finally clause!");
        }
        
    }
}

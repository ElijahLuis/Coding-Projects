package arraypractice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayPractice {
    
    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++)
        {
            int item = array[i];
            System.out.print(item);
            if (i < array.length - 1) 
            {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
        public static void printArray(String[] array) {
            // never have the same method name!
            // only used for this exercise
        System.out.print("[");
        for (int i = 0; i < array.length; i++)
        {
            String item = array[i];
            System.out.print(item);
            if (i < array.length - 1) 
            {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        // arrays
        // 0  1  2  3  4 (index)
        // [0, 5, 3, 2, 1] - length 5 (array)
        
        // random Objects from Array
        // Math.abs(rand.nextInt) % length;
        
        int[] intArray1; // declare
        int[] intArray2 = new int[4]; // allocate
        printArray(intArray2);
        int[] intArray3 = {5, 2, 9, 1, 3}; // initialize
        
        String[] shoppingList = {"bananas", "apples", "pears"};
        
        intArray2[0] = 10;
        intArray2[1] = 94;
        intArray2[2] = 25;
        intArray2[3] = 10;
        
        System.out.println(Arrays.toString(intArray2));
        System.out.println(Arrays.toString(intArray3));
        System.out.println();
        
        // custom print out arrays
        printArray(intArray2);
        printArray(intArray3);
        System.out.println();
        
        // retrieve objects
        System.out.println(intArray2[3]);
        System.out.println(Array.get(intArray2, 3));
        System.out.println();
        
        // given functions
        Arrays.sort(intArray3); // rewrite values at indices!
        // small to big
        printArray(intArray3);
        
        // print string array
        printArray(shoppingList);
        
        System.out.println("Special For Loop:");
        // Special for loop: foreach
        for (String s : shoppingList) {
            System.out.println(s);
        }

    }
}

package dictionarypractice;

import java.util.HashMap;
import java.util.Map;

public class DictionaryPractice {

    public static void main(String[] args) {
        // English to Spanish dictionary!
        Map<String,String> englSpanDictionary = new HashMap<String,String>();
        englSpanDictionary.put("Monday","Lunes");
        englSpanDictionary.put("Tuesday","Martes");
        englSpanDictionary.put("Wednesday","Miercoles");
        englSpanDictionary.put("Thursday","Jueves");
        englSpanDictionary.put("Friday","Viernes");
        englSpanDictionary.put("Saturday","Sabado");
        englSpanDictionary.put("Sunday","Domingo");
        
        // Retrieve from dictionary
        System.out.println(englSpanDictionary.get("Monday"));
        System.out.println(englSpanDictionary.get("Tuesday"));
        System.out.println(englSpanDictionary.get("Wednesday"));
        System.out.println(englSpanDictionary.get("Thursday"));
        System.out.println(englSpanDictionary.get("Friday"));
        System.out.println(englSpanDictionary.get("Saturday"));
        System.out.println(englSpanDictionary.get("Sunday"));
        
        //Print all keys
        System.out.println(englSpanDictionary.keySet());
        //Print all values
        System.out.println(englSpanDictionary.values());
        //Print out size
        System.out.println("The size of our dictionary is " + englSpanDictionary.size());
        
        System.out.println();
        System.out.println();
        
        // Shopping List
        Map<String,Boolean> shoppingList = new HashMap <String,Boolean>();
        // Put stuff in shopping list
        shoppingList.put("Ham",true);
        shoppingList.put("Bread",Boolean.TRUE);
        shoppingList.put("Oreos",Boolean.TRUE);
        shoppingList.put("Eggs",Boolean.FALSE);
        shoppingList.put("Sugar", false);
        // retrieve items
        System.out.println(shoppingList.get("Ham"));
        System.out.println(shoppingList.get("Oreos"));
        // key-value pairs print out
        System.out.println(shoppingList.toString()); // use toString method
        System.out.println(shoppingList.isEmpty());

        // remove
        shoppingList.remove("Eggs");
        // replace things
        shoppingList.replace("Bread", Boolean.FALSE);
        System.out.println(shoppingList.toString()); // use toString method
        
    }
}

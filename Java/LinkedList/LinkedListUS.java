package linkedlist;
import java.util.LinkedList;

public class LinkedListUS {
    
    // Properties
    Node head;
    int count;
    
    // Constructors
   /* public LinkedList() {
        head = null;
        count = 0;
    }
    */
    public LinkedListUS(Node newHead) {
        head = newHead;
        count = 1;
    }
    
    // Methods - add, get, size, isEmpty, remove
    public void add(int newData) {
        Node temp = new Node(newData);
        Node current = head;
        while(current.getNext() != null) { // if current is null, 
            // it doesn't know what getNext is
            current = current.getNext();
            // iterates thru list
        }
        current.setNext(temp);
        count++;
    }
    
    public int get(int index) {
        if (index <= 0) {
            return -1; // to get around null exception above
        }
        Node current = head;
        for (int i = 1; i < index; i++) {
            current = current.getNext();
        }
        return current.getData();
    }
    
    public int size() {
        return count;
    }
    
    public boolean isEmpty() {
        return head == null;
    }
    
    public void remove() {
        // remove from back of list
        Node current = head;
        while (current.getNext().getNext() != null) { // gets to end of list
            current = current.getNext(); // sets current to previous node
        }
        current.setNext(null); // removes next node
        count--; // takes one away from count
    }
    
    

    public static void main(String[] args) {
       LinkedList<String> linkedlist = new LinkedList<>();
       linkedlist.add("Alice");
       System.out.println(linkedlist);
       linkedlist.add("Edward");
       System.out.println(linkedlist);
    }
}

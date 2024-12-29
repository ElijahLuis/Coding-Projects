package queuey;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Queuey {
    
    LinkedList queue;
    
    public Queuey() {
        // initialize queue
        queue = new LinkedList();
    }
    
    public boolean isEmpty() {
        return queue.isEmpty();
    }
    
    public int size() {
        return queue.size();
    }
    
    public void enqueue(String n){
        queue.addLast(n); // adds to end of list
    }
    
    public String dequeue() {
        return (String) queue.remove(0);
    }
    
    // peek at first item
    public String peek() {
        return (String) queue.get(0);
    }

    public static void main(String[] args) { // FIFO queue!
        Stack<String> stacky = new Stack<>();
        stacky.push("there");
        stacky.push("hi");
        System.out.println(stacky.pop() + " ");
        System.out.println("Peek:" + stacky.peek());
        System.out.println(stacky.pop() + "! ");
        System.out.println("Size: " + stacky.size());
        
    //    Queuey stringQueue = new Queuey();
    //    stringQueue.enqueue("hi");
    //    stringQueue.enqueue("there");
    //    System.out.println(stringQueue.dequeue() + " ");
    //    System.out.println(stringQueue.dequeue() + ".");
 /*       Queuey numberQueue = new Queuey();
        numberQueue.enqueue(5);
        numberQueue.enqueue(7);
        numberQueue.enqueue(6);
        System.out.println("First out: " + numberQueue.dequeue());
        System.out.println("Peek at second item: " + numberQueue.peek());
        System.out.println("Second out: " + numberQueue.dequeue());
        System.out.println("Third out: " + numberQueue.dequeue());
*/
    }
    
    // stacks are LIFO! "last in first out"
    // push (add) or pop (subtract, draw)
}

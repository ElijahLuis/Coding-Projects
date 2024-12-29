package animal;

public class Cat extends Animal {
    
    public Cat() {
        super(7);
        System.out.println("A cat has been created!");
    }
    
    public void meow() {
        System.out.println("The cat has meowed.");
    }
    
    public void eat() {
        System.out.println("A cat is eating.");
    }
    
    public void sleep() {
        System.out.println("A cat is sleeping.");
    }
    
    public void prance() {
        System.out.println("The cat is prancing.");
    }
    
    public void mew() {
        System.out.println("The cat goes mew.");
    }
}

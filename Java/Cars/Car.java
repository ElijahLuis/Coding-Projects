package car;

public class Car {
    // the blueprint of the car, to be shared!
    // datatypes: primitive (number, booleans, chars), references
        // "shared copy." (Muki wants black, I want white)
        // arrays, queues, linked lists, stacks (all are data structures!)
    // numbers: integer (whole number), double (decimal), float 
    // [decimal but less memory]
    // booleans: t/f
    // char: single character (any type), use apostrophes. ex: '$'
    int maxSpeed = 100;
    int minSpeed;
    
    double weight = 4079;
    
    boolean isCarOn = false;
    char condition = 'A';
    String nameOfCar = "Lucy";
    
    double maxFuel = 16;
    // 3 steps in variables: declare, allocate, initialize
    double currentFuel = 8;
    double mpg = 26.4;
    
    int numberOfPeopleInCar = 1;
    int maxNumberOfPeopleInCar = 6;
    
    public Car(int customMaxSpeed, double customWeight, boolean customIsCarOn) {
        // parameter; a variable in a fx refers to INPUT data
        maxSpeed = customMaxSpeed;
        weight = customWeight;
        isCarOn = customIsCarOn;
    }
    
    public Car() {
        
    }
    
    // Getters and Setters (where 'greens' belong)
    // can only set/get with these methods
    public int getMaxSpeed() {
        return this.maxSpeed; // "this" maxSpeed, specifying the object being used in main method
        
    }
    
    public void setMaxSpeed(int newMaxSpeed) {
        // parameters: variable in function that refers to input data
        // used inside function, given to us outside function
        this.maxSpeed = newMaxSpeed;
    }
    
    public int getMinSpeed() {
        return this.minSpeed;
    }
    
    public double getWeight() {
        return this.weight;
    }
    
    public boolean isTheCarOn() {
        return this.isCarOn;
    }
    
    
    public void printVariables() {
    System.out.println("This is the max speed: " + maxSpeed);
    System.out.println(minSpeed);
    System.out.println(weight);
    System.out.println(isCarOn);
    System.out.println(condition);
    System.out.println(nameOfCar);
    System.out.println(numberOfPeopleInCar);
}
    
   public void upgradeMaxSpeed() {
       setMaxSpeed(getMaxSpeed() + 10);
   }
   
   public void getIn() {
       if (numberOfPeopleInCar < maxNumberOfPeopleInCar) {
           numberOfPeopleInCar++;
           System.out.println("Someone has joined the party.");
       }
       else {
               System.out.println("The car is full!" + numberOfPeopleInCar + " = " + maxNumberOfPeopleInCar);
            }
       // can also say 'numberOfPeopleInCar++'
   }
    
   public void getOut() {
// if ppl in car, tell one to get out.
       // also 'numberOfPeopleInCar--'
       if (numberOfPeopleInCar > 0) {
           numberOfPeopleInCar -= 1; 
       }
       else {
           System.out.println("No one in car!");
           // no one gets out
       }
   }
   
   public double howManyMilesTillOutOfGas() {
       return currentFuel * mpg;
   }
   
   public double maxMilesPerFillUp() {
       return maxFuel * mpg;
   }
   
   public void turnCarOn(){
       if (!isCarOn) {
           isCarOn = true; //turns on
       }
       else {
           System.out.println("Car is already on!");
       }
   }
    public void wreckCar() {
        condition = 'C';
                
    }
    public static void main(String[] args) {
        Car tommyCar = new Car();
        tommyCar.getOut();
        tommyCar.getOut();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.turnCarOn();
        tommyCar.turnCarOn(); 
}
}

package librarycatalogue;

import java.util.HashMap;
import java.util.Map;

public class LibraryCatalogue {
//book collection, current day, length of check out, 
    // starting late fee, per day late fee
    
    Map<String,Book> bookCollection = new HashMap<String,Book>();
    int currentDay = 0;
    int lengthOfCheckOutPeriod = 7; // days before book is considered late
    double initialLateFee = 0.50; // 50 cents
    double feePerLateDay = 1.00; // 1 dollar
    
    // constructors
    public LibraryCatalogue(Map<String,Book> collection) {
        this.bookCollection = collection;
    }
    public LibraryCatalogue(Map<String,Book> collection, int lengthOfCheckOutPeriod, 
            double initialLateFee, double feePerLateDay) {
        this.bookCollection = collection;
        this.lengthOfCheckOutPeriod = lengthOfCheckOutPeriod;
        this.initialLateFee = initialLateFee;
        this.feePerLateDay = feePerLateDay;
    }
    
    // getters
    public int getCurrentDay() {
        return this.currentDay;
    }
    
    public Map<String,Book> getBookCollection() {
        return this.bookCollection;
    }
    
    public Book getBook(String bookTitle) {
        return getBookCollection().get(bookTitle);
    }
    
    public int getLengthOfCheckOutPeriod() {
        return this.lengthOfCheckOutPeriod;
    }
    
    public double getInitialLateFee() {
        return this.initialLateFee;
    }
    
    public double getFeePerLateDay() {
        return this.feePerLateDay;
    }
    
    // setters
    public void nextDay() {
        currentDay++;
    }
    
    public void setDay (int day) {
        currentDay = day;
    }
    
    // instance methods (static methods = class methods)
    public void checkOut(String title) {
        Book book = getBook(title);
        if (book.getIsCheckedOut()) {
            sorryBookCheckedOut(book);
        } else {
            book.setIsCheckedOut(true, currentDay);
            System.out.println("You checked out this fuckin' book called " + title + " bro!"
                    + " It is due on day " + (getCurrentDay() + getLengthOfCheckOutPeriod()) +
                    ".");
        }
    }
    
    public void returnBook(String title) {
        Book book = getBook(title);
        int daysLate = currentDay - (book.getDayCheckedOut() + getLengthOfCheckOutPeriod());
        if (daysLate > 0) {
            System.out.println("You owe us money bitch! Pay up that $" + (getInitialLateFee() + daysLate + getFeePerLateDay()) + 
                    " because yo book be " + daysLate + " days overdue.");
        }
        else {
            System.out.println("Book be returned. Good shit.");
        }
        book.setIsCheckedOut(false, -1);
    }
    
    public void sorryBookCheckedOut(Book book) {
        System.out.println("Sorry, early bird gets the book hoe." +
                " This book, " + book.getTitle() + ", should be back on day " +
                (book.getDayCheckedOut() + getLengthOfCheckOutPeriod()) + ".");
    }
    
    public static void main(String[] args) {
        Map<String,Book> bookCollection = new HashMap<String,Book>();
        Book harry = new Book("Harry Potter", 3948203, 999999999);
        bookCollection.put("Harry Potter", harry);
        LibraryCatalogue lib = new LibraryCatalogue(bookCollection);
        lib.checkOut("Harry Potter");
        lib.nextDay();
        lib.nextDay();
        lib.checkOut("Harry Potter");
        lib.setDay(17);
        lib.returnBook("Harry Potter");
        lib.checkOut("Harry Potter");
    }
}

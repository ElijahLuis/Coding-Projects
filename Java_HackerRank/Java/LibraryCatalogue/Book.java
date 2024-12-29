package librarycatalogue;

public class Book {
    // properties, fields, global variables
    String title;
    int pageCount;
    int ISBN;
    boolean isCheckedOut; // whether or not book is checked out
    int daysCheckedOut = -1;
    
    // constructor; what should book be initialized with?
    public Book(String bookTitle, int bookPageCount, int bookISBN) {
        this.title = bookTitle;
        this.pageCount = bookPageCount;
        this.ISBN = bookISBN;
        isCheckedOut = false;
        
    }
    
    // getters (instance methods)
    public String getTitle() {
        return this.title;
    }
    
    public int getPageCount() {
        return this.pageCount;
    }
    
    public int getISBN() {
        return this.ISBN;
    }
    
    public boolean getIsCheckedOut() {
        return this.isCheckedOut;
    }
    
    public int getDayCheckedOut() {
        return this.daysCheckedOut;
    }
    
    // setters
    public void setIsCheckedOut(boolean newIsCheckedOut, int currentDaysCheckedOut) {
        this.isCheckedOut = newIsCheckedOut;
        setDayCheckedOut(currentDaysCheckedOut);
    }
    
    private void setDayCheckedOut(int day) {
        this.daysCheckedOut = day;
    }
    
}

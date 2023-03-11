
/**
 *
 * @author tom
 */
public class Book {
    private String name;
    private int pages;
    private int publicationYear;
    
    //Constructor
    public Book(String name, int pages, int year) {
        this.name = name;
        this.pages = pages;
        this.publicationYear = year;
    }

    // getter for name
    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        String formatedName = this.name + ", " + this.pages + " pages, " +this.publicationYear;
        return formatedName;
    }
    
}

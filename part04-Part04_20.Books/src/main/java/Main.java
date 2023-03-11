import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        while (true) {
            System.out.print("Title: ");
            String bookTitle = scanner.nextLine();
            
            if (bookTitle.isEmpty()) {
                break;
            }
            
            System.out.print("Pages:");
            int bookPages = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication year: ");
            int bookYear = Integer.valueOf(scanner.nextLine());
            
            Book newBook = new Book(bookTitle, bookPages, bookYear);
            books.add(newBook);      // Add the new book to the list of books
        }
        System.out.println();
        
        // if user didn't add any book, this will end the program
        if (books == null || books.isEmpty()) {
            System.out.println("No books were added to the list");
            return;
        }
        
        System.out.print("What information will be printed? ");
        String toPrint = scanner.nextLine();
        
        for (Book book : books) {
            if (toPrint.equals("name")) {
                System.out.println(book.getName());
            } else {
                System.out.println(book.toString());
            }
        }
    }
}

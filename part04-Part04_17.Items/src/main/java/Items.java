
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Name: ");
            String userInput = scanner.nextLine();
            
            if (userInput.isEmpty()) {
                break;
            }
            
            Item newItem = new Item(userInput);
            items.add(newItem);
        }
        
        for (Item item : items) {
            System.out.println(item.toString());
        }
    }
}

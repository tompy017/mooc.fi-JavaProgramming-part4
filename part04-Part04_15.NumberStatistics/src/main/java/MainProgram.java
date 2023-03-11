
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        Statistics stats = new Statistics();
        Statistics statsEven = new Statistics();
        Statistics statsOdd = new Statistics();
        
        System.out.println("Enter numbers:");

        while (true) {
            int userInput = Integer.valueOf(scanner.nextLine());
            
            if (userInput == -1) {
                break;
            }
            // Sum even and odd numbers apart
            if (userInput % 2 == 0) {
                statsEven.addNumber(userInput);
            } else {
                statsOdd.addNumber(userInput);
            }
            
            stats.addNumber(userInput);    // sum of all numbers
        }
        
        System.out.println("Sum: " + stats.sum());
        System.out.println("Sum of even numbers: " + statsEven.sum());
        System.out.println("Sum of odd numbers: " + statsOdd.sum());
    }
}


import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;


public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        ArrayList<Integer> list = new ArrayList<>();
        
        try (Scanner reader = new Scanner(Paths.get(file))) {
            
            while (reader.hasNextLine()) {
                int number = Integer.valueOf(reader.nextLine());
                
                if (number >= lowerBound && number <= upperBound) {
                    list.add(number);
                }     
            }
            
            System.out.println("Numbers: " + list.size());
            
        } catch (Exception e) {
            System.out.println("Error: " + e + " not found.");;
        }
    }

}

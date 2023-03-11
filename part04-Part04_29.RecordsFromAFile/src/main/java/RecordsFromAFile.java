
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        try (Scanner reader = new Scanner(Paths.get(file))) {
            
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                
                String[] data = line.split(",");
                String name = data[0];
                int age = Integer.valueOf(data[1]);
                
                System.out.print(name + ", age: " + age);
                if (age == 1) {
                    System.out.println(" year");
                } else {
                    System.out.println(" years");
                }
            }
            
            
            
        } catch (Exception e) {
            System.out.println("Error: File " + e + " wasn't found.");
        }
    }
}

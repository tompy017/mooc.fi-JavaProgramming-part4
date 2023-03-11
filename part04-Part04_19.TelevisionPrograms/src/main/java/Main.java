import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Name: ");
            String programName = scanner.nextLine();
            
            if (programName.isEmpty()) {
                break;
            }
            
            System.out.print("Duration: ");
            int programDuration = Integer.valueOf(scanner.nextLine());
            
            TelevisionProgram newProgram = new TelevisionProgram(programName, programDuration);
            programs.add(newProgram);
            
        }
        // if user didn't add any program, this will end the program
        if (programs == null || programs.isEmpty()) {
            System.out.println("No programs added to the list");
            return;
        }
        
        System.out.print("Program's maximum duration? ");
        int maxDuration = Integer.valueOf(scanner.nextLine());
        
        for (TelevisionProgram program : programs) {
            if (program.getDuration() <= maxDuration) {
                System.out.println(program);
            }
        }
    }
}

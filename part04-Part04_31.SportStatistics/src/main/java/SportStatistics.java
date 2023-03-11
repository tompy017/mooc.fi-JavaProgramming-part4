
import java.nio.file.Paths;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // ask user for file name with the stats
        System.out.println("File:");
        String file = scan.nextLine();
        // ask user for team stats
        System.out.println("Team:");
        String team = scan.nextLine();
        
        int gameCounts = 0;
        int wins = 0;
        int losses = 0;
        
        // read file
        try (Scanner reader = new Scanner(Paths.get(file))) {
            
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                
                String[] data = line.split(",");
                String home = data[0];
                String away = data[1];
                int homePoints = Integer.valueOf(data[2]);
                int awayPoints = Integer.valueOf(data[3]);
                
                if (home.equals(team)) {
                    gameCounts ++;
                    if (homePoints > awayPoints) {
                        wins ++;
                    } else {
                        losses ++;
                    }   
                }
                if (away.equals(team)) {
                    gameCounts ++;
                    if (awayPoints > homePoints) {
                        wins ++;
                    } else {
                        losses ++;
                    }
                }    
            }
            // Print results
            System.out.println("Games: " + gameCounts);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);

        } catch (Exception e) {
            System.out.println("Error: File '" + e.getMessage() + "' doesn't exists.");
        }
    }
}

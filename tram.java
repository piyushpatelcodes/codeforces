import java.util.Scanner;

public class tram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); 
        
        int currentPassengers = 0;
        int maxPassengers = 0;
        
        for (int i = 0; i < n; i++) {
            int exits = scanner.nextInt(); 
            int enters = scanner.nextInt(); 
            
            currentPassengers -= exits; 
            currentPassengers += enters; 
            
            if (currentPassengers > maxPassengers) {
                maxPassengers = currentPassengers;
            }
        }
        
        System.out.println(maxPassengers);
        scanner.close();
    }
}

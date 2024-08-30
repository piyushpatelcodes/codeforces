import java.util.*;

public class a{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        //Approach 2

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



        // FAILED Mathematical Approach below
        //
        // int sumofMax=0;
        // int sumofExits = 0;
        
        // for(int i=0; i<n; i++){
        //     int exitNumbers = scanner.nextInt();
        //     int enterNumbers = scanner.nextInt();

        //     sumofMax += Math.max(exitNumbers, enterNumbers);
        //     sumofExits += exitNumbers;

        // }
        // scanner.close();

        // System.out.println((Math.abs(sumofMax - sumofExits)));
        

    }

}

// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

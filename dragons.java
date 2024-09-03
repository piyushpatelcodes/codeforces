import java.util.*;

public class dragons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kiritoStrength = scanner.nextInt();
        int numOfDragons = scanner.nextInt();

        int[][] dragons = new int[numOfDragons][2];
        for(int i=0;i<numOfDragons; i++){
            dragons[i][0] = scanner.nextInt();
            dragons[i][1] = scanner.nextInt();
        }

        // Comparater with condition is used to SORT @d array baed on Strength only.

        Arrays.sort(dragons, (a, b) -> a[0] - b[0]);

        for(int i=0; i<numOfDragons; i++){

            if (kiritoStrength > dragons[i][0]) {
                kiritoStrength += dragons[i][1]; 
            } else {
                System.out.println("NO");
                return;
            }

        }
        System.out.println("YES");




        // FAILED APPROACH DUE to UNSORTED Inputs

        // while(numOfDragons-- >0){
        //     int x = scanner.nextInt();
        //     int y = scanner.nextInt();

        //     if(kiritoStrength > x){
        //         kiritoStrength+=y;
        //     }
        //     else if(kiritoStrength < x){
        //         System.out.println("NO"); return;
        //     }
        // }
        // System.out.println("YES");


    }
}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

import java.util.*;

public class alice_Bob_and_Candies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); 

        while (t-- > 0) {
            int n = scanner.nextInt();  
            int[] arr = new int[n];

            for(int i=0; i<n; i++){
                arr[i] = scanner.nextInt();
            }

            int i=0; int j = arr.length-1;
            int candiesAliceEat = 0; int candiesBobeat = 0;
            int lastAlice = 0, lastBob = 0;
             int move=0;

             boolean aliceTurn = true;

            while(i<=j){
                if(aliceTurn){
                    int currentAlice = 0;
                    while (i <= j && currentAlice <= lastBob) {
                        currentAlice += arr[i];
                        i++;
                    }
                    candiesAliceEat += currentAlice;
                    lastAlice = currentAlice;
                }
                else{
                    int currentBob = 0;
                    while(i <= j && currentBob <= lastAlice){
                        currentBob += arr[j]; j--;
                    }
                    candiesBobeat += currentBob;
                    lastBob = currentBob;
                }
                move++;
                aliceTurn = !aliceTurn;
               
            }
            System.out.println(move + " " + candiesAliceEat + " " + candiesBobeat);

           
        }

        scanner.close();  
    }
}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

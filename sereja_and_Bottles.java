import java.util.*;

public class sereja_and_Bottles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][2];


        for (int i = 0; i < n; i++) {
            arr[i][0] = scanner.nextInt(); 
            arr[i][1] = scanner.nextInt();  
            
           
        }

        int count=0;

        // O(n2) Approach -- BAD 

        
        for(int i=0; i<n; i++){
            boolean canBeOpened = false;

            for(int j=0; j<n; j++){
                if(i != j && arr[j][1] == arr[i][0]){
                    canBeOpened = true;
                }
            }

            if(!canBeOpened){
                count++;
            }
        }

        System.out.println(count);

    }
}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

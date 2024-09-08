import java.util.*;

public class fence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0 ;i<n; i++){
            arr[i] = scanner.nextInt();
        }

        int currentSum = 0;

        
        int positionOfMinSum = 0;


        for(int i=0; i<k; i++){
            currentSum += arr[i];
            
        }

        int minSum = currentSum;
        for(int i=1; i<= n - k; i++){
            currentSum = currentSum - arr[i - 1] + arr[i + k - 1]; 

            if (currentSum < minSum) {
                minSum = currentSum;
                positionOfMinSum = i;
            }
        }

        System.out.println(positionOfMinSum+1);

        
    }

    
}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

import java.util.*;

public class special_Elements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); 

        while (t-- > 0) {
            int n = scanner.nextInt();  
            int[] arr = new int[n];

            for(int i=0; i<n; i++){
                arr[i] = scanner.nextInt();
            }

            int[] prefixSum = new int[n+1];
            for (int i = 1; i <= n; i++) {
                prefixSum[i] = prefixSum[i - 1] + arr[i - 1];
            }

            boolean[] isSpecial = new boolean[n + 1];

            for (int l = 0; l < n; l++) {
                for (int r = l + 1; r < n; r++) {
                    int sum = prefixSum[r + 1] - prefixSum[l]; 
                    if (sum <= n) {
                        isSpecial[sum] = true;  
                    }
                }
            }

            int specialCount = 0;
            for (int i = 0; i < n; i++) {
                if (isSpecial[arr[i]]) {
                    specialCount++;
                }
            }
            
            System.out.println(specialCount);

           
           
        }

        scanner.close();  
    }
}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

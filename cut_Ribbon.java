import java.util.*;

public class cut_Ribbon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(maxPieces(n, a, b, c));
    }

    // MOST optimized Solution- Approach 3
    public static int maxPieces(int n, int a, int b, int c) {
        int[] dp = new int[n + 1];  
        Arrays.fill(dp, -1);  
        dp[0] = 0;  

        for (int i = 0; i <= n; i++) {
            if (dp[i] != -1) {  
                if (i + a <= n) dp[i + a] = Math.max(dp[i + a], dp[i] + 1);
                if (i + b <= n) dp[i + b] = Math.max(dp[i + b], dp[i] + 1);
                if (i + c <= n) dp[i + c] = Math.max(dp[i + c], dp[i] + 1);
            }
        }

        return dp[n]; 
    }




    
     // Approach 2 - Successfull

    // public static int maxPieces(int n, int a, int b, int c) {
    //     int ans = 0;
    //     for (int x = 0; x <= 4000; x++) {
    //         for (int y = 0; y <= 4000; y++) {
    //             int zc = n - (x * a + y * b);
    //             if (zc < 0) {
    //                 break;
    //             }
    //             double z = zc / (double) c;
    //             if (z == (int) z) {
    //                 ans = Math.max(ans, (int) z + y + x);
    //             }
    //         }
    //     }
    //     return ans;
    // }

    // brute force approch - Failed due to TimeLimit Exceeded (Too Slow and Repeated
    // recurions means Infinite time)

    // public static int maxPieces(int n, int a, int b, int c) {
    // if (n == 0) return 0;
    // if (n < 0) return -1;

    // int cutA = maxPieces(n - a, a, b, c);
    // int cutB = maxPieces(n - b, a, b, c);
    // int cutC = maxPieces(n - c, a, b, c);

    // int maxCut = Math.max(Math.max(cutA, cutB), cutC);

    // return maxCut == -1 ? -1 : maxCut + 1;
    // }
}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

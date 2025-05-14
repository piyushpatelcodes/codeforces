import java.util.*;

public class lineTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            

                System.out.println(solve(arr, n, x));
            
        }

    }

    public static int solve(int[] arr, int n, int x) {
        int maxdiff = arr[0] ;
        for (int i = 0; i < arr.length - 1; i++) {
            maxdiff = Math.max(maxdiff, Math.abs(arr[i + 1] - arr[i]));
        }
        int remainingdistance = (x - arr[n - 1]) * 2;
        

        return Math.max(remainingdistance, maxdiff);
    }
}

// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

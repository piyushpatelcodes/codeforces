import java.util.*;

public class puzzles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr  = new int[m];
        for(int i=0; i<m; i++){
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        Arrays.sort(arr);

        int minDifference = Integer.MAX_VALUE;

        for (int i = 0; i <= m - n; i++) {
            int currentDifference = arr[i + n - 1] - arr[i];
            minDifference = Math.min(minDifference, currentDifference);
        }

        System.out.println(minDifference);


    }
}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

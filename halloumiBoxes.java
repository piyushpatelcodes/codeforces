import java.util.*;

public class halloumiBoxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();

            }

            if (k == 1) {
                int[] sortedarr = arr.clone();
                Arrays.sort(sortedarr);
                if (Arrays.equals(arr, sortedarr)) {
                    System.out.println("YES");

                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("YES");
            }
        }

    }
}

// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

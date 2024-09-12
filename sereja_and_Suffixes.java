import java.util.*;

public class sereja_and_Suffixes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        int[] distinct = new int[n];
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = n - 1; i >= 0; i--) {
            set.add(arr[i]);
            distinct[i] = set.size();
        }

        while (m-- > 0) {
            int suffixPosition = scanner.nextInt();
            suffixPosition--;

            System.out.println(distinct[suffixPosition]);

        }

    }

}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

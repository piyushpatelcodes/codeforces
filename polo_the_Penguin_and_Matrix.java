import java.util.*;

public class polo_the_Penguin_and_Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int d = scanner.nextInt();

        int[] arr = new int[n * m];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n * m; i++) {
            arr[i] = scanner.nextInt();
        }

        int remainder = arr[0] % d;
        for (int i = 1; i < n * m; i++) {
            if (arr[i] % d != remainder) {
                System.out.println("-1");
                return;
            }
        }

        Arrays.sort(arr);

        int middleElement = arr[(n * m) / 2];

        int ans = 0;

        for (int i = 0; i < n * m; i++) {
            ans += Math.abs(arr[i] - middleElement) / d;
        }

        System.out.println(ans);

        

    }

}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

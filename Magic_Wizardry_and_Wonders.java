import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static final int mx = 100;
    static final long mod = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, d, l;
        while (scanner.hasNextInt()) {
            n = scanner.nextInt();
            d = scanner.nextInt();
            l = scanner.nextInt();
            int[] a = new int[mx + 5];
            Arrays.fill(a, 1);
            int sumEven = n / 2;
            int sumOdd = n - sumEven;
            int i;

            if (d > 0) i = 1;
            else if (d < 0) i = 2;
            else if (d == 0 && n % 2 == 1) i = n - 1;
            else i = 1;

            for (; i <= n; i += 2) {
                if (sumOdd - sumEven == d) break;
                while (a[i] < l && sumOdd - sumEven != d) {
                    a[i]++;
                    if (i % 2 == 1) sumOdd++;
                    else sumEven++;
                }
            }
            if (sumOdd - sumEven != d) {
                System.out.println(-1);
                continue;
            }
            for (i = 1; i <= n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}

// Solution by piyush patel codes https://codeforces.com/submissions/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

import java.util.Scanner;

public class present_from_Lena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int row = -n; row <= n; ++row) {
            int top = n - Math.abs(row);
            for (int i = 0; i < Math.abs(row); ++i) {
                System.out.print("  ");
            }
            for (int i = 0; i < top; ++i) {
                System.out.print(i + " ");
            }
            for (int i = top; i > 0; --i) {
                System.out.print(i + " ");
            }
            System.out.println(0);
        }
        scanner.close();
    }
}

// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

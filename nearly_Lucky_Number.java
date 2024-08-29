import java.util.Scanner;

public class nearly_Lucky_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        scanner.close();

        int c = 0;
        while (n > 0) {
            int x = (int) (n % 10);
            if (x == 4 || x == 7) {
                c++;
            }
            n /= 10;
        }

        if (c == 4 || c == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

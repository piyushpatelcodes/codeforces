import java.util.Scanner;

public class hungry_Sequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        

        for (int i = n + 1; i <= 2 * n; i++) {
            System.out.print(i + " ");
        }
    }
}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

import java.util.*;

public class sakurako_Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        for (int i = 0; i < testCases; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            int sum = a + 2 * b;

            if (sum % 2 != 0) {
                System.out.println("NO");
            } 
            
            else {
                int halfSum = sum / 2;
                if (halfSum % 2 == 0 || (halfSum % 2 != 0 && a > 0)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }

        scanner.close();
    }

}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

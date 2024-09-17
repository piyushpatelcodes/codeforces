import java.util.*;

public class same_Parity_Summands {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();  
        
        while (t-- > 0) {
            long n = scanner.nextLong();  
            int k = scanner.nextInt();   
            
            // Case 1: Try to represent n as k odd numbers.
            if (n >= k && (n - k) % 2 == 0) {
                System.out.println("YES");
                // Output k-1 ones (odd numbers), and the last summand as the remainder
                for (int i = 0; i < k - 1; i++) {
                    System.out.print(1 + " ");
                }
                System.out.println(n - (k - 1));  // The last number
            }
            // Case 2: Try to represent n as k even numbers.
            else if (n >= 2 * k && (n - 2 * k) % 2 == 0) {
                System.out.println("YES");
                // Output k-1 twos (even numbers), and the last summand as the remainder
                for (int i = 0; i < k - 1; i++) {
                    System.out.print(2 + " ");
                }
                System.out.println(n - 2 * (k - 1));  // The last number
            }
            // If neither is possible, output NO
            else {
                System.out.println("NO");
            }
        }
        scanner.close();  
    }
}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

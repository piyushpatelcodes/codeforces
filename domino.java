import java.io.*;
import java.util.*;

public class domino {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int l = 0, r = 0;
        boolean s = false;

        for(int i=0; i<n; i++){
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if (n == 1 && (x % 2 + y % 2 == 1)) {
                System.out.println(-1);
                return;
            }
            if ((y % 2 + x % 2 == 1)) {
                s = true;
            }
            l += x;
            r += y;
        }

        // If the sum of x % 2 and y % 2 equals 1, it means either x or y is odd, 
        // but not both. also Set the flag s to true. 
        // This flag indicates that there is at least one domino which, if rotated, can help in balancing the sums.

        if (l % 2 == 0 && r % 2 == 0) {
            System.out.println(0);
        } else if (l % 2 == 1 && r % 2 == 1 && s) {
            System.out.println(1);
        } else {
            System.out.println(-1);
        }

   
    }
}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

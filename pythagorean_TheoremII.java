import java.io.*;
import java.util.*;

public class pythagorean_TheoremII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;

        for (int a = 1; a <= n; a++) {

            for (int b = a; b <= n; b++) {
                int cSquared = a * a + b * b;
                int c = (int) Math.sqrt(cSquared);


                if (c * c == cSquared && c <= n) {
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

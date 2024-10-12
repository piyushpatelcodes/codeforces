import java.util.*;

// This is my Solution for the Codeforces Problem "A+B Again?" (1999A) - https://codeforces.com/problemset/problem/1999/A

public class ab_Again {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            
            int lastDigit = n%10;
            n = n/10;

            System.out.println((n+lastDigit));

        }

    }
}

// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

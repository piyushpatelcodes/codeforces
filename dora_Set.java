import java.util.*;

public class dora_Set {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        while (t-- > 0) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            System.out.println(((b + 1) / 2 - (a / 2)) / 2);
        }

    }

}

// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

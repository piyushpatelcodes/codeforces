import java.util.*;

public class primary_Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s1 = sc.next();
            boolean res = (s1.length() > 2 && s1.startsWith("10")
                    && s1.charAt(2) != '0' &&
                    Integer.parseInt(s1.substring(2)) >= 2);
            System.out.println(res ? "YES" : "NO");

        }

    }
}


// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

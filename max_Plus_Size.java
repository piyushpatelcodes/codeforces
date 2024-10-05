import java.util.*;

public class max_Plus_Size{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();  
            List<Long> a = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                a.add(scanner.nextLong());
            }

            long sum1 = 0, m1 = 0, m2 = 0;
            for (int i = 0; i < n; i += 2) {
                sum1++;
                m1 = Math.max(m1, a.get(i));
            }
            long sum2 = 0;
            for (int i = 1; i < n; i += 2) {
                sum2++;
                m2 = Math.max(m2, a.get(i));
            }
            System.out.println(Math.max(sum1 + m1, sum2 + m2));
        }

        scanner.close();
    }
}


// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

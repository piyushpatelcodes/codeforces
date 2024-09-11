import java.util.*;

public class building_Permutation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        long n = scanner.nextLong();
        Long[] a = new Long[(int) n];
        
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextLong();
        }

        Arrays.sort(a, Collections.reverseOrder());
        
        long ans = 0;
        for (int i = 0; i < a.length; i++) {
            ans += Math.abs(n - a[i]);
            n--;
        }
        
        System.out.println(ans);
        scanner.close();
    }
}

// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

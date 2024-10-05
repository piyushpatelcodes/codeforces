import java.util.*;

public class robin_Hood_And_The_Major_Oak{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        
        while (t-- > 0) {
            long n = sc.nextLong();  
            long k = sc.nextLong();  

            long odd = k / 2;
            
            if ((n & 1) == 1 && (k & 1) == 1) {
                odd++;
            }
            
            if ((odd & 1) == 1) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }

            // Partially Accepted >>>>  FAILED Approach

            // long totalLeavesGrown = 0;

            // for (long i = Math.max(1, n - k + 1); i <= n; i++) {
            //     totalLeavesGrown += Math.pow(i,i);
            // }


            // if (totalLeavesGrown % 2 == 0) {
            //     System.out.println("YES");
            // } else {
            //     System.out.println("NO");
            // }
        }
    }
}

// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

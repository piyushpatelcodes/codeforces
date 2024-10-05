import java.util.*;

public class zahns_Blender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        
        while (t-- > 0) {
            long n = sc.nextLong();  
            long x = sc.nextLong();  
            long y = sc.nextLong();

            long effectiveBlendRate = Math.min(x,y);

            if (n == 0) {
                System.out.println(0);
                continue;
            }

            long totalSeconds = n / effectiveBlendRate;
            if (n % effectiveBlendRate != 0) {
                totalSeconds++;
            }
            
            System.out.println(totalSeconds);
        }
    }
}


// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

import java.util.*;

public class find_Minimum_Operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        
        while (t-- > 0) {
            long n = sc.nextLong();  
            long k = sc.nextLong();  
            

            if (k == 1) {
                System.out.println(n); 
                
                continue;
            }

            long operations = 0;
            while (n > 0) {
                operations += n % k; 
                n /= k; 
            }
            

            System.out.println(operations);
        }
    }
}

// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

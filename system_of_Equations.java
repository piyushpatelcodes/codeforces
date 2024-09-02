import java.util.*;

public class system_of_Equations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); 
        int m = sc.nextInt(); 
        
      
        sc.close();
        
        int count = 0;
        
        for (int a = 0; a * a <= n; a++) {
            int b = n - a * a;
            
            if (b >= 0 && (a + b * b) == m) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

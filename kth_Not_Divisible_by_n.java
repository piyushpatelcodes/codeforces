import java.util.*;

public class kth_Not_Divisible_by_n {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); 

        while (t-- > 0) {
            long n = scanner.nextLong();  
            long k = scanner.nextLong(); 

            long low = 1;
            long high = k * n; 

            while (low < high) {
                long mid = (low + high) / 2;
                long countNotDivisible = mid - (mid / n); 

                if (countNotDivisible < k) {
                    low = mid + 1;  
                } else {
                    high = mid;  
                }
            }

            System.out.println(low);  
        }

        scanner.close();  
    }
}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

import java.util.*;

public class two_Bags_of_Potatoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long y = scanner.nextLong();
        long k  =scanner.nextLong();
        long n= scanner.nextLong();

        List<Long> res = new ArrayList<>();

        for (long z = (y + k) / k; z * k <= n; z++) {
            long x = z * k - y;
            if (x > 0) {
               res.add(x);
            }
        }

        if(res.size() <= 0){
            System.out.println(-1); return;
        }

        for(long i : res){
            System.out.print(i + " ");
        }
        
        
    }

    
}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

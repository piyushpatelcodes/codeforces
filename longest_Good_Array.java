import java.util.*;

public class longest_Good_Array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long l = sc.nextLong();
            long r = sc.nextLong();

            long d = r-l;

            long left = 0, right = (long)Math.sqrt(2 * d) + 1;
            long answer = 0;

            while(left<=right){
                long mid = (left + right) / 2;
                if (mid * (mid - 1) / 2 <= d) {
                    answer = mid;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            System.out.println(answer);

        }
    }
}

// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

import java.util.*;

public class alternating_Sum_of_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            System.out.println(solution(arr, n));
        }

    }

    public static int solution(int[] arr, int n){
        int ans = 0;
        boolean add = true;
        for(int i : arr){
            if(add){
                ans += i;
                
            }else{
                ans -= i;
               
            }
            add = !add;
        }


        return ans;
    }

}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

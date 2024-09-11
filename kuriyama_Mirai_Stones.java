import java.util.*;

public class kuriyama_Mirai_Stones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m, type, l, r;
        
        // Changing from long[] to Long[] to force the use of merge sort
        Long[] arr = new Long[100010];
        long[] sum = new long[100010];
        long[] sum2 = new long[100010];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLong();
            sum[i + 1] = sum[i] + arr[i];
        }

        // Sorting using Arrays.sort, which now uses merge sort since it's Long[] (not long[])
        Arrays.sort(arr, 0, (int) n);

        for (int i = 0; i < n; i++) {
            sum2[i + 1] = sum2[i] + arr[i];
        }

        m = scanner.nextLong();
        for (int i = 0; i < m; i++) {
            type = scanner.nextLong();
            l = scanner.nextLong();
            r = scanner.nextLong();

            //  System.out.println(solution(type == 1 ? arr : sortedArr, l, r));
            
            System.out.println(type == 1 ? sum[(int) r] - sum[(int) (l - 1)] : sum2[(int) r] - sum2[(int) (l - 1)]);
        }
        scanner.close();
    }



    // FAILED Approach because TIME LIMIT EXCEEDED
    // Works fine for small inputs


    // public static long solution(long[] arr, int l, int r){
    //     long ans = 0;
    //     l--;

    //     for(int i=l; i<r; i++){
    //         ans += arr[i];
    //     }



    //     return ans;
    // }
}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

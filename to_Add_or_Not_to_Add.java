import java.util.*;
import java.io.*;

public class Main {
    static long[] a = new long[100005];
    static long[] prefix = new long[100005];
    static long n, k;

    // Binary search function to find the maximum possible length of subarray
    // that can be transformed to all equal elements with at most k operations
    static long BS(long low, long high, long idx) {
        long mid, ans = idx, cnt;
        while (low <= high) {
            mid = (low + high) / 2;
            cnt = (a[(int) idx] * (idx - mid + 1)) - (prefix[(int) idx] - prefix[(int) (mid - 1)]);
            if (cnt <= k) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Long.parseLong(st.nextToken());
        k = Long.parseLong(st.nextToken());
        st = new StringTokenizer(br.readLine());
        
        for (long i = 1; i <= n; i++) {
            a[(int) i] = Long.parseLong(st.nextToken()) + (long) (1e9 + 1);
        }

        Arrays.sort(a, 1, (int) (n + 1));
        prefix[0] = 0;
        
        for (long i = 1; i <= n; i++) {
            prefix[(int) i] = prefix[(int) (i - 1)] + a[(int) i];
        }
        
        long idx, ans = 0, val = 0;
        
        for (long i = 1; i <= n; i++) {
            idx = i - BS(1, i, i) + 1;
            if (idx > ans) {
                ans = idx;
                val = a[(int) i] - (long) (1e9 + 1);
            }
        }
        
        System.out.println(ans + " " + val);
    }
}


// Solution by piyush patel codes https://codeforces.com/submissions/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

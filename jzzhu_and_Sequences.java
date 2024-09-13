import java.util.*;

public class jzzhu_and_Sequences {

    public static final int MOD = 1000000007;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long x = scanner.nextLong();
        long y = scanner.nextLong();
        long n = scanner.nextLong();

        // i am using concept of  cycle of 6
        // Reduce n mod 6 because the sequence repeats every 6 terms

        long[] sequence = new long[6];
        sequence[0] = x;                  
        sequence[1] = y;              
        sequence[2] = y - x;       
        sequence[3] = -x;            
        sequence[4] = -y;      
        sequence[5] = x - y; 
   
        for (int i = 0; i < 6; i++) {
            sequence[i] = (sequence[i] % MOD + MOD) % MOD;
        }

        System.out.println(sequence[(int)((n - 1) % 6)]);



         // Brute force approach

        // long f1 = x;
        // long f2 = y;
        // long fn = 0;

       

        // if (n == 1) {
        //     fn = f1;
        // } else if (n == 2) {
        //     fn = f2;
        // } else {
        //     for (long i = 3; i <= n; i++) {
        //         fn = (f2 - f1 + MOD) % MOD; 
        //         f1 = f2;      
        //         f2 = fn;
        //     }
        // }

        // fn = (fn + MOD) % MOD;
        // System.out.println(fn);

        

        

    }

}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

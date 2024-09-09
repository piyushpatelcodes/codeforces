import java.io.*;
import java.util.*;

public class easy_Number_Challenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int MOD = 1073741824;
        int max = a*b*c;

        int[] divisors = new int[max + 1];
        for(int i=1; i<=max; i++){
            for(int j = i; j<=max; j+=i){
                divisors[j]++;
            }
        }

        long sum = 0;
        for(int i=1; i<=a; i++){
            for(int j=1; j<=b; j++){
                for(int k =1; k<=c; k++){
                    int product = i*j*k;
                    sum = (sum + divisors[product]) % MOD;
                }
            }
        }

        System.out.println(sum);

    }
}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

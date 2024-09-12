import java.util.*;

public class t_Primes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] arr = new long[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextLong();
        }

        for (long num : arr) {
            long sqrt = (long) Math.sqrt(num);
            if (sqrt * sqrt == num && isPrime((int) sqrt)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }


    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }

}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

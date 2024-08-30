import java.util.*;

public class insomnia_cure{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        
        
        scanner.close();

        // if(k==1 || l==1 || m==1|| n==1){
        //     System.out.println(d);
        // }
        // else{
        //     int count = 0;

        //     for (int i = 1; i <= d; i++) {
        //         if (i % k == 0 || i % l == 0 || i % m == 0 || i % n == 0) {
        //             count++;
        //         }
        //     }

        //     System.out.println(count);
        // }
        
        // solved mathematically for more optimized solution

        int damaged = countMultiples(d, k) + countMultiples(d, l) + countMultiples(d, m) + countMultiples(d, n)
        - countMultiples(d, lcm(k, l)) - countMultiples(d, lcm(k, m)) - countMultiples(d, lcm(k, n))
        - countMultiples(d, lcm(l, m)) - countMultiples(d, lcm(l, n)) - countMultiples(d, lcm(m, n))
        + countMultiples(d, lcm(k, l, m)) + countMultiples(d, lcm(k, l, n))
        + countMultiples(d, lcm(k, m, n)) + countMultiples(d, lcm(l, m, n))
        - countMultiples(d, lcm(k, l, m, n));

        System.out.println(damaged);
        
        
    }

    public static int countMultiples(int d, int x) {
        return d / x;
    }

    // Function to compute the LCM of two numbers
    public static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }

    // Function to compute the LCM of three numbers
    public static int lcm(int a, int b, int c) {
        return lcm(lcm(a, b), c);
    }

    // Function to compute the LCM of four numbers
    public static int lcm(int a, int b, int c, int d) {
        return lcm(lcm(a, b), lcm(c, d));
    }

    // Function to compute the GCD of two numbers
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

}

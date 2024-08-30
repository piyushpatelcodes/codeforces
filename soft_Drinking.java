import java.util.*;

public class soft_Drinking {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int p = scanner.nextInt();
        int nl = scanner.nextInt();
        int np = scanner.nextInt();

        scanner.close();

        int drinkQuantityForToast = (k*l)/nl;
        int limesQuantity = c*d;
        int saltQuantityForToast = p/np;

        System.out.println(((Math.min(saltQuantityForToast ,Math.min(drinkQuantityForToast, limesQuantity)))/n));




        
    }
}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

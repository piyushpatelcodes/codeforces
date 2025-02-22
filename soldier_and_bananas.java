import java.util.*;

public class soldier_and_bananas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();

        int totalcost = 0;

        for(int i=1; i<=w; i++){
            totalcost += k*i;

        }


            System.out.println((totalcost - n) > 0 ? (totalcost - n) : 0 );
        
         
    }
}


// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

import java.util.*;

public class even_Odds {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long  n = scanner.nextLong();
        long k = scanner.nextLong();
       // int[] arr = new int[n];
        scanner.close();

        // int oddIndex = 0; 
        // int evenIndex = (n + 1) / 2; 

        // for (int i = 1; i <= n; i++) {
        //     if (i % 2 != 0) {
        //         arr[oddIndex++] = i;
        //     } else {
        //         arr[evenIndex++] = i;
        //     }
        // }

        // System.out.println(arr[k-1]);


        // below i have implemented MATHEMATICAL and FASTER Approach

        long oddCount = (n+1)/2;

        if(k <= oddCount){
            long res = 2*k -1;
            System.out.println(res);
        }
        else{
            long m = k - oddCount;
            System.out.println(2*m);
        }





    }
}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

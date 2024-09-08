import java.util.*;

public class increase_and_Decrease {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] arr = new long[n]; int sum=0;
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextLong();
            sum += arr[i];
        }

       if(sum % n == 0){
        System.out.println(n);
       }
       else{
        System.out.println(n-1);
       }
        
    }

    
}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

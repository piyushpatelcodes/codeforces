import java.util.*;

public class business_Trip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); 
        int[] arr = new int[12];
        for(int i=0; i<12; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        if(n==0){ 
            System.out.println(0); return;
        }

        Arrays.sort(arr);
        int totalGrowth= 0;int monthsCount=0;
        
        for (int i = 11; i >= 0; i--) {
            totalGrowth += arr[i];
            monthsCount++;
            
            if (totalGrowth >= n) {
                System.out.println(monthsCount);
                return;
            }
        }


        System.out.println(-1);
    }
}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

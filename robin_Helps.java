import java.util.*;

public class robin_Helps{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- >0){
            int n  =sc.nextInt();
            int  k = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();

            }

            int goldWithrobin = 0; int countOfGiving=0;

            for(int i : arr){
                if(i >= k){
                    goldWithrobin += i;
                }
                else if(i == 0 && goldWithrobin != 0){
                    goldWithrobin = goldWithrobin - 1; countOfGiving++;
                }

            }

            System.out.println(countOfGiving);

        }
    }
}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

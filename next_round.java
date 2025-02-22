import java.util.*;

public class next_round {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        k=k-1;
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int count=0;


        for(int i : arr){
            if(i >= arr[k] && i != 0){
                count++;
            }

        }

        System.out.println(count);
         
    }
}


// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

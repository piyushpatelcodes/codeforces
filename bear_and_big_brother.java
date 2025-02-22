import java.util.*;

public class bear_and_big_brother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int ans=0;
        while(n <= k){
            n = n*3;
            k= k*2;
            ans++;
        }
         

        System.out.println(ans);
         
    }
}

// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

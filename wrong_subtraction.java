import java.util.*;

public class wrong_subtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        for(int i=1; i<=k; i++){
            int lastDigit = n%10;
            if(lastDigit == 0){
                n = n/10;
            }else{
                n = n-1;
            }
        }

        System.out.println(n);
    }
}


// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

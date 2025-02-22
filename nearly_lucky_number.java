import java.util.*;

public class nearly_lucky_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
      

        int countOfLuckyDigits = 0;

        if(n >= 1000){
            while(n>=10){
                long lastDigit = n%10;
                if((lastDigit == 4) || (lastDigit == 7)){
                    countOfLuckyDigits++;
                }
                n=n/10;
            }
            if((n == 4) || (n == 7)){
                countOfLuckyDigits++;
            }
            String isnearlyLucky = isLuckyNum(countOfLuckyDigits);
            System.out.println(isnearlyLucky);
        }else{
            System.out.println("NO");
        }

    }

    public static String isLuckyNum(int num){
        boolean ans = true;
        while(num >= 10){
            int lastDigit = num%10;
            if((lastDigit != 4) || lastDigit != 7){
                ans = false;
                break;
            }
        }
        if(ans){
            if((num != 4) && (num != 7)){
                ans = false;
            }
            
        }

        return ans == true ? "YES" : "NO";
    }
}


// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

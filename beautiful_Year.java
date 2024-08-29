import java.util.*;

public class beautiful_Year{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n= scanner.nextInt();
        n=n+1;

        while(!isdistinct(n)){
            n++;
        }
        System.out.println(n); 
        
        
    }

    public static boolean isdistinct(int n){
        boolean[] seen = new boolean[10];
        

        while(n>0){
            int digit = n%10;
            if(seen[digit]){
                return false;
            }
            seen[digit] = true;
            n /=10;
        }


        return true;
    }

}

// Solution by piyush patel codes https://codeforces.com/submissions/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

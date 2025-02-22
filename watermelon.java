import java.util.*;

public class watermelon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==2){
            System.out.println("NO");
        }else{

            System.out.println(n%2 == 0 ? "YES" : "NO");
        }
         
    }
}

// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

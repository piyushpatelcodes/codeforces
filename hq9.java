import java.util.*;
// solution for Codeforces Problem : HQ9+ :  https://codeforces.com/problemset/problem/133/A
public class hq9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        scanner.close();

        for(char c : s.toCharArray()){
            if(c == 'H' || c=='Q' || c=='9' ){
                System.out.println("YES"); return;
            }
           
        }
        System.out.println("NO");

        
    }
}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

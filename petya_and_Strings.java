import java.util.*;

public class petya_and_Strings {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next().toLowerCase();
        String s2 = scanner.next().toLowerCase();
        scanner.close();

        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                if(s1.charAt(i) < s2.charAt(i)){
                    System.out.println(-1); return;
                }
                else if(s1.charAt(i) > s2.charAt(i)){
                    System.out.println(1); return;
                }
                
            }
        }System.out.println(0); return;



    }
}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

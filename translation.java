import java.util.Scanner;

public class translation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       String s1 = sc.nextLine();
       String s2 = sc.nextLine();

       sc.close();

       if(reverse(s1).equals(s2)){
        System.out.println("YES");
       }
       else{
        System.out.println("NO");
       }
    }

    public static String reverse(String s){
        StringBuilder res = new StringBuilder();

        for(int i=s.length()-1; i>=0; i--){
            res.append(s.charAt(i));
        }
        return res.toString();
    }
}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

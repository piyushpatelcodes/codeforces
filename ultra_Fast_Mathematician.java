import java.util.*;

public class ultra_Fast_Mathematician{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        StringBuilder result = new StringBuilder();

        for(int i=0; i<a.length(); i++){
            result.append(a.charAt(i)^b.charAt(i));
        }
        System.out.println(result);
    }


}


// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

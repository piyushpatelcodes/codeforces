import java.util.*;

public class bit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = 0;

        while(n-- > 0){
            String s = scanner.next();
            String incrementSigns = "++";

            if(s.contains(incrementSigns)){
                x++;
            }
            else{
                x--;
            }
        }

        System.out.println(x);


    }
}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

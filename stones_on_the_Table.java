import java.util.*;

public class stones_on_the_Table{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        int count = 0;

        for(int i=0; i < n -1; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                count++;
            }
        }
        System.out.println(count);

        
        scanner.close();
    }

    // Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/


}

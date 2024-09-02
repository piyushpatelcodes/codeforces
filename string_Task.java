import java.util.*;

public class string_Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toLowerCase();

        s =  s.replaceAll("[aeiouy]", "");

        StringBuilder result = new StringBuilder();  

        for (char c : s.toCharArray()) {
           
                result.append('.');  
                result.append(c);    
            
        }

        System.out.println(result.toString());

      


            
        
    }

   
}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

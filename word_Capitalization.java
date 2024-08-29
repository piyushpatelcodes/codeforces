import java.util.*;

public class word_Capitalization{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

        input = input.substring(0, 1).toUpperCase() + input.substring(1);  

        System.out.println(input);

        
        scanner.close();
    }


}

// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

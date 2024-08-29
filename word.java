import java.util.*;

public class word{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

        int countOfUpperCase = 0;
        int countOfLowerCase = 0;

        for(char c :  input.toCharArray()){
            if(Character.isUpperCase(c)){
                countOfUpperCase++;
            }
            else{
                countOfLowerCase++;
            }
        }

        if(countOfLowerCase >= countOfUpperCase){
            System.out.println(input.toLowerCase());
        }
        else{
            System.out.println(input.toUpperCase());
        }

        
        scanner.close();
    }
// Solution by piyush patel codes https://codeforces.com/submissions/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

}

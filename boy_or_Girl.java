import java.util.*;

public class boy_or_Girl{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        scanner.close();
        Set<Character> set = new HashSet<>();


        for(int i=0; i<input.length(); i++){
            set.add(input.charAt(i));
        }
        
        if(set.size() % 2 != 0){
            System.out.println("IGNORE HIM!");
        }
        else{
            System.out.println("CHAT WITH HER!");
        }

        
    }
}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

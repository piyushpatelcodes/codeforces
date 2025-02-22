import java.util.*;

public class anton_and_danik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int antonWins = 0;
        int danikWins = 0;

        for (char ch : s.toLowerCase().toCharArray()) {
             if (ch == 'a') {
                antonWins++;

            } else {
                danikWins++;
            }
        }
      
        if(antonWins > danikWins){
            System.out.println("Anton");
        }else if(antonWins < danikWins){
            System.out.println("Danik");
        }else{
            System.out.println("Friendship");
        }
    }
}

// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

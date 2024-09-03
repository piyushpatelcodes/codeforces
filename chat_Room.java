import java.util.*;

public class chat_Room {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        String targetString = "hello";
        int targetIndex = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == targetString.charAt(targetIndex)){
                targetIndex++;
            }
            if (targetIndex == targetString.length()) {
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");


    }
}

// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

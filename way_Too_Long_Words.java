import java.util.*;

public class way_Too_Long_Words{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        while (n-- > 0) {
            String input = scanner.next();
            if (input.length() > 10) {
                char firstChar = input.charAt(0);
                char lastChar = input.charAt(input.length() - 1);

                String modifiedString = input.substring(1, input.length() - 1);
                int lengthOfMiddle = modifiedString.length();

                String result = firstChar + Integer.toString(lengthOfMiddle) + lastChar;

                System.out.println(result);
            } else {
                System.out.println(input);
            }
        }

        scanner.close();
    }
}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

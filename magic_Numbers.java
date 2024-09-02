import java.util.Scanner;

public class magic_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String number = sc.next();
        
        int i = 0;
        boolean isMagicNumber = true;
        
        while (i < number.length()) {
            if (i + 2 < number.length() && number.substring(i, i + 3).equals("144")) {
                i += 3;
            }
            else if (i + 1 < number.length() && number.substring(i, i + 2).equals("14")) {
                i += 2;
            }
            else if (number.charAt(i) == '1') {
                i++;
            } 
            else {
                isMagicNumber = false;
                break;
            }
        }
        
        if (isMagicNumber) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        sc.close();
    }
}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

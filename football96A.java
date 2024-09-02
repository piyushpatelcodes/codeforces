import java.util.*;

public class football96A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        // if(s.contains("0000000") || s.contains("1111111")){
        //     System.out.println("YES");
        // }
        // else{
        //     System.out.println("NO");
        // }

        int count = 1; 
        char prevChar = s.charAt(0); 
        boolean found = false;

        for (int i = 1; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (currentChar == prevChar) {
                count++; 
                if (count == 7) {
                    found = true;
                    break;
                }
            } else {
                count = 1;
                prevChar = currentChar;
            }
        }

        if (found) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();


            
        
    }

   
}

// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

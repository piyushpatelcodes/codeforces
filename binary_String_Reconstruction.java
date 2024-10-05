import java.util.*;
public class binary_String_Reconstruction{
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n0 = scanner.nextInt();
            int n1 = scanner.nextInt();
            int n2 = scanner.nextInt();
            
            StringBuilder result = new StringBuilder();
            

            if (n2 > 0) {
                for (int j = 0; j <= n2; j++) {
                    result.append('1');
                }
            }
            

            if (n0 > 0) {
                if (result.length() > 0 && result.charAt(result.length() - 1) == '1') {

                    result.append('0');
                    for (int j = 1; j <= n0; j++) {
                        result.append('0');
                    }
                } else {

                    for (int j = 0; j <= n0; j++) {
                        result.append('0');
                    }
                }
            }
            
            // here i Handle `n1` -> create alternating `01` or `10` pairs
            if (n1 > 0) {
                if (result.length() == 0) {
                    // If no sequence has been built yet, start with `01` alternating pattern
                    result.append('0');
                }

                char lastChar = result.charAt(result.length() - 1);
                for (int j = 0; j < n1; j++) {
                    if (lastChar == '0') {
                        result.append('1');
                    } else {
                        result.append('0');
                    }
                    lastChar = result.charAt(result.length() - 1);
                }
            }
            
            System.out.println(result.substring(0,(n0+n1+n2+1)));
        }
        
        scanner.close();
    }
}

// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

import java.util.*;

public class little_Elephant_and_Bits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String binaryString = scanner.next();

        int zeroIndex = binaryString.indexOf('0');  

        if (zeroIndex != -1) {
            System.out.println(binaryString.substring(0, zeroIndex) + binaryString.substring(zeroIndex + 1));
        } else {
            System.out.println(binaryString.substring(1));
        }
    }

    
}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

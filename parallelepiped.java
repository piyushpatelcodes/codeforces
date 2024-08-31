import java.util.*;

public class parallelepiped {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int  x = scanner.nextInt();
        int  y = scanner.nextInt();
        int  z = scanner.nextInt();

        scanner.close();

        int edge1 = (int) Math.sqrt((x*z)/y);
        int edge2 = (int) Math.sqrt((x*y)/z);
        int edge3 = (int)Math.sqrt((y*z)/x);

        System.out.println((4*(edge1+edge2+edge3)));
        

      



    }
}

// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

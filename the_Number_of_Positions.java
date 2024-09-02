import java.util.*;

public class the_Number_of_Positions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       int n = sc.nextInt();
       int a =  sc.nextInt();
       int b= sc.nextInt();

       int minPosition = Math.max(a+1, n-b);
       int maxPosition = n;

       int validPositions = maxPosition - minPosition + 1;

       if (validPositions > 0) {
            System.out.println(validPositions);
        } else {
            System.out.println(0);
        }
        
        sc.close();


    }
}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

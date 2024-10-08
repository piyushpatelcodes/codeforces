import java.util.*;

public class square_or_Not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            

            int sqrtN = (int) Math.sqrt(n);
            if (sqrtN * sqrtN != n) {
                System.out.println("No");
                continue;
            }

            int countOfOnes = 0;
            for (char c : s.toCharArray()) {
                if (c == '1') {
                    countOfOnes++;
                } 
            }

           
            int countOfZeros = n - countOfOnes; 

            int side = sqrtN;
            int expectedOnes = 4 * (side - 1);
            int expectedZeros = (side - 2) * (side - 2);

            if (countOfOnes == expectedOnes && countOfZeros == expectedZeros) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

        }
    }

    
}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

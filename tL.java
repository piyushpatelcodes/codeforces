import java.util.*;

public class tL{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] correctSolArray = new int[n];
        for(int i=0; i<n; i++){
            correctSolArray[i] = scanner.nextInt();
        }

        int[] inCorrectSolArray = new int[m];
        for(int i=0; i<m; i++){
            inCorrectSolArray[i] = scanner.nextInt();
        }

        int maxCorrect = Arrays.stream(correctSolArray).max().getAsInt();
        int minCorrect = Arrays.stream(correctSolArray).min().getAsInt();
        int minIncorrect = Arrays.stream(inCorrectSolArray).min().getAsInt();
        
        int v = Math.max(maxCorrect, 2 * minCorrect);
        
        if (v < minIncorrect) {
            System.out.println(v);
        } else {
            System.out.println(-1);
        }
        
        scanner.close();
        
    }

    
}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

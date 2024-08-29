import java.util.*;

public class beautiful_Matrix{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[5][5];
        int row = 0, col = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = scanner.nextInt();
                if (matrix[i][j] == 1) {
                    row = i + 1; 
                    col = j + 1; 
                }
            }
        }

        int moves = Math.abs(3 - row) + Math.abs(3 - col);

        System.out.println(moves);

    }
}

// Solution by piyush patel codes https://codeforces.com/submissions/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

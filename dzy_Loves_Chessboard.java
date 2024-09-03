import java.util.Scanner;

public class dzy_Loves_Chessboard {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine(); 

        char[][] board = new char[n][m];
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            board[i] = line.toCharArray();
        }

        char[][] result = new char[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == '-') {
                    result[i][j] = '-';
                } else {
                    if ((i + j) % 2 == 0) {
                        result[i][j] = 'B'; 
                    } else {
                        result[i][j] = 'W'; 
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(new String(result[i]));
        }

        scanner.close();
    }
}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

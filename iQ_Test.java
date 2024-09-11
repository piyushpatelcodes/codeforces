import java.util.*;

public class iQ_Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] grid = new char[4][4];
        for (int i = 0; i < 4; i++) {
            grid[i] = sc.next().toCharArray();
        }


        for(int i=0; i<3; i++){
            for(int j=0;j<3; j++){
                int blackCount = 0;
                int whiteCount=0;

                for(int x=i;x<=i+1;x++){
                    for(int y=j;y<=j+1;y++){
                        if (grid[x][y] == '#') {
                            blackCount++;
                        } else {
                            whiteCount++;
                        }

                    }
                }

                if (blackCount >= 3 || whiteCount >= 3) {
                    System.out.println("YES");
                    return;
                }

            }
        }

        System.out.println("NO");



    }
}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

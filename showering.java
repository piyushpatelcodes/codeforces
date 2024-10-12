import java.util.*;

public class showering {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int s=sc.nextInt();
            int m = sc.nextInt();
            int[][] tasks = new int[n][2];

            for(int i=0; i<n; i++){
                tasks[i][0] = sc.nextInt();
                tasks[i][1] = sc.nextInt();
            }

            boolean canBath = false;
            if (tasks[0][0] >= s) {
                canBath = true;
            }

            for(int i=1;i<n; i++){
                int freeTime = tasks[i][0] - tasks[i - 1][1];
                if(freeTime >=s){
                    canBath = true;
                    break;
                }
            }

            if (m - tasks[n - 1][1] >= s) {
                canBath = true;
            }

            System.out.println(canBath ? "YES" : "NO");

        }

    }
}


// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

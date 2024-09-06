import java.util.Scanner;

public class big_Segment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][2];

        int minElement = Integer.MAX_VALUE;
        int maxElement = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();

            minElement = Math.min(arr[i][0], minElement);
            maxElement = Math.max(arr[i][1],maxElement);
        }

        for(int i=0; i<n; i++){
            if(arr[i][0] == minElement && arr[i][1] == maxElement){
                System.out.println(i+1); return;
            }
        }
        System.out.println(-1);
    }
}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

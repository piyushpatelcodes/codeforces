import java.util.*;

public class flipping_Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int countOf1s = 0;
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
            if(arr[i] == 1) countOf1s++;
        }

        if(countOf1s == n){
            System.out.println(n-1); return;
        }

        int maxGain = Integer.MIN_VALUE;
        int currentGain = 0;

        for(int i=0; i<n; i++){
            int value = (arr[i] == 0) ? 1 : -1;
            currentGain += value;
            maxGain = Math.max(currentGain, maxGain);

            if (currentGain < 0) {
                currentGain = 0;
            }

        }

        System.out.println((countOf1s + maxGain));



    }

}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

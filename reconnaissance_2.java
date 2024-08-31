import java.util.*;

public class reconnaissance_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int  n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= scanner.nextInt();

        }

        scanner.close();

        int index1 = 0;
        int index2 = n-1;
        int diff = Math.abs(arr[index1] - arr[index2]);

        // u can also set i+1 as nextIndex = (i+1)%n;

        for (int i = 0; i < n - 1; i++) {
            int currentDiff = Math.abs(arr[i] - arr[i + 1]);
            if (currentDiff < diff) {
                diff = currentDiff;
                index1 = i;
                index2 = i + 1;
            }
        }
        index1++; index2++;   // using mod will also eliminate this line

        System.out.println(index1 + " "+ index2);
        

      



    }
}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

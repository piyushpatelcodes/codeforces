import java.util.*;

public class little_Elephant_and_Rozdil {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        int minElement = arr[0];
        int minElementCount = 0;
        int minElementIndex = 0;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] < minElement) {
                minElement = arr[i];
                minElementCount = 1; 
                minElementIndex = i; 
            } else if (arr[i] == minElement) {
                minElementCount++; 
            }
        }
        
        if (minElementCount > 1) {
            System.out.println("Still Rozdil");
        } else {
            System.out.println(minElementIndex + 1); 
        }
        




    }
}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

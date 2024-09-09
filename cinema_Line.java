import java.io.*;
import java.util.*;

public class cinema_Line {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }


        int count25 = 0;
        int count50 = 0;


        for (int i = 0; i < n; i++) {
            int bill = arr[i];

            if (bill == 25) {
                count25++;
            } else if (bill == 50) {
                if (count25 > 0) {
                    count25--;  
                    count50++; 
                } else {
                    System.out.println("NO");
                    return;
                }
            } else if (bill == 100) {
                if (count50 > 0 && count25 > 0) {
                    count50--;
                    count25--;
                } else if (count25 >= 3) {
                    count25 -= 3;
                } else {
                    System.out.println("NO");
                    return;
                }
            }
        }


        System.out.println("YES");
    }
}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

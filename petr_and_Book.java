import java.util.*;

public class petr_and_Book{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int totalPages= scanner.nextInt();
        int[] arr = new int[7];
        for(int i=0;i<7; i++){
            arr[i] = scanner.nextInt();          
        }

        scanner.close();

        int sum = 0;
        int day = 0;

        while (sum < totalPages) {
            sum += arr[day]; 
            if (sum >= totalPages) {
                System.out.println(day + 1); 
                return;
            }
            day++;
            if (day == 7) {
                day = 0; 
            }
        }

        

      



    }
}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

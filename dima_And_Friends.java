import java.util.*;

public class dima_And_Friends{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sumOfFingers = 0;
        for(int i=0; i<n; i++){
            sumOfFingers += scanner.nextInt();
        }

        int totalPeople = n+1;
        int validWays = 0;

        for(int x=1;x<6; x++){
            int totalFingers = sumOfFingers + x;
            if(totalFingers % totalPeople != 1){
                validWays++;
            }
        }

        System.out.println(validWays);
        
        scanner.close();

        



    }
}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

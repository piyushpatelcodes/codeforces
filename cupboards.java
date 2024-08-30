import java.util.*;

public class cupboards{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int leftDoorClosedCount = 0;
        int leftDoorOpencount = 0;

        int rightDoorClosedCount = 0;
        int rightDoorOpenCount=0;

        for(int i=0;i<n; i++){
            int left = scanner.nextInt();
            int right = scanner.nextInt();

            if(left ==1){
                leftDoorOpencount++;
            }
            else{
                leftDoorClosedCount++;
            }

            if(right == 1){
                rightDoorOpenCount++;

            }
            else{
                rightDoorClosedCount++;
            }
        }
        
        scanner.close();

        int minLeftDoorOperations = Math.min(leftDoorClosedCount, leftDoorOpencount);
        int minRightDoorOperations = Math.min(rightDoorClosedCount, rightDoorOpenCount);

        System.out.println((minLeftDoorOperations + minRightDoorOperations));
        
        
        
        

    }

}

// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

import java.util.*;

public class xenia_and_Ringroad {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] tasksIndex = new int[m];
        for(int i=0;i<m; i++){
            tasksIndex[i] = scanner.nextInt();
        }
        scanner.close();

        long time=tasksIndex[0]-1;


        for(int i=1; i<m; i++){
            if(tasksIndex[i] >= tasksIndex[i-1]){
                time +=(long) tasksIndex[i] - tasksIndex[i-1];
            }else{

                time +=(long) n - tasksIndex[i-1] + tasksIndex[i];
            }
        }
       System.out.println((time));
       


      

    }
}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

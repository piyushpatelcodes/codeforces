import java.util.*;

public class drinks{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        
        scanner.close();
        
        float average=0;
       for(int i : arr){
        average += i;
       }
       average = average/n;
       System.out.println(average);
        
    }


}

// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

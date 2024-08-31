import java.util.*;

public class jeff_and_Digits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int countOfZeros = 0;
        int countOfFives = 0;
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();

            if(arr[i] == 5){
                countOfFives++;
            }
            else{
                countOfZeros++;
            }
        }
        scanner.close();

        if(countOfZeros==0){
            System.out.println(-1);
            return;

        }

        int maxFiveCountRequired = (countOfFives/9 ) *9;
        

        if(maxFiveCountRequired == 0){
            System.out.println(0);
        }
        else{
            StringBuilder res = new StringBuilder();
            for(int i=0; i<maxFiveCountRequired; i++){
                res.append("5");
            }
            for(int i=0; i<countOfZeros; i++){
                res.append("0");
            }
            System.out.println(res.toString());
        }




      

    }
}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

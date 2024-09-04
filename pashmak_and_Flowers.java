import java.util.Scanner;

public class pashmak_and_Flowers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] beauty = new long[n];
        
        for (int i = 0; i < n; i++) {
            beauty[i] = scanner.nextLong();
        }
        
        long minBeauty = beauty[0], maxBeauty = beauty[0];
        long countMin = 0, countMax = 0;
        

        for (int i = 0; i < n; i++) {
            if (beauty[i] < minBeauty) {
                minBeauty = beauty[i];
            }
            if (beauty[i] > maxBeauty) {
                maxBeauty = beauty[i];
            }
        }
        
        for (int i = 0; i < n; i++) {
            if (beauty[i] == minBeauty) {
                countMin++;
            }
            if (beauty[i] == maxBeauty) {
                countMax++;
            }
        }
        
        long maxDifference = maxBeauty - minBeauty;
        long numberOfWays;
        
        if (maxBeauty == minBeauty) {

            numberOfWays = (long)n * (n - 1) / 2;
        } else {
            numberOfWays = countMin * countMax;
        }
        
        System.out.println(maxDifference + " " + numberOfWays);
        scanner.close();
        


        //FAILED Approach Due to TIME LIMIT EXCEED - O(n^2) time complexity

        // long numOfWays=0;

        // for(long i=0; i<n; i++){
        //     for(long j=0; j<n; j++){
        //         if(i!=j){
        //             long diff = Math.abs(arr[i] - arr[j]);
        //             if(diff == beautyDifference){
        //                 numOfWays++;
        //             }
        //         }
        //     }
        // }

        // System.out.prlongln(beautyDifference +" "+ numOfWays/2);



    }
}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/


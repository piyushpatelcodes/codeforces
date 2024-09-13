import java.util.*;

public class appleman_and_Card_Game {

    public static final int MOD = 1000000007;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long k = scanner.nextLong();
        String s = scanner.next();

        long[] frequencyArray = new long[26]; 

        for (char c : s.toCharArray()) {
            frequencyArray[c - 'A']++;
        }
       

        Arrays.sort(frequencyArray);
        
        long ans=0;

        for(int i=25; i>=0 && k > 0; i--){
            if (frequencyArray[i] > 0) {
                long pick = Math.min(frequencyArray[i], k);
                ans += (long) pick * pick; 
                k -= pick;
            }

        }

        System.out.println(ans);
    

    }

}


// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

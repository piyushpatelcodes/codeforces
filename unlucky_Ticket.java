import java.util.*;

public class unlucky_Ticket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String ticket = scanner.next();

        int[] firstHalf = new int[n];
        int[] secondHalf = new int[n];


        for (int i = 0; i < n; i++) {
            firstHalf[i] = ticket.charAt(i) - '0';
            secondHalf[i] = ticket.charAt(i + n) - '0';
        }


        Arrays.sort(firstHalf);
        Arrays.sort(secondHalf);

        boolean strictlyLess = true;
        boolean strictlyMore = true;

        for(int i=0; i<n; i++){
            if(firstHalf[i] >= secondHalf[i]){
                strictlyLess = false; break;
            }

        }

        for(int i=0; i<n; i++){
            if(firstHalf[i] <= secondHalf[i]){
                strictlyMore = false; break;
            }

        }

        if (strictlyLess || strictlyMore) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }

    
}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

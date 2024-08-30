import java.util.*;

public class jzzhu_and_Children {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] candiesNeeded = new int[n];
        for(int i=0;i<n;i++){
            candiesNeeded[i]= scanner.nextInt();
        }
        scanner.close();

        // i am using queue to store indies not candies;
        // now i will juggle indices to get answer;

        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<n; i++){
            q.offer(i); 
        }
        
        int lastChild = -1;
        while (!q.isEmpty()) {
            int current = q.poll();
            candiesNeeded[current] -= m; 
            if (candiesNeeded[current] > 0) {
                q.offer(current); 
            }
            lastChild = current; 
        }
        
        System.out.println(lastChild+1);

        



    }
}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

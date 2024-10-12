import java.util.*;

public class seating_in_a_Bus{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();

            }

            boolean[] visited = new boolean[n+2];

            boolean follow = true;

            for(int i=0; i<n-1; i++){
            
                int seat =arr[i];

                if(i>0){
                    if(!visited[seat-1] && !visited[seat+1]){
                        follow = false; break;

                    }
                }
                visited[seat] = true;
            }

            if(follow){
                System.out.println("YES");

            }else{
                System.out.println("NO");

            }

        }
    }
}


// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

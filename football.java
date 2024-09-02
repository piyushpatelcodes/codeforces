import java.util.*;

public class football{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        Map<String, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            String input = sc.next();

            map.put(input, map.getOrDefault(input, 0)+1);
        }

        String winningTeam = null;
        int maxGoals = 0;

        for(Map.Entry<String,Integer> entry : map.entrySet()){
            if(entry.getValue() > maxGoals){
                maxGoals = entry.getValue();
                winningTeam = entry.getKey();

            }
        }

        System.out.println(winningTeam);

        sc.close();

        
       
    }
}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

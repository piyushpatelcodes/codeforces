import java.util.*;

public class free_Cash {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map< List<Integer> ,Integer> map = new HashMap<>();

        
        for(int i=0; i<n; i++){
            int h = scanner.nextInt();
            int m = scanner.nextInt();
            List<Integer> time = Arrays.asList(h, m);

            map.put(time, map.getOrDefault(time, 0)+1);
        }

        int maxCount =Integer.MIN_VALUE; 
        for(Map.Entry<List<Integer> ,Integer> entry : map.entrySet()){
            if(entry.getValue() > maxCount){
                maxCount = entry.getValue();
            }

        }
        System.out.println(maxCount);


    }

}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

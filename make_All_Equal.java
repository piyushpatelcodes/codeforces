import java.util.*;

public class make_All_Equal{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
                
            }

            Map<Integer,Integer> map = new HashMap<>();
            for(int i : arr){
                map.put(i, map.getOrDefault(i, 0)+1);
            }

            int maxCount=0;
            int mostFrequent = arr[0];

            for(Map.Entry<Integer,Integer> entry : map.entrySet()){
                if (entry.getValue() > maxCount) {
                    maxCount = entry.getValue();
                    mostFrequent = entry.getKey();
                }
            }

            System.out.println((n-maxCount));

        }
    }
}

// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

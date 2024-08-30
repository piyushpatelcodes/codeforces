import java.util.*;

public class effective_Approach {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Map<Integer, Integer> map = new HashMap<>();

        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
            map.put(arr[i], i+1);

        }

        int m = scanner.nextInt();
        int[] query = new int[m];
        
        long vasyaComparisions=0;
        long petyaComparisions = 0;
        for(int i=0; i<m; i++){
            query[i] = scanner.nextInt();
            int position = map.get(query[i]);

            vasyaComparisions += position;
            petyaComparisions += arr.length- position + 1;
        }

        System.out.println(  vasyaComparisions + " "+ petyaComparisions );


        



        scanner.close();

        



    }
}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

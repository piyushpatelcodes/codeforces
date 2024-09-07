import java.util.*;

public class yaroslav_and_Permutations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            frequencyMap.put(arr[i], frequencyMap.getOrDefault(arr[i], 0) + 1);
        }
        
        int maxFreq = 0;
        for (int freq : frequencyMap.values()) {
            maxFreq = Math.max(maxFreq, freq);
        }
        
        if (maxFreq <= (n + 1) / 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    
}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

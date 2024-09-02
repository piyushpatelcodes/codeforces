import java.util.*;

public class KString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int k = sc.nextInt();
        String s = sc.next();

        Map<Character, Integer> map = new HashMap<>();
        
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        StringBuilder base = new StringBuilder();
        
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() % k != 0) {
                System.out.println(-1);
                sc.close();
                return;
            }
            for (int i = 0; i < entry.getValue() / k; i++) {
                base.append(entry.getKey());
            }
        }
        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < k; i++) {
            result.append(base);
        }
        
        System.out.println(result.toString());
        sc.close();
    }
}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

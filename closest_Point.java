import java.util.*;

public class closest_Point {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        
        for (int i = 0; i < testCases; i++) {
            int n = scanner.nextInt();
            int[] points = new int[n];
            
            for (int j = 0; j < n; j++) {
                points[j] = scanner.nextInt();
            }
            
            System.out.println(solution(points, n));
        }
        
        scanner.close();
    }


    public static String solution(int[] points, int n) {
        Arrays.sort(points);
        
        if (points[0] + 1 >= points[1]) {
            return "NO";
        }
        
        int pt = points[1] - 1;
        
        for (int i = 1; i < n - 1; i++) {
            if (Math.abs(pt - points[i]) > Math.min(Math.abs(points[i] - points[i - 1]), Math.abs(points[i] - points[i + 1]))) {
                return "NO";
            }
        }
        
        if (Math.abs(points[n - 1] - points[n - 2]) < Math.abs(pt - points[n - 1])) {
            return "NO";
        }
        
        return "YES";
    }

    
}

// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

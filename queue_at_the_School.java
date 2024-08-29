import java.util.Scanner;

public class queue_at_the_School {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt(); // number of children
        int t = scanner.nextInt(); // number of seconds
        String s = scanner.next(); // initial arrangement

        char[] queue = s.toCharArray(); 

        // Simulate each second
        for (int pass = 0; pass < t; pass++) {
            for (int i = 0; i < n - 1; i++) {
                // If there is a 'B' followed by a 'G', swap them
                if (queue[i] == 'B' && queue[i + 1] == 'G') {
                    // Swap
                    queue[i] = 'G';
                    queue[i + 1] = 'B';
                    // Skip the next index to prevent double swap in this second
                    i++;
                }
            }
        }

        System.out.println(new String(queue));
    }
}

// Solution by piyush patel codes https://codeforces.com/submissions/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

import java.util.*;

public class  comparing_Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        if (s1.length() != s2.length()) {
            System.out.println("NO");
            return;
        }

        List<Integer> diffPositions = new ArrayList<>();

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                diffPositions.add(i);
            }
        }
        

        if (diffPositions.size() == 2) {
            int pos1 = diffPositions.get(0);
            int pos2 = diffPositions.get(1);
            

            if (s1.charAt(pos1) == s2.charAt(pos2) && s1.charAt(pos2) == s2.charAt(pos1)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {

            System.out.println("NO");
        }
        
        
       
    }
}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

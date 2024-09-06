import java.util.*;

public class letter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();

        for(char c : s1.toCharArray()){
            if(c != ' '){
                map1.put(c, map1.getOrDefault(c,0)+1);
            }
        }

        for(char c : s2.toCharArray()){
            if(c!= ' '){
                map2.put(c, map2.getOrDefault(c,0)+1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map2.entrySet()) {
            char letter = entry.getKey();
            int requiredCount = entry.getValue();
            
            if (map1.getOrDefault(letter, 0) < requiredCount) {
                System.out.println("NO");
                return; 
            }
        }
        
        System.out.println("YES");





        //  CORRECT Approach below But It is SLOW as compared to above HASHMAP Approach

        // s1 = s1.replace(" ", "");
        // s2 = s2.replace(" ", "");


        // for(char c : s2.toCharArray()){
        //     if(s1.contains(String.valueOf(c))){
        //         s1 = s1.replaceFirst(String.valueOf(c), "");
        //     }
        //     else{
        //         System.out.println("NO"); return;
        //     }
        // }

        // System.out.println("YES");

    }
}

// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

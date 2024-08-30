import java.util.*;

public class amusing_Joke {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();
        String s3 = scanner.next();
        
        scanner.close();

        Map<Character,Integer> map = new HashMap<>();


        for(int i=0; i<s3.length(); i++ ){
            map.put(s3.charAt(i), map.getOrDefault(s3.charAt(i), 0)+1);
        }

        for(int i=0; i<s1.length(); i++){
            if(map.containsKey(s1.charAt(i))){
                int count = map.get(s1.charAt(i));

                if(count > 1){
                    map.put(s1.charAt(i), count - 1);
                }
                else{
                    map.remove(s1.charAt(i));
                }
            }
            else{
                System.out.println("NO"); return;
            }
        }

        for(int i=0; i<s2.length(); i++){
            if(map.containsKey(s2.charAt(i))){
                int count = map.get(s2.charAt(i));

                if(count > 1){
                    map.put(s2.charAt(i), count - 1);
                }
                else{
                    map.remove(s2.charAt(i));
                }
            }
            else{
                System.out.println("NO"); return;
            }
        }

        if(map.size() >=1){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }        
        
        


        
    }
}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

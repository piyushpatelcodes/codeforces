import java.util.*;

public class minimize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        while(n-- >0){
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            int minValue = Integer.MAX_VALUE;

            for(int i=a; i<=b; i++){
                int intermidiate = (i-a) + (b-i);
                if(minValue >= intermidiate){
                    minValue = intermidiate;
                    
                }
            }
            System.out.println(minValue);
        }


    }

}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

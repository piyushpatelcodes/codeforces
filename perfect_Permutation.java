import java.util.*;

public class perfect_Permutation{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if(n%2 != 0){
            System.out.println(-1);
        }
        else{
            for(int i=1; i<=n; i+=2){
                System.out.print((i + 1) + " " + i + " ");
            }
        }
        

        scanner.close();
    }
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

}

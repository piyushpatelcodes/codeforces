import java.util.*;

public class again_Twenty_Five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        // i am using power cycle concept of 5
        // also called cyclicity of 5

        if(n==0){
            System.out.println("01");
        }
        else if(n==1){
            System.out.println("05");
        }
        else{
            System.out.println("25");
        }



    }
}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

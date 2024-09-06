import java.util.*;

public class kithara_and_Harukis_Gift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int countOf100s=0; int countOf200s=0;
        for(int i=0; i<n;i++){
            int input = scanner.nextInt();
            if(input == 100){
                countOf100s++;
            }
            else{
                countOf200s++;
            }
        }
     

        int leftOversOf200s = countOf200s%2;
        int leftOversOf100s = countOf100s - (leftOversOf200s*2);

        if(leftOversOf100s >=0 && leftOversOf100s%2==0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }


        
       
    }
}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

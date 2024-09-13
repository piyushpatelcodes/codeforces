import java.util.*;

public class adding_Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int  n = scanner.nextInt();

        for(int i=0; i<=9; i++){
            int newNumber = a * 10 + i;

            if(newNumber%b == 0){
                a = newNumber;
                break;
            }

            if (i == 9) {
                System.out.println(-1);
                return;
            }
        }

        System.out.print(a);
        for (int i = 0; i < n - 1; i++) {
            System.out.print(0);
        }
        

    }
}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

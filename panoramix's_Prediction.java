import java.util.*;

public class panoramixs_Prediction{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        if(isNextPrime(n,m)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        
        scanner.close();
    }

    private static boolean isNextPrime(int n, int m) {
        int nextNumber = n + 1;
        while (!isPrime(nextNumber)) {
            nextNumber++;
        }


        return nextNumber == m;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number <= 3) return true;
        if (number % 2 == 0 || number % 3 == 0) return false;
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) return false;
        }
        return true;
    }


}

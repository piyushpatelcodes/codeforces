import java.util.*;

public class a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        int l=0; int r = n-1;
        while(l<n-1 && arr[l] <= arr[l+1]){
            l++;
        }

        if (l == n - 1) {
            System.out.println("yes");
            System.out.println(1 + " " + 1);  
            return;
        }

        while(r > 0 && arr[r] >= arr[r-1]){
            r--;
        }

        reverse(arr, l ,r);

        if (isSorted(arr)) {
            System.out.println("yes");
            System.out.println((l + 1) + " " + (r + 1));
        } else {
            System.out.println("no");
        }
        
        scanner.close();

        

    }

    public static void reverse(int[] arr, int l , int r){
        while(l<r){
            int temp = arr[l];
            arr[l]= arr[r];
            arr[r] = temp;

            l++;
            r--;
        }

    }

    public static boolean isSorted(int[] a){
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1]) {
                return false;
            }
        }
        return true;
    }

}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

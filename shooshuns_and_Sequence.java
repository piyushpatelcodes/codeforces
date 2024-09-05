import java.util.*;

public class shooshuns_and_Sequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int  k = scanner.nextInt();
        // k--;  // just to match my 0 based Indexing Code

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();

        }

        int target  =arr[k-1];
        boolean isSuffixHomogeneous = true;
        for(int i=k; i<n; i++){
            if(arr[i] != target){
                isSuffixHomogeneous = false;
                break;
            }
        }

        if(!isSuffixHomogeneous){
            System.out.println(-1); return;
        }

        int lastDifferent = -1;
        for(int i=0; i<n; i++){
            if(arr[i] != target){
                lastDifferent = i;
            }
        }

        if(lastDifferent == -1){
            System.out.println(0);   // already all same
        }
        else{
            System.out.println(lastDifferent+1);
        }



        // FAILED Approach Because TIME LIMIT EXCEED. SAD

    //     List<Integer> arr = new ArrayList<>();

    //     for(int i=0; i<n; i++){
    //         int input = scanner.nextInt();
    //         arr.add(input);

    //     }

    //     List<Integer> original = new ArrayList<>(arr);

    //     int countOfOperations=0;

    //     while(!allElementsSameCheck(arr)){
    //         int num = arr.get(k);

    //         arr.add(num);
    //         arr.remove(0);
    //         countOfOperations++;
    //         if(checkOriginal(arr, original)){
    //             System.out.println(-1); return;
    //         }
    //     }
    //     System.out.println(countOfOperations);
        
        
    // }

    // private static boolean checkOriginal(List<Integer> arr, List<Integer> original) {
    //     for(int i=0; i<arr.size(); i++){
    //         if(arr.get(i) != original.get(i)){
    //             return false;
    //         }
    //     }

    //     return true;
    // }

    // private static boolean allElementsSameCheck(List<Integer> arr) {
    //     for(int i=0; i<arr.size()-1; i++){
    //         if(arr.get(i) != arr.get(i+1)){
    //             return false;
    //         }
    //     }

    //     return true;
        
    }
}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

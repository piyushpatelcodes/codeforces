import java.util.*;

public class i_love_username{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        int count = 0;
        Set<Integer> set = new HashSet<>(); // using this set is really OPTIONAL, it is not really doing AnyThing
        int minElement = arr[0];
        int maxElement = arr[0];



        for(int i=1; i<n; i++){
            if((arr[i- 1] > arr[i]) || (arr[i -1] < arr[i]) && (!set.contains(arr[i]))){
                if(arr[i] < minElement){
                    count++;
                    minElement = arr[i];
                }
                else if(arr[i] > maxElement){
                    count++;
                    maxElement = arr[i];
                }
                
                set.add(arr[i]);
            }
        }
        System.out.println(count);
        

    }

}

// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

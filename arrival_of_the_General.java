import java.util.*;

public class arrival_of_the_General{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        
        scanner.close();

        int maxHeight = -1;
        int minHeight = 101;
        int minHeightIndex = -1;
        int maxHeightIndex=-1;

        for(int i=0; i<arr.length; i++){
            if(arr[i] > maxHeight){
                maxHeight = arr[i];
                maxHeightIndex = i;
            }
            if(arr[i] <= minHeight){
                minHeight =arr[i];
                minHeightIndex = i;
            }
        }

        int swapsForMaxHeight = maxHeightIndex;
        int swapsForMinHeight = (n-1) - minHeightIndex;

        if(maxHeightIndex > minHeightIndex){
            swapsForMinHeight--;
        }
        System.out.println((swapsForMaxHeight + swapsForMinHeight));

        
    }


}

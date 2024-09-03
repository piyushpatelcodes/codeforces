import java.util.*;

public class airport{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] emptySeats = new int[m];

        for(int i=0; i<m; i++){
            emptySeats[i] = scanner.nextInt();
        }

        int maxEarningResult = maxEarning(emptySeats, n);
        int minEarningResult = minEarning(emptySeats, n);
        

        System.out.println(maxEarningResult +" "+ minEarningResult);

        scanner.close();


    }

    public static int maxEarning(int[] emptySeats, int n){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int seat : emptySeats){
            maxHeap.add(seat);
        }

        int maxEarnings = 0;

        for (int i = 0; i < n; i++) {
            int maxSeat = maxHeap.poll(); 
            maxEarnings += maxSeat;
            if (maxSeat > 1) {
                maxHeap.add(maxSeat - 1); 
            }
        }

        return maxEarnings;
    }
    public static int minEarning(int[] emptySeats, int n){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int seat : emptySeats){
            minHeap.add(seat);
        }

        int minEarnings = 0;

        for (int i = 0; i < n; i++) {
            int minSeat = minHeap.poll();
            minEarnings += minSeat;
            if (minSeat > 1) {
                minHeap.add(minSeat - 1); 
            }
        }

        return minEarnings;
    }
}

// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

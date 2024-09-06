import java.util.*;

public class xenia_and_Divisors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); 
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        Map<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            if (i != 1 && i != 2 && i != 3 && i != 4 && i != 6) {
                System.out.println(-1); // Invalid number found, output -1 immediately
                return;
            }
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        int countof1 = 0; int countof2 = 0;
        int countof3 = 0; int countof4 = 0; int countof6 = 0;

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getKey() == 1){
                 countof1 = entry.getValue();
            }
            else if(entry.getKey() == 2){
                countof2 = entry.getValue();
            }
            else if(entry.getKey() == 3){
                countof3 = entry.getValue();
            }
            else if(entry.getKey() == 4){
                countof4 = entry.getValue();
            }
            else if(entry.getKey() == 6){
                countof6 = entry.getValue();
            }
        }

        if(countof1 == 0 && countof2==0 && countof3==0 && countof4==0 && countof6==0){
            System.out.println(-1); return;
        }

        List<String> result = new ArrayList<>();

        while (countof1 > 0 && countof2 > 0 && countof4 > 0) {
            result.add("1 2 4");
            countof1--;
            countof2--;
            countof4--;
        }
        
        while (countof1 > 0 && countof2 > 0 && countof6 > 0) {
            result.add("1 2 6");
            countof1--;
            countof2--;
            countof6--;
        }
        
        while (countof1 > 0 && countof3 > 0 && countof6 > 0) {
            result.add("1 3 6");
            countof1--;
            countof3--;
            countof6--;
        }

        if (countof1 > 0 || countof2 > 0 || countof3 > 0 || countof4 > 0 || countof6 > 0) {
            System.out.println(-1); 
        } else {
            for (String triplet : result) {
                System.out.println(triplet); 
            }
        }
            
        

        

    }
}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

import java.util.*;

public class sale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); 
        int m = sc.nextInt(); 
        
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt(); 
        }
        
        sc.close();
        
        List<Integer> negativePrices = new ArrayList<>();
        for (int price : prices) {
            if (price < 0) {
                negativePrices.add(price);
            }
        }
        
        Collections.sort(negativePrices);
        
        int sum = 0;

        for (int i = 0; i < Math.min(m, negativePrices.size()); i++) {
            sum += negativePrices.get(i); 
        }
        
        System.out.println(Math.abs(sum));
    }
}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

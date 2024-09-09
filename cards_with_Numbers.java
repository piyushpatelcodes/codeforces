import java.io.*;
import java.util.*;

public class cards_with_Numbers {
    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));

            int n = Integer.parseInt(br.readLine());  
            String[] inputs = br.readLine().split(" ");  
            

            Map<Integer, List<Integer>> map = new HashMap<>();
            

            for (int i = 0; i < 2 * n; i++) {
                int cardValue = Integer.parseInt(inputs[i]);
                map.putIfAbsent(cardValue, new ArrayList<>());
                map.get(cardValue).add(i + 1);  // Store 1-based index
            }

            List<int[]> result = new ArrayList<>();
            

            for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
                List<Integer> indices = entry.getValue();
                

                if (indices.size() % 2 != 0) {
                    bw.write("-1\n");
                    bw.close();
                    return;
                }
                

                for (int i = 0; i < indices.size(); i += 2) {
                    result.add(new int[]{indices.get(i), indices.get(i + 1)});
                }
            }


            for (int[] pair : result) {
                bw.write(pair[0] + " " + pair[1] + "\n");
            }
            

            bw.close();
            br.close();
        } catch (NumberFormatException e) {

            e.printStackTrace();
        }
    }
}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

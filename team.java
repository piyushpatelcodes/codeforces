import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine().trim());
        int count = 0;

        for (int i = 0; i < n; i++) {
            String[] inputs = reader.readLine().trim().split(" ");
            int petya = Integer.parseInt(inputs[0]);
            int vasya = Integer.parseInt(inputs[1]);
            int tonya = Integer.parseInt(inputs[2]);

            if (petya + vasya + tonya >= 2) {
                count++;
            }
        }

        System.out.println(count);
    }
}

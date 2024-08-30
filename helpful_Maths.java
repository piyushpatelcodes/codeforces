import java.util.*;

public class helpful_Maths {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        StringBuilder result = new StringBuilder();

        input = input.replace("+", " ");
        String[] strArray = input.split(" ");
        
        int[] numbers = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            numbers[i] = Integer.parseInt(strArray[i]);
        }
        
        Arrays.sort(numbers);
        
        for (int i = 0; i < numbers.length; i++) {
            result.append(numbers[i]);
            if (i < numbers.length - 1) {
                result.append("+");
            }
        }

        System.out.println(result.toString());

        scanner.close();
    }
}

// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

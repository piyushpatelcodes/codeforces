import java.io.*;
import java.util.*;

public class boys_and_Girls {
    public static void main(String[] args) {
        try {
            File inputFile = new File("input.txt");
            Scanner scanner = new Scanner(inputFile);

            int n = scanner.nextInt(); 
            int m = scanner.nextInt(); 
            scanner.close();

            StringBuilder result = new StringBuilder();

            if (n >= m) {

                while (n > 0 || m > 0) {
                    if (n > 0) {
                        result.append("B");
                        n--;
                    }
                    if (m > 0) {
                        result.append("G");
                        m--;
                    }
                }
            } else {
                while (n > 0 || m > 0) {
                    if (m > 0) {
                        result.append("G");
                        m--;
                    }
                    if (n > 0) {
                        result.append("B");
                        n--;
                    }
                }
            }

            PrintWriter outputWriter = new PrintWriter("output.txt");
            outputWriter.println(result.toString());
            outputWriter.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while reading or writing the file.");
            e.printStackTrace();
        }
    }
}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

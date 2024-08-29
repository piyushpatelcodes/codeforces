import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading Vasya's coordinates
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        
        // Reading the coordinates of the box's vertex opposite to (0, 0, 0)
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int z1 = scanner.nextInt();
        
        // Reading the numbers on the faces of the box
        int[] faces = new int[6];
        for (int i = 0; i < 6; i++) {
            faces[i] = scanner.nextInt();
        }
        
        // Variable to store the sum of the visible numbers
        int visibleSum = 0;
        
        // Checking visibility of each face and summing the visible numbers
        if (y < 0) {
            visibleSum += faces[0]; // Face on the ZOX plane (y = 0)
        }
        if (y > y1) {
            visibleSum += faces[1]; // Face parallel to the ZOX plane (y = y1)
        }
        if (z < 0) {
            visibleSum += faces[2]; // Face on the XOY plane (z = 0)
        }
        if (z > z1) {
            visibleSum += faces[3]; // Face parallel to the XOY plane (z = z1)
        }
        if (x < 0) {
            visibleSum += faces[4]; // Face on the YOZ plane (x = 0)
        }
        if (x > x1) {
            visibleSum += faces[5]; // Face parallel to the YOZ plane (x = x1)
        }
        
        System.out.println(visibleSum);
        
        scanner.close();
    }
}

// Solution by piyush patel codes https://codeforces.com/submissions/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

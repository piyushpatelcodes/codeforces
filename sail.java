import java.util.Scanner;

public class sail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();  
        int sx = scanner.nextInt(); 
        int sy = scanner.nextInt(); 
        int ex = scanner.nextInt(); 
        int ey = scanner.nextInt(); 
        String s = scanner.next();  
        

        double currentDistance = getDistance(sx, sy, ex, ey);
        int minTime = 0;


        for (int i = 0; i < t; i++) {
            char direction = s.charAt(i);
            

            int newSx = sx;
            int newSy = sy;
            
            if (direction == 'N') {
                newSy += 1;
            } else if (direction == 'S') {
                newSy -= 1;
            } else if (direction == 'E') {
                newSx += 1;
            } else if (direction == 'W') {
                newSx -= 1;
            }
            

            double newDistance = getDistance(newSx, newSy, ex, ey);
            

            if (newDistance < currentDistance) {
                sx = newSx;
                sy = newSy;
                currentDistance = newDistance; 
                
            }
            

            minTime++;
            if (sx == ex && sy == ey) {
                System.out.println(minTime); 
                
                return;
            }
        }
        

        System.out.println(-1);
    }

    public static double getDistance(int sx, int sy, int ex, int ey) {
        return Math.sqrt(Math.pow(ex - sx, 2) + Math.pow(ey - sy, 2));
    }
}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

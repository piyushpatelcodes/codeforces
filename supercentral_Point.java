import java.util.*;

public class supercentral_Point {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();

        int[][] points = new int[n][2];

        for(int i=0;i<n;i++){
            points[i][0] = scanner.nextInt();
            points[i][1] = scanner.nextInt();
        }

        scanner.close();

        int superCentralPoints = 0;

        for(int i=0; i<n; i++){
            int x = points[i][0];
            int y = points[i][1];

            boolean hasUp = false;
            boolean hasDown = false;
            boolean hasLeft = false;
            boolean hasRight = false;

            for(int j=0; j<n;j++){
                if(i!=j){
                    int xj = points[j][0];
                    int yj = points[j][1];

                    if((xj > x) && (yj == y)){
                        hasRight = true;
                    }
                    if((xj < x && yj == y)){
                        hasLeft = true;
                    }
                    if (xj == x && yj > y) hasUp = true;  
                    if (xj == x && yj < y) hasDown = true;


                }

                
            }
            
            if(hasDown && hasLeft && hasRight && hasUp){
                    superCentralPoints++;
                }
        }
        System.out.println(superCentralPoints);
        



    }
}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

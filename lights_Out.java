import java.util.*;

public class lights_Out{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int[][] input = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                input[i][j]= scanner.nextInt();
            }
        }

        int[][] result = {{1,1,1},{1,1,1},{1,1,1}};

        for(int i=0; i<3; i++){
            for(int j=0; j<3;j++){
                int totalPresses = input[i][j];

                if(i>0){
                    totalPresses += input[i-1][j];
                }
                if(i<2){
                    totalPresses += input[i+1][j];
                }
                if(j>0){
                    totalPresses += input[i][j-1];
                }
                if(j<2){
                    totalPresses += input[i][j+1];
                }

                if (totalPresses % 2 != 0) {
                    result[i][j] = 0; 
                }

                
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
        
        scanner.close();
        
    }


}

// Solution by piyush patel codes https://codeforces.com/submissions/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

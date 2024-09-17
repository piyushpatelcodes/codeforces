import java.util.*;

public class sum_of_Round_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        while (t-- > 0) {
            String n = scanner.next();
            List<Integer> arr = new ArrayList<>();
            int lengthOftens = n.length();
            for(char c : n.toCharArray()){
                if(lengthOftens==1 && Character.getNumericValue(c) != 0){
                    arr.add(Character.getNumericValue(c));
                }
                else{
                    if(Character.getNumericValue(c) != 0){
                        arr.add(Character.getNumericValue(c)*(int)Math.pow(10, lengthOftens-1));

                    }
                    
                }
                lengthOftens--;
                

            }

            System.out.println(arr.size());

            for(int i : arr){
                System.out.print(i + " ");
            }
            System.out.println();

        }

    }

    
}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

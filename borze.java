import java.util.*;

public class borze{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        String s = scanner.next();

        char[] arr = s.toCharArray();
        StringBuilder result = new StringBuilder();

        for(int i=0; i<arr.length; i++){
            if(arr[i] == '.'){
                result.append(0);
            }
            if(arr[i] == '-'){
                if(i + 1 < arr.length && arr[i+1] == '-'){
                    result.append(2);
                }
                else if(i + 1 < arr.length && arr[i+1] == '.'){
                    result.append(1);
                }
                i++;
            }
        }
        System.out.println(result);
    }

}

// Solution by piyush patel codes https://codeforces.com/submissions/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

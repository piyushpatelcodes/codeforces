import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class a{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
  Set<Integer> set= new HashSet<>();
      for(int i=0; i<4; i++){
      set.add(sc.nextInt());
      }
  if(set.size() == 4){
  System.out.println(0);
    }
  else{System.out.println(4 - set.size());
  }
  sc.close();
  
  }}

// Solution by piyush patel codes https://codeforces.com/submissions/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/

import java.util.*;

public class satyam_and_counting{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();

        


        while(t-- >0){
            int n = sc.nextInt();
            Map<Integer,Integer> map1 = new HashMap<>();
        Map<Integer,Integer> map2 = new HashMap<>();
            for(int i=0; i<n; i++){
                int x = sc.nextInt();
                int y = sc.nextInt();
                if(y==0){
                    map1.put(x, map1.getOrDefault(x,0)+1);

                }
                else{
                    map2.put(x,map2.getOrDefault(x, 0)+1);

                }


            }
            System.out.println(solve(map1,map2,n));

            


        }

    }

    public static long solve(Map<Integer,Integer> map1, Map<Integer,Integer> map2, int n){
        long ans=0;

        for(Map.Entry<Integer,Integer> entry : map1.entrySet()){
            int key  = entry.getKey();
            if(map2.containsKey(key)){
                ans += (long) n-2;

            }

        }

        for(Map.Entry<Integer,Integer> entry : map1.entrySet())
        {
            int x1 = entry.getKey()-1;
            int x2 = entry.getKey()+1;
            if(map2.containsKey(x1) && map2.containsKey(x2)){
                ans++;

            }

        }

        for(Map.Entry<Integer,Integer> entry : map2.entrySet()){
            int x1 = entry.getKey()-1;
            int x2 = entry.getKey()+1;
            if(map1.containsKey(x1) && map1.containsKey(x2)){
                ans++;

            }
        }


        return ans;

    }
}

import java.util.*;

public class klees_super_duper_large_array{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        long t = sc.nextLong();

        


        while(t-- >0){
            long n = sc.nextLong();
            long  k = sc.nextLong();

            long left = k; 
            long right = k+n-1;
            long ans = Integer.MAX_VALUE;

            while(left <= right){
                long mid = (left + right) /2;
                long sum1 = getSum(k,mid);
                long sum2 = getSum(mid+1,k+n-1);
                ans = Math.min(ans, Math.abs(sum1-sum2));
                if(sum1 > sum2){
                    right = mid-1;

                }else{
                    left=mid+1;

                }



            }

            System.out.println(ans);



            

            


        }

    }

    public static long getSum(long l,long r){
        return (r*(r+1)/2) - (l*(l-1)/2);


    }

   

    
}


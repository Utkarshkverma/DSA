package Striver;
import java.util.*;
public class Fibonacchi
{
    public static void main(String args[])
    {
        System.out.println(find(8));
        System.out.println(tabulation(8));
        System.out.println(tabulation(0));
        System.out.println(SpaceOptimization(8));
    }

    public static int find(int n) 
    {
       int dp[] = new int[n+1];
       Arrays.fill(dp,-1);
       return find(n,dp);
    }

    // ! Memoization  = Required to base then come back
    public static int find(int n,int dp[]) // ! Tc O(n)  SC = O(n) + O(n)
    {
      if(n<=1) return n;
      if(dp[n] != -1) return dp[n];

      return dp[n] =  find(n-1,dp)+find(n-2,dp);
    }

    // ! Tabulation = Base case to answer
    public static int tabulation(int n,int  dp[]) // ! Eliminated the space for recursion Stack
    {
        if(n<=1) return n;
         dp[0] = 0;
         dp[1] = 1;

         if(n >= 2 ){
         for(int i=2;i<=n;i++)
         {
            dp[i] = dp[i-1]+dp[i-2];
         }
        }
         return dp[n];
    }

    public static int tabulation(int n)
    {
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        return tabulation(n,dp);
    }

    // ! Space Optimization
    public static int SpaceOptimization(int n)
    {
        if (n <= 1) return n;
        int prev2 = 0;
        int prev = 1;

        for(int i = 2;i<=n;i++) // ! Since it will go for n+1 times then the value is stored in prev
        {
            int curr = prev+prev2;
            prev2 = prev;
            prev = curr;

        }

        return prev;

    }
}
package DP.Striver;
import java.util.*;
public class ClimbStairs {

    public static void main(String[] args) {
        System.out.println(countWays(2));
        tabulation(2);
        SpaceOptimization(3);

    }

    public static int countWays(int n,int dp[]) // ! Memoization
    {
       if (n == 0 || n == 1) return 1;
       if (dp[n] != -1 )return dp[n];
        return dp[n] =  countWays(n-1,dp) + countWays(n-2,dp);
    }

    public static int countWays(int n){
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return countWays(n,dp);
    }

    public static void tabulation(int n)
    {
        int dp[] = new int[n+1];
        dp[0]=1;
        dp[1] = 1;

        for(int i = 2;i<=n;i++)
        {
            dp[i] = dp[i-1]+dp[i-2];
        }
        System.out.println(dp[n]);
    }

    public static void SpaceOptimization(int n)
    {
        int prev2 = 1;
        int prev1 = 1;

        for(int i = 2;i<=n;i++)
        {
            int curr = prev2+prev1;
            prev2 = prev1;
            prev1 = curr;
        }


        System.out.println(prev1);
    }
    
}

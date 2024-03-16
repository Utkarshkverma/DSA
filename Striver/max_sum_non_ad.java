package Striver;
import java.util.*;
public class max_sum_non_ad {
    public static void main(String[] args) {
        int arr[] ={2, 1, 4, 9};

        System.out.println(findMaxSumNonAdjacent(arr));

        tabulation(arr);
        space_optimization(arr);
    }

    public static int  findMaxSumNonAdjacent(int arr[],int ind,int dp[]){
        if(ind == 0) return arr[0];
        if(ind<0) return 0;
        
        if(dp[ind] != -1) return dp[ind];
        int pick = arr[ind]+ findMaxSumNonAdjacent(arr, ind-2, dp);
        int not_pick = 0 + findMaxSumNonAdjacent(arr, ind-1, dp);

        return dp[ind] = Math.max(pick,not_pick);
    }


    public static int findMaxSumNonAdjacent(int arr[])
    {
        int n = arr.length;
        int dp[] = new int[n];
        Arrays.fill(dp,-1);

        return findMaxSumNonAdjacent(arr, n-1, dp);
    }



    public static void tabulation(int arr[])
    {
        int dp[] = new int[arr.length];
        dp[0] = arr[0];

        for(int i = 1;i<arr.length;i++)
        {
            int pick = arr[i];
            if (i > 1)
                pick += dp[i - 2];
            int nonPick = dp[i - 1];
            dp[i] = Math.max(pick, nonPick);
        }

        System.out.println(Arrays.toString(dp));
    }

    public static void space_optimization(int arr[]){
        int n=arr.length;
        int prev = arr[0];
        int prev2 = 0;

        for(int i = 1;i<n;i++)
        {
            int pick = arr[i];
            if(i>1) pick += prev2;

            int not_pick = prev;

            int curr = Math.max(pick,not_pick);
            prev2 = prev;
            prev = curr;
        }

        System.out.println(prev);
    }
    
}

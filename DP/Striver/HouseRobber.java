package DP.Striver;
import java.util.*;
public class HouseRobber {
    public static void main(String[] args) {
        
        int arr[] = {1,5,1,2,6};
        System.out.println(max_robbary(arr));
        System.out.println(tab_robbery(arr));
    }
    public static int find(int arr[],int ind, int dp[])
    {
     if(ind == 0) return arr[0];
     if(ind<0) return 0;
     if(dp[ind] != -1) return dp[ind];
     int pick = arr[ind]+find(arr,ind-2,dp);
     int not_pick = 0+ find(arr, ind-1, dp);

     return dp[ind] = Math.max(pick,not_pick);
    }

    public static int find(int arr[])
    {
        int dp[] = new int[arr.length];
        Arrays.fill(dp,-1);
        return  find(arr, arr.length-1,dp);
    }

    public static int max_robbary(int arr[])
    {
        int arr1[] = new int[arr.length-1];
        int arr2[] = new int[arr.length-1];

        for(int i = 0;i<arr.length-1;i++)
        {
            arr1[i] = arr[i];
        }

        for(int i = 1;i<arr.length;i++)
        {
            arr2[i-1] = arr[i];
        }

        return Math.max(find(arr1),find(arr2));
    }

    // ! Tabulation Approach

    public static int tabulation(int arr[])
    {
        int dp[] = new int[arr.length];
        dp[0] = arr[0];

        for(int i = 1;i<arr.length;i++)
        {
            int pick = Integer.MIN_VALUE;
            if(i-2 >= 0)
                pick = dp[i-2] + arr[i];
            
            int not_pick = 0+ dp[i-1];

            dp[i] = Math.max(pick, not_pick);
        }

        return dp[arr.length-1];
    }


    public static int tab_robbery(int arr[])
    {
        int arr1[] = new int[arr.length-1];
        int arr2[] = new int[arr.length-1];

        for(int i = 0;i<arr.length-1;i++)
        {
            arr1[i] = arr[i];
        }

        for(int i = 1;i<arr.length;i++)
        {
            arr2[i-1] = arr[i];
        }

        return Math.max(tabulation(arr1),tabulation(arr2));
    }

}

package DP.Striver;

import java.util.Arrays;

public class NinjaTraining {
    public static void main(String[] args) {

        int[][] points = {{10, 40, 70},{20, 50, 80},{30, 60, 90}};
        System.out.println(find(points));

      
        
    }



    public static int find(int arr[][],int last,int ind,int dp[][])
    {
        if(dp[ind][last] != -1) return dp[ind][last];
        if(ind == 0) // ! Base Case 
        {
            int maxi = 0;
            for(int i = 0;i<=2;i++)
            {
                if(i !=last)
                {
                    maxi = Math.max(maxi ,arr[0][i]);
                }
            }
            return dp[ind][last] =  maxi;
        }

        int maxi = 0;
        for(int i = 0;i<=2;i++)
        {
            if(i !=last)
            {
                int marit_point = arr[ind][i] + find(arr, i, ind-1,dp);

                maxi = Math.max(maxi,marit_point);
            }
        }

        return dp[ind][last] = maxi;
    }


    public static int find(int arr[][])
    {
        int dp[][] = new int[arr.length][4];

        for(int[] ar:dp) Arrays.fill(ar, -1);

        return find(arr, 3, arr.length-1, dp);
    }


    public static int find(int arr,int n)
    {
        return 0;
    }

}

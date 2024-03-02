package DP.Striver;

import java.util.Arrays;

public class FrogJump {
    public static void main(String[] args) {
        int arr[] = {10,20, 30 ,10};
        System.out.println(MinEnergy(arr));

        int arr2[] = {10 ,50 ,10};
        System.out.println(MinEnergy(arr2));

        System.out.println(tabulation(arr));
        System.out.println(tabulation(arr2));
        int arr3[] = {30,10,60,10,60,50};
        System.out.println(spaceOptimization(arr3));
     
    }

    public static int MinEnergy(int arr[]) // !o(n) tc and o(n) +o(n) sc
    {
      int dp[]  =  new int[arr.length+1];   // declaring array of size
      Arrays.fill(dp,-1);

      return MinEnergy(arr,arr.length-1,dp);
    }

    public static int MinEnergy(int arr[],int ind,int dp[])
    {
        if(ind == 0) return 0;

        int right = Integer.MAX_VALUE;

        if(dp[ind] != -1) return dp[ind];

        int left = MinEnergy(arr,ind-1,dp)+ Math.abs(arr[ind]-arr[ind-1]);

        if(ind>1)
        right = MinEnergy(arr,ind-2,dp) + Math.abs(arr[ind]-arr[ind-2]);

        return dp[ind] = Math.min(right, left);
    }

    public static int tabulation(int arr[])  // ! Space Optimization
    {
        if(arr==null || arr.length==0) return 0;
        int dp[]=new int[arr.length];
        for(int i  = 1;i<arr.length ; i++)
        {
          int jumpTwo = Integer.MAX_VALUE;
          int jump1 = dp[i-1]+Math.abs(arr[i]-arr[i-1]);
          if(i>=2)
          jumpTwo = dp[i-2]+ Math.abs(arr[i]-arr[i-2]);

          dp[i] = Math.min(jumpTwo, jump1);
        }

        return dp[arr.length-1];
    }

    public static int spaceOptimization(int arr[])
    {
        int n=arr.length;
        int prev=0;
        int prev_2 = 0;

        for(int i = 1; i <n ; i++ )
        {
            int jump2 = Integer.MAX_VALUE;
            int jump1 = prev + Math.abs(arr[i]-arr[i-1]);
            if(i>1)
            jump2 = prev_2 + Math.abs(arr[i]-arr[i-2]);

            int curr = Math.min(jump1 , jump2 );
            prev_2 = prev;
            prev = curr;
        }

        return  prev;
    }

}

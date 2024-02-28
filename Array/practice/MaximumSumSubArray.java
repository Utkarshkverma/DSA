/*

Given an integer array, find the maximum sum among all its subarrays.

Input : [-2, 1, -3, 4, -1, 2, 1, -5, 4]
Output: 6
Explanation: The maximum sum subarray is [4, -1, 2, 1]

Input : [-7, -3, -2, -4]
Output: -2
Explanation: The maximum sum subarray is [-2]

Input : [-2, 2, -1, 2, 1, 6, -10, 6, 4, -8]
Output: 10
Explanation: The maximum sum subarray is [2, -1, 2, 1, 6] or [6, 4] or [2, -1, 2, 1, 6, -10, 6, 4]

*/
package Arrays;
import java.util.*;
@SuppressWarnings("unused")
public class MaximumSumSubArray {

    public static void main(String[] args) {

        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(getMaxSum(arr));

        int arr1[] = {-7, -3, -2, -4};
        System.out.println(getMaxSum(arr1));

        int arr2[] = {-2, 2, -1, 2, 1, 6, -10, 6, 4, -8};
        System.out.println(getMaxSum(arr2));


        
    }

    public static int getMaxSum(int arr[])
    {
        int sum = 0;
        int maxi = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++)
        {
            sum += arr[i];

            maxi = Math.max(maxi,sum);
            
            if(sum<0) sum = 0;
        }

        return maxi;
    }
    
}

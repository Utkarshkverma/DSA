/*

Given an integer array and a positive integer `k`, find the minimum sum contiguous subarray of size `k`.

Input : nums[] = [10, 4, 2, 5, 6, 3, 8, 1], k = 3
Output: [4, 2, 5]

Input : nums[] = [1, 4, 5, 3, 8], k = 6
Output: [1, 4, 5, 3, 8]

Note: Since an input can contain several minimum sum subarrays of size `k`, the solution can return any one of them.

*/

import java.util.*;
public class MinWindowSum {
    public static void main(String[] args) {
        int arr[] = {10, 4, 2, 5, 6, 3, 8, 1};
        MinWindowSum(arr, 3);

        int arr2[] = {1, 4, 5, 3, 8};
        MinWindowSum(arr2, 6);
    }

    public static void MinWindowSum(int arr[],int k)
    {
        if(k>=arr.length)
        {
            System.out.println(Arrays.toString(arr));
            return;
        } 

        else {
            int res[]  = new int[k];

            int window_sum = 0;
            int min_sum = Integer.MAX_VALUE;

            int lastIndex = 0;

            for(int i = 0;i<arr.length;i++)
            {
                window_sum += arr[i];
                if(i+1>=k)
                {
                    if(min_sum>window_sum)
                    {
                        min_sum = window_sum;
                        lastIndex = i;
                    }

                    window_sum -=arr[i+1-k];
                }
            }
            int j=0;
            for(int i = lastIndex+1-k;i<=lastIndex;i++)
            res[j++] = arr[i];

            System.out.println(Arrays.toString(res));
        }
    }
}

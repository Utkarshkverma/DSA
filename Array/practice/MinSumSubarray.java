/*

Given an integer array and a positive integer `k`, find the minimum sum contiguous subarray of size `k`.

Input : nums[] = [10, 4, 2, 5, 6, 3, 8, 1], k = 3
Output: [4, 2, 5]

Input : nums[] = [1, 4, 5, 3, 8], k = 6
Output: [1, 4, 5, 3, 8]

Note: Since an input can contain several minimum sum subarrays of size `k`, the solution can return any one of them.

*/

import java.util.ArrayList;
import java.util.Arrays;

@SuppressWarnings("unused")
public class MinSumSubarray {
    public static void main(String[] args) {
        int arr[] = {10, 4, 2, 5, 6, 3, 8, 1};
        find(arr,3);

        int arr2[] = {1, 4, 5, 3, 8};
        find(arr2,6);
    }

    public static void find(int[] arr, int k){
        if (arr == null || arr.length==0) return;

        if(k>= arr.length)
        {
            var list = new ArrayList<Integer>();
            for(var i : arr) list.add(i);
            System.out.println(list);
            return;
        }

        int  n = arr.length;
        int min_sum = Integer.MAX_VALUE;
        int curr_sum = 0;
        int endIndex = 0;

        for(int i = 0;i<n;i++){
          curr_sum += arr[i];

          if(i+1>=k)
          {
            if(min_sum > curr_sum)
            {
                min_sum = curr_sum;
                endIndex = i;
            }
            curr_sum -= arr[i-k+1];
          }
          
        }

        System.out.println(min_sum);

      var list  = new ArrayList<Integer>();

        for(int i = endIndex-k+1;i<=endIndex;i++)
        {
         list.add(arr[i]);
        }

        System.out.println(list);
    }
}

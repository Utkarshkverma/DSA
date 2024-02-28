/*

Given an integer array, find a pair with the maximum product in it.

Each input can have multiple solutions. The output should match with either one of them.

Input : [-10, -3, 5, 6, -2]
Output: (-10, -3) or (-3, -10) or (5, 6) or (6, 5)

Input : [-4, 3, 2, 7, -5]
Output: (3, 7) or (7, 3)

If no pair exists, the solution should return null.

Input : [1]
Output: null

*/



package Arrays;
import java.util.*;
@SuppressWarnings("unused")
public class MaxProductPair {

    public static void main(String[] args) {
        int arr[] = {-10, -3, 5, 6, -2};
        int arr2[] = {-4, 3, 2, 7, -5};
        int arr3[] = {1};

        System.out.println(maxProduct2(arr));
        System.out.println(maxProduct2(arr2));
        System.err.println(maxProduct2(arr3));
    }

    public int maxProduct(int[] nums) { // ! O(n^2) tc and O(1) sc
        if(nums == null || nums.length == 0 || nums.length==1){
            return 0;
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length-1;i++)
        {
            for(int j = i+1;j<nums.length;j++)
            {
                if(nums[i]*nums[j] > max)
                {
                    max = nums[i]*nums[j];
                }
            }
        }
        return max;
        
    }


    public static int maxProduct2(int[] nums) // ! O(nlog n) tc and O(1) sc
    {
        if(nums == null || nums.length == 0 || nums.length ==1){
            return 0;
        }

        Arrays.sort(nums);
        
        return Math.max((nums[0]*nums[1]),(nums[nums.length-1]*nums[nums.length-2]));
    }
    
}

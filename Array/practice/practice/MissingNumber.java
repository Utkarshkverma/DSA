/*

Given an array of `n-1` distinct integers in the range of 1 to `n`, find the missing number in it in linear time.

Input: [1, 2, 3, 4, 5, 7, 8, 9, 10]
Output: 6
Explanation: All elements are in the range 1 to 10. The missing number is 6.

Input: [1, 2, 3, 4]
Output: 5

Assume valid input.

*/
package practice;
public class MissingNumber
{
 public static void main(String[] args) {

    int arr[] = {1, 2, 3, 4, 5, 7, 8, 9, 10};
    System.out.println(findMissingNumber(arr));

    int nums[] = {1, 2, 3, 4};
    System.out.println(findMissingNumber(nums));
    
 }

 public static int  findMissingNumber(int[] nums)
 {
    int xor = 0;
   for(int i:nums)
    {
        xor^= nums[i];
    }

    for(int i = 0;i<=nums.length+1;i++)
    {
        xor = xor^i;
    }

    return xor;
 }
}
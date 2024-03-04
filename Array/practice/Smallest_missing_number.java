/*

Given a sorted array of non-negative distinct integers, find the smallest missing non-negative element in it.

Input: [0, 1, 2, 6, 9, 11, 15]
Output: 3

Input: [1, 2, 3, 4, 6, 9, 11, 15]
Output: 0

Input: [0, 1, 2, 3, 4, 5, 6]
Output: 7

*/

public class Smallest_missing_number {
    public static void main(String[] args) {
      int arr1[] = {0, 1, 2, 6, 9, 11, 15};
      System.out.println(findSmallestMissingNumber(arr1));

      int arr2[] = {1, 2, 3, 4, 6, 9, 11, 15};
      System.out.println(findSmallestMissingNumber(arr2));

      int arr3[] = {0, 1, 2, 3, 4, 5, 6};
      System.out.println(findSmallestMissingNumber(arr3));
    }

    public static int findSmallestMissingNumber(int[] nums) {
        // Write your code here...
        if (nums.length == 0 || nums == null)
            return 0;
        if (nums[0] != 0)
            return 0;

        int missing = -1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] != 1) {
                missing = nums[i - 1] + 1;
                break;
            }
        }

        if (missing == -1) {
            missing = nums[nums.length - 1] + 1;
        }

        return missing;
    }

}

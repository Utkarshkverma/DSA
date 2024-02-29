/*

Given an integer array, partition it into two contiguous subarrays having the same sum of elements and return the index that points to the starting of the second subarray. Return -1 if no partition is possible.

Input : [6, -4, -3, 2, 3]
Output: 2
Explanation: The subarrays [6, -4] and [-3, 2, 3] have equal sum of 2. The second subarray starts from index 2.

Input : [6, -5, 2, -4, 1]
Output: -1
Explanation: No equal sum partition possible.

In case multiple solutions is possible, return the index of the first occurrence. For example,

Input : [1, -1, 1, -1, 1, -1]
Output: 0

*/


public class PartitionArrayEqualSum {
    public static void main(String[] args) {

        int arr1 [] = {6, -4, -3, 2, 3};
        System.out.println(partition(arr1));

        int arr2[] = {6, -5, 2, -4, 1};
        System.out.println(partition(arr2));

        int arr3[] = {1, -1, 1, -1, 1, -1};
        System.out.println(partition(arr3));
        
    }

    public static int partition(int arr[])
    {
        int sum  = 0;
        for(int i = 0;i<arr.length;i++) sum +=arr[i];

        if(sum ==0) return -1;

        int sum_so_far = 0;

        for(int i = 0;i<arr.length;i++)
        {
            if(sum_so_far == sum - sum_so_far)
             return i;

             sum_so_far +=arr[i];
        }

        return -1;
    }
}

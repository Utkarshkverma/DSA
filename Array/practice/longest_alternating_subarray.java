/*

Given an array containing positive and negative elements, find a subarray with alternating positive and negative elements, and in which the subarray is as long as possible.

Input : [1, -2, 6, 4, -3, 2, -4, -3]
Output: [4, -3, 2, -4]

Note that the longest alternating subarray might not be unique. In case the multiple alternating subarrays of maximum length exists, the solution can return any one of them.

Input : [1, -2, 6, 2, 4, -3, 2, 4, -3]
Output: [1, -2, 6] or [4, -3, 2]

*/


public class longest_alternating_subarray {
    public static void main(String[] args) {
        int arr1[] = {1, -2, 6, 4, -3, 2, -4, -3};
        find(arr1);
        System.out.println();

        int arr2[] = {1, -2, 6, 2, 4, -3, 2, 4, -3};
        find(arr2);

    }

    public static void find(int arr[])  // ! O(n) tc 
    {
        int n = arr.length;
        int len = 0;
        int max_len = Integer.MIN_VALUE;
        int endIndex = 0;

        for(int i = 1;i<n;i++)
        {
            if(arr[i]*arr[i-1]<0)
            {
                len++;
                if(len>max_len)
                {
                    max_len = len;
                    endIndex = i;
                }
            }

            else{
                len = 1;
            }
        }


        for(int i = endIndex-max_len+1;i<=endIndex;i++)
        System.out.print(arr[i]+" ");
    }
}

/*

Given an integer array, find k'th largest element in the array where k is a positive integer less than or equal to the length of array.

Input : [7, 4, 6, 3, 9, 1], k = 2
Output: 7
Explanation: The 2nd largest array element is 7

Input : [1, 5, 2, 2, 2, 5, 5, 4], k = 4
Output: 4
Explanation: The 4th largest array element is 4

*/

import java.util.*;
public class kth_largest_element {
    public static void main(String[] args) {
        int arr[] = {7, 4, 6, 3, 9, 1};
        System.out.println(findkth(arr, 2));

        int arr1[] = {1, 5, 2, 2, 2, 5, 5, 4};
        System.out.println(findkth(arr1, 4));
    }

    public static int findkth(int arr[],int k)
    {
        var pq = new PriorityQueue<Integer>(); // ! Min Heap
        for(int i = 0;i<k;i++)
        {
            pq.add(arr[i]);
        }

        for(int i = k;i<arr.length;i++)
        {
            if(arr[i] > pq.peek())
            {
               pq.poll();
               pq.add(arr[i]);
            }
        }

        return pq.peek();
    }
}

/*

Given an integer array, find k'th smallest element in the array where k is a positive integer less than or equal to the length of array.

Input : [7, 4, 6, 3, 9, 1], k = 3
Output: 4
Explanation: The 3rd smallest array element is 4

Input : [1, 5, 2, 2, 2, 5, 5, 4], k = 5
Output: 4
Explanation: The 5th smallest array element is 4

*/

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

@SuppressWarnings("unused")
public class kth_smallest_element {
    public static void main(String[] args) {
        int arr1[] = {7, 4, 6, 3, 9, 1};
        System.out.println(find(arr1, 3)); // Output: 4
        
        int arr2[] = {1, 5, 2, 2, 2, 5, 5, 4};
        System.out.println(find(arr2, 5)); // Output:  4
    }

    public static int find(int arr[],int k)
    {
        var pq =  new PriorityQueue<Integer>( Collections.reverseOrder());

        for(int i =  0;i< k;i++)
        pq.add(arr[i]);

        for(int i = k;i<arr.length;i++)
        {
            if(arr[i]<pq.peek())
            {
                pq.poll();
                pq.add(arr[i]);
            }
        }

        return pq.peek();
    }
}

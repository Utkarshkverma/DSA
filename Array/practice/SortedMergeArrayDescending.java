/*

Given two sorted integer arrays, merge them into a single array in decreasing order, and return it. In other words, merge two sorted arrays from their end.

Input : X = [1, 3, 5], Y = [2, 6, 7, 10]
Output: [10, 7, 6, 5, 3, 2, 1]

*/
package Arrays;
import java.util.*;
public class SortedMergeArrayDescending {
    public static void main(String[] args) {
        int arr1[] = {1, 3, 5, };
        int arr2[] = {2, 6, 7,10};

        System.out.println(sortedMerge(arr1, arr2));
    }

    public static String sortedMerge(int arr1[],int arr2[])
    {
        int arr[] = new int[arr1.length+arr2.length];
        int i = 0;
        int j = 0;
        int k = arr.length-1;

        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]<=arr2[j])
            {
                arr[k--]=arr1[i++];
            }

            else arr[k--] = arr2[j++];
        }
        while(i<arr1.length)
        arr[k--] = arr1[i++];

        while(j<arr2.length)
        arr[k--] = arr2[j++];

        return Arrays.toString(arr);
    }
}

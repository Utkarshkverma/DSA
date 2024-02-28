/*

Given an array containing positive and negative elements, find a subarray with alternating positive and negative elements, and in which the subarray is as long as possible.

Input : [1, -2, 6, 4, -3, 2, -4, -3]
Output: [4, -3, 2, -4]

Note that the longest alternating subarray might not be unique. In case the multiple alternating subarrays of maximum length exists, the solution can return any one of them.

Input : [1, -2, 6, 2, 4, -3, 2, 4, -3]
Output: [1, -2, 6] or [4, -3, 2]

*/

package Arrays;
import java.util.*;
public class LongestAlternatingSubArray {

    public static void main(String[] args) {
        int arr1[] = {1, -2, 6, 4, -3, 2, -4, -3};
        find(arr1);

        int arr2[] = {1, -2, 6, 2, 4, -3, 2, 4, -3};
        find(arr2);
        
    }

    public static void find(int arr[])
    {
        int currIndex = 1;
        int maxLength = 1;
        int endPoint = 0;

        for(int i = 1;i<arr.length;i++){
            if(arr[i]*arr[i-1]<0)
            currIndex ++;

            if(currIndex > maxLength){
                maxLength = currIndex;
                endPoint = i;
            }

            else
            currIndex = 1;
        }

        for(int i = (endPoint-currIndex+1);i<maxLength+1;i++)
        System.out.print(arr[i]+" ");

        
    }
    
}

/*

Given an integer array and a positive number `k`, check whether the array contains any duplicate elements within the range `k`. If `k` is more than the array’s size, the solution should check for duplicates in the complete array.

Input: nums[] = [5, 6, 8, 2, 4, 6, 9], k = 4
Output: true
Explanation: Element 6 repeats at distance 4 which is <= k

Input: nums[] = [5, 6, 8, 2, 4, 6, 9], k = 2
Output: false
Explanation: Element 6 repeats at distance 4 which is > k

Input: nums[] = [1, 2, 3, 2, 1], k = 7
Output: true
Explanation: Element 1 and 2 repeats at distance 4 and 2, respectively which are both <= k

*/

package Arrays;
import java.util.*;
public class DuplicatesInRangeK {
    public static void main(String[] args) {
        int arr[] = {5, 6, 8, 2, 4, 6, 9};
        System.out.println(duplicatesInRangeK(arr, 4));

        System.out.println(duplicatesInRangeK(arr, 2));
        int nums[] = {1,2,3,2,1};
        System.out.println(duplicatesInRangeK(nums, 7));
    }

    public static int duplicatesInRangeK(int arr[],int k)
    {
      if(arr.length == 0 || arr == null) return -1;

      var map  =   new HashMap<Integer , Integer>();

      for(int i = 0;i<arr.length;i++)
      {
        if(map.containsKey(arr[i]))
        {
            if(i-map.get(arr[i])<=k)
            {
                return arr[i];
            }
        }

        else
        {
            map.put(arr[i],i);
        }
      }

      return -1;
    }
}

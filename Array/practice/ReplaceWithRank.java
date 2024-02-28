/*

Given an array of distinct integers, in-place replace each array element by its corresponding rank in the array. The minimum array element has the rank 1; the second minimum element has a rank of 2, and so on.

Input : [10, 8, 15, 12, 6, 20, 1]
Output: [4, 3, 6, 5, 2, 7, 1]

Input : [0, 1, -1]
Output: [2, 3, 1]

*/

package Arrays;
import java.util.*;
public class ReplaceWithRank {

    public static void main(String[] args) {
        int arr1[] = {10, 8, 15, 12, 6, 20, 1};
        System.out.println(replace(arr1));

        int arr2[] = {0,1,-1};
        System.out.println(replace(arr2));

    }

    public static String replace(int arr[])
    {
        if(arr == null ||arr.length == 0) return "";

        var map = new TreeMap<Integer,Integer>();

        for(int i= 0;i<arr.length;i++)
        {
            map.put(arr[i],i);
        }

        int cnt = 1;
        for(int i : map.values())
        {
            arr[i] = cnt++;
        }

        return  Arrays.toString(arr);
    }
    
}

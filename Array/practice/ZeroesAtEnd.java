/*

Given an integer array, in-place move all zeros present in it to the end. The solution should maintain the relative order of items in the array and should not use constant space.

Input : [6, 0, 8, 2, 3, 0, 4, 0, 1]
Output: [6, 8, 2, 3, 4, 1, 0, 0, 0]

*/

package Arrays;
import java.util.*;
@SuppressWarnings("unused")
public class ZeroesAtEnd {

    public static void main(String[] args) {
        int arr1[] = {6, 0, 8, 2, 3, 0, 4, 0, 1};
        System.out.println(move_at_end(arr1));
    }

    public static String  move_at_end(int arr[]) // ~ O(n) TC O(1) SC
    {
        int k = 0;
        for(int i: arr)
        {
            if(i!= 0)
            {
                arr[k++] = i;    
            }
        }

        for(int i = k; i < arr.length; i++)
        {
            arr[i] = 0;
        }

        return Arrays.toString(arr);
    }
    
}

package Arrays;
/*

Given a binary array, in-place sort it in linear time and constant space. The output should contain all zeroes, followed by all ones.

Input : [1, 0, 1, 0, 1, 0, 0, 1]
Output: [0, 0, 0, 0, 1, 1, 1, 1]

Input : [1, 1]
Output: [1, 1]

*/
import java.util.*;
public class SortBinaryArray {

    public static void main(String[] args) {
        int arr[] = {1,0,1,0,1,0,1,0,1,0,1};
        sort2(arr);

        int nums[]= {1,1};
        sort(nums);
    }

    public static void sort(int arr[]) // ! O(n) time complexity O(1) space complexity
    {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort2(int arr[]) // ! O(n) time complexity O(1) space complexity
    {
      int low = 0;
      int high = arr.length - 1;

      while(low<=high) {
        if(arr[low]==0) low++;
        else if(arr[high]==1) high--;

        else{
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
        }
      }

       System.out.println(Arrays.toString(arr));
    }
    
}

/*

Given an integer array of size `n`, return the element which appears more than `n/2` times. Assume that the input always contain the majority element.

Input : [2, 8, 7, 2, 2, 5, 2, 3, 1, 2, 2]
Output: 2

Input : [1, 3, 1, 1]
Output: 1

*/



package Arrays;
import java.util.*;
@SuppressWarnings("unused")
public class MajorityElement {

    public static void main(String[] args) {
        int arr1[] ={ 2, 8, 7, 2, 2, 5, 2, 3, 1, 2, 2};
        System.out.println(element(arr1));

        int arr2[] = {1, 3, 1, 1};
        System.out.println(element(arr2));
    }

    public static int element(int arr[]) // ~ O(n) TC O(1) SC
    {
        int cnt = 0;
        int el = -1;

        for(int i = 0; i < arr.length; i++)
        {
            if(cnt == 0)
            {
                el = arr[i];
                cnt++;
            }

            else if(el != arr[i]) cnt--;

            else cnt++;
        }


        int count = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == el) count++;
        }

        return count >= arr.length/2 ? el : -1;
    }
    
}

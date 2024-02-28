/*

Given two integer arrays, each of which is sorted in increasing order, merge them into a single array in increasing order, and return it.

Input: X = [1, 3, 5, 7], Y = [2, 4, 6]
Output: [1, 2, 3, 4, 5, 6, 7]

*/
package practice;
import java.util.*;
public class SortedMergeAscending {

    public static void main(String[] args) {
        int arr1[] = {1, 3, 5, 7};
        int arr2[] = {2, 4, 6};

        System.out.println(sortedMerge(arr1, arr2));
        
    }

    public static String sortedMerge(int x[],int y [])
    {
        if(x == null || x.length == 0) return Arrays.toString(y);
        else if(y == null || y.length == 0) return Arrays.toString(x);

        int resArr[] = new int[x.length+y.length];
        int i = 0;
        int  j = 0;
        int k  = 0;

        while(i<x.length && j < y.length )
        {
            if(x[i]<=y[j])
            {
                resArr[k++] = x[i++];
            }
            else{
                resArr[k++] =  y[j++];
            }
        }

        while(i<x.length)
        {
            resArr[k++] = x[i++];
        }

        while(j<y.length)
        {
            resArr[k++] = y[j++];
        }

        return Arrays.toString(resArr);
    }
    
}

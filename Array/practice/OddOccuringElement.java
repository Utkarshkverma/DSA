/*

Given an integer array, duplicates are present in it in a way that all duplicates appear an even number of times except one which appears an odd number of times. Find that odd appearing element in linear time and without using any extra memory.

Input: [4, 3, 6, 2, 6, 4, 2, 3, 4, 3, 3]
Output: 4

Assume valid input.

*/

public class OddOccuringElement {
    public static void main(String[] args) {
        int arr[] = {4, 3, 6, 2, 6, 4, 2, 3, 4, 3, 3};
        System.out.println(OddOccuringElement(arr));
    }

    public static int OddOccuringElement(int arr[])
    {
        int k  = 0;
        for(int i = 0;i<arr.length;i++) k^=arr[i];
        return k;
        
    }


}

/*

Given a sorted integer array and a target, determine if the target exists in the array in logarithmic time. If target exists in the array, the procedure should return the index of it.

Input: nums[] = [2, 3, 5, 7, 9], target = 7
Output: 3
Explanation: Element found at 4th (index 3) position

• If there are duplicate elements in the array, the procedure may return any index whose element is equal to the target.

Input: nums[] = [1, 2, 3, 4, 4, 5, 6, 7], target = 4
Output: 3 (or 4)
Explanation: Element found at the 4th (index 3) or 5th (index 4) position.

• If the target is not located, the procedure should return -1.

Input: nums[] = [1, 4, 5, 8, 9], target = 2
Output: -1

*/


package Arrays;
public class SearchArray {

    public static void main(String[] args) {
        int arr1[] = {2, 3, 5, 7, 9};
        System.out.println(find(arr1,7));
        int arr2[] ={1, 4, 5, 8, 9};
        System.out.println(find(arr2,2));
    }

    public static int find(int []arr,int tar)
    {
        if(arr == null || arr.length == 0) return -1;

        int i = 0;
        int j = arr.length-1;
        while(i <= j)
        {
            int mid = (i+j)/2;

            if(arr[mid]==tar) return mid;

            if(arr[mid]<tar) i = mid+1;
            else j = mid-1;
        }

        return -1;
    }
    
}

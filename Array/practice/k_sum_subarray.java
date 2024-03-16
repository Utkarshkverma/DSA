/*

Given an integer array, find a contiguous subarray having sum `k` in it where `k` is an integer.

Input : nums[] = [2, 6, 0, 9, 7, 3, 1, 4, 1, 10], k = 15
Output: [6, 0, 9]

Input : nums[] = [0, 5, -7, 1, -4, 7, 6, 1, 4, 1, 10], k = -3
Output: [1, -4] or [-7, 1, -4, 7]

Note: Since an input can contain several subarrays having sum `k`, the solution can return any one of them.

Input : nums[] = [0, 5, -7, 1, -4, 7, 6, 1, 4, 1, 10], k = 15
Output: [1, -4, 7, 6, 1, 4] or [4, 1, 10]

*/


public class k_sum_subarray {
    public static void main(String[] args) {

        int arr [] = {2, 6, 0, 9, 7, 3, 1, 4, 1, 10};
        //System.out.println(find(arr, 15));
        getVal(arr, 15);
        

        int arr1[] = {0, 5, -7, 1, -4, 7, 6, 1, 4, 1, 10};
        

    }

    public static boolean find(int arr[],int sum)
    {
        int n = arr.length;
        int high = 0;
        int w_Sum = 0;

        for(int i =0;i<n;i++)
        {
            while(w_Sum<sum && high<n)
            {
                w_Sum +=  arr[high];
                high++;
            }

            if(w_Sum == sum) return true;

            w_Sum -= arr[i];
        }

        return false;
    }


    public static void getVal(int arr[],int sum)
    {
        int n = arr.length;
        int high = 0;
        int w_Sum = 0;
        int i = 0;
        for(i = 0;i<n;i++){
            while(w_Sum<sum && high<n){
                w_Sum +=  arr[high];
                high++;
            }

            if(w_Sum == sum)
            {
                System.out.println("array found in "+i+"-"+(high-1));
               return;
            }

            w_Sum -=arr[i];
        }   
        
    }


    
}

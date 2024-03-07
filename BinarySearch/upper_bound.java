package BinarySearch;

public class upper_bound {
    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 9, 15, 19};
        int x = 9;
        System.out.println("The upper bound is " + find(arr,x));
    }

    // ~ Upper bound  = lowest index where arr[i]>k
    public static int find(int arr[],int k)
    {
      int i = 0;
      int j = arr.length-1;
      int pos = 0;

      while(i<=j)
      {
        int mid = (i+j)/2;

        if(arr[mid] >k)
        {
            pos = mid;
            j = mid-1;
        }

        if(arr[mid] <k)
        {
            i = mid+1;
        }

        else{
            j = mid-1;
        }
      }

      return pos;
    }
}

package BinarySearch;

public class floor_and_ceil {
    public static void main(String[] args) {
       int arr[] ={3, 4, 4, 7, 8, 10};
       int x= 5;

       System.out.println(find(arr, x));
    }

    // ceil :  lower bound
    // floor : larget number in an array <= x

    public static int find(int arr[],int x)
    {
      int low = 0;
      int high = arr.length-1;
      int pos = 0;
      while(low<=high)
      {
        int mid = (low+high)/2;

        if(arr[mid]<=x)
        {
         pos  = arr[mid];
         low = mid + 1;
        }
        else{
            high = mid-1;
        }
      }

      return pos;
    }
}

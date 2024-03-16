package BinarySearch;

public class sorted_inserted_position {

    public static void main(String[] args) {
        int arr[] = {1,2,4,7};
        int  x = 6;

        System.out.println(find(arr,x));
    }

    public static int find(int arr[], int tar)
    {
      int i =0;
      int j = arr.length-1;

      int pos = 0;

      while(i<=j)
      {
        int mid = (i+j)/2;

        if(arr[mid]>=tar)
        {
            pos = mid;
            j = mid-1;
        }

        else{
            i = mid+1;
        }
      }
      return pos;
    }
    
}

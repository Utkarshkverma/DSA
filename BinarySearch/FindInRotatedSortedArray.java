package BinarySearch;

public class FindInRotatedSortedArray {
    public static void main(String[] args) {
        int arr[] = {7, 8, 9, 1, 2, 3, 4, 5, 6};
        int k = 1;

        System.out.println(find(arr, k));
    }

    public static int find(int arr [],int k)
    {
        int low = 0;
        int  high = arr.length -1 ;

        while(low<=high)
        {
            int mid = (low+high)/2;
            
            if(arr[mid] == k) return mid;

           if(arr[mid]<=arr[high]) // right side is sorted
           {
             if(arr[mid]<= k  && k<= arr[high])
             {
                low = mid+ 1;
             }

             else high = mid-1;
           }

           else // left side is sorted
           {
            if(arr[low]<=k && k<= arr[mid])
            {
                high = mid-1;
            }

            else {
                low = mid+1;
            }
           }
        }

        return -1;
    }
}

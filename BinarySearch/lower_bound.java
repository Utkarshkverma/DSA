package BinarySearch;


public class lower_bound {
    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 15, 19};
        int x = 9;

        System.out.println(find(arr, x)); // Output: 3
    }

    // ~ lower bound : Mininmum index in which arr[i]>=k where k is the given number
    public static int find(int  arr[], int x){ 
        if(x<arr[0]) return -1;
        if(x>arr[arr.length-1]) return arr.length;

        int low = 0;
        int high = arr.length-1;
        int index = 0;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(arr[mid] >= x)
            {
              index = mid;
              high = mid - 1;
            }

            else if(arr[mid] < x)
            {
                low = mid+1;
            }
            
            else{
                high = mid-1;
            }
        }

        return index;
    }
    
}

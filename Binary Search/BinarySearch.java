public class BinarySearch {
    public static void main(String[] args) {
         int arr[] = {2, 4, 10, 45};
        int x = 10;
        System.out.println(search(arr, x));
        System.out.println(search(arr, 15));
    }

    public static boolean  search(int arr[], int x) 
    {
        if(arr.length == 0 || arr== null) return  false; 
        if(x> arr[arr.length-1] || x< arr[0]) return false ; 

        int low = 0;
        int high = arr.length-1;

        while(low<= high)
        {
            int mid = (low+high)/2;

            if(arr[mid]== x) return true;

            else if(arr[mid] > x )
            high = mid-1;

            else low = mid+1;
        }
        return false;
    }
}

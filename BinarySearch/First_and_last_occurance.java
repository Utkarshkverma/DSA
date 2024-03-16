package BinarySearch;

public class First_and_last_occurance {
    public static void main(String[] args) {
        
    }


    public static int first_pos(int arr[],int k)
    {
        int i = 0;
        int j = arr.length-1;
        int pos = 0;
        while(i<=j)
        {
            int mid = (i+j)/2;

            if(arr[mid]==k)
            {
                pos = mid;
                j = mid-1;
            }

            else if(arr[mid] > k)
            {
                j = mid-1;
            }

            else i = mid+1;
        }

        return pos;
    }


    public static int last_pos(int arr[],int k)
    {
        int i = 0;
        int j = arr.length-1;
        int pos = 0;
        while(i<=j)
        {
            int mid = (i+j)/2;

            if(arr[mid]==k)
            {
                pos = mid;
                i = mid+1;
            }

            else if(arr[mid] > k)
            {
                j = mid-1;
            }

            else i = mid+1;
        }

        return pos;
    }


    public static int count(int arr[],int k)
    {
        return last_pos(arr, k) - first_pos(arr, k);
    }
}

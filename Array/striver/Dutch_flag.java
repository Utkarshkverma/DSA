public class Dutch_flag {
    public static void main(String[] args) {
        int arr[] = {0,1,0,0,1,1,2,2,1,1,0,0,1,1,2,2,1,1,0,0};
        move_zeroes(arr);
    }


    public static void move_zeroes(int arr[])
    {
        int low = 0;
        int mid = 0;
        int high = arr.length-1;

        while(mid <=high)
        {
          if(arr[mid] == 1) mid++;

          else if(arr[mid]==0)
          {
            int temp = arr[low];
            arr[low] = arr[mid];
            arr[mid] = temp;
            low++;
            mid++;
          }

          else{
            int temp = arr[high];
            arr[high] = arr[mid];
            arr[mid] = temp;
            high--;
          }
        }

        for(int i =0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

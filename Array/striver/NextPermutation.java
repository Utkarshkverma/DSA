import java.util.*;
public class NextPermutation {
    public static void main(String[] args)
    {
        int[] arr = new int[] { 1, 2, 3, 6, 5, 4 };
        System.out.println(np(arr));
    }

    public static String np(int arr[])
    {
        int n  = arr.length;
        int i,j;

        for(i = n-2;i>=0;i--)
        {
            if(arr[i]<arr[i+1])
            break;
        }

        if(i<0) 
        {
         reverse(arr, 0, n-1);
        }

        else{
            for(j  = arr.length-1;j>i;j--)
            {
                if(arr[j]>arr[i])
                break;
            }

            swap(arr, i, j);
            reverse(arr, i+1, n-1);

        }
        return  Arrays.toString(arr);
    }


    public static void swap(int arr[],int i,int j)
    {
        int  temp = arr[i];
        arr[i]=arr[j];
        arr[j] = temp;
    }

    public static void reverse(int arr[],int i,int j)
    {
        while(i < j)
        {
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    
}

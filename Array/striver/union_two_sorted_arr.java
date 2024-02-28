import java.util.ArrayList;

public class union_two_sorted_arr {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int arr2[] = { 2, 3, 4, 4, 5, 11, 12 };
        ArrayList<Integer> Union = union(arr1, arr2);
        System.out.println("Union of arr1 and arr2 is ");
        for (int val : Union)
            System.out.print(val + " ");

    }

    public static ArrayList<Integer> union(int[] arr1, int[] arr2) {
        ArrayList<Integer> result = new ArrayList<Integer>();

        int i = 0;
        int j = 0;

        int m = arr1.length;
        int n = arr2.length;

        while(i<m && j<n) {

            if(arr1[i]<=arr2[j])
            {
                if(result.size()==0 || result.get(result.size()-1) != arr1[i])
                {
                    result.add(arr1[i]);
                }
                i++;
            }

            else{
                if(result.size()==0 || result.get(result.size()-1) != arr2[j])
                {
                    result.add(arr2[j]);
                }
                j++;
            }
        }

        while(i<m)
        {
           if(result.get(result.size()-1) != arr1[i])
           {
            result.add(arr1[i]);
           }
           i++;
        }

        while(j<n)
        {
            if(result.get(result.size()-1)!= arr2[j])
            {
                result.add(arr2[j]);
            }
            j++;
        }
        return result;
    }
}

import java.util.ArrayList;

public class intersection_two_sorted_arr {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int arr2[] = { 2, 3, 4, 4, 5, 11, 12 };
        ArrayList<Integer> intersection = intersection(arr1, arr2);
        System.out.println("Intersection of arr1 and arr2 is ");
        for (int val : intersection)
            System.out.print(val + " ");
    }

    public static ArrayList<Integer> intersection(int[] arr1, int[] arr2) {
        ArrayList<Integer> result = new ArrayList<Integer>();

        int i  = 0;
        int j = 0;

        int m = arr1.length;
        int n = arr2.length;

        while(i<m && j<n) {
            if(arr1[i]<arr2[j]) i++;
            else if(arr1[i]>arr2[j]) j++;

            else{
                result.add(arr1[i]);
                i++;
                j++;
            }
        }


        return result;
    }
}

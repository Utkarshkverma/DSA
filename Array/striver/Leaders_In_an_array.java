import java.util.ArrayList;
public class Leaders_In_an_array {
    public static void main(String[] args) {

        int arr[]=  {10, 22, 12, 3, 0, 6};

        ArrayList<Integer> ans = leaders(arr);

        for (int i = ans.size() - 1; i >= 0; i--)
            System.out.print(ans.get(i) + " ");

    }

    public static ArrayList<Integer> leaders(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;

        int max = arr[n - 1];

        ans.add(arr[n - 1]);

        for (int i = n - 2; i >= 0; i--)
            if (arr[i] > max) {
                ans.add(arr[i]);
                max = arr[i];
            }

        return ans;
    }
}

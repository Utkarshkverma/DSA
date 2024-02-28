public class element_that_appear_onced {
    public static void main(String[] args) {
        int[] arr = { 4, 1, 2, 1, 2 };
        int ans = element(arr);
        System.out.println("The single element is: " + ans);
    }

    public static int element(int arr[]) {
        int xor = 0;

        for (int i = 0; i < arr.length; i++) {
            xor = xor ^ arr[i];
        }

        return xor;
    }
}
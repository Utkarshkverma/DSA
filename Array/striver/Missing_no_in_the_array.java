public class Missing_no_in_the_array {
    public static void main(String[] args) {

        int a[] = { 1, 2, 4, 5 };

        int ans = missingNumber(a);
        System.out.println("The missing number is: " + ans);
    }

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i] - nums[i - 1] != 1)
                return nums[i - 1] + 1;
        }
        return n + 1;
    }
}

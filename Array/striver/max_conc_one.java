public class max_conc_one {
    public static void main(String[] args) {
        int nums[] = { 1, 1, 0, 1, 1, 1 };
        int ans = maxConsecutiveOnes(nums);
        System.out.println("The maximum  consecutive 1's are " + ans);
    }

    public static int maxConsecutiveOnes(int[] nums) {
        int ans = -1;
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1)
                cnt++;

            else {
                cnt = 0;
            }

            ans = Math.max(ans, cnt);
        }

        return ans;
    }

}

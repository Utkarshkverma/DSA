public class Max_Sum_subarray {
    public static void main(String[] args) {

        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(maxSubArray(arr));
        System.out.println(maxSubArray2(arr));
        System.out.println(maxSubArray3(arr));
        subarray4(arr);

    }

    public static int maxSubArray(int[] nums) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += nums[k];

                }
                max = Math.max(sum, max);
            }
        }

        return max; // ! O(n^3)
    }

    public static int maxSubArray2(int[] nums) {
        
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                max = Math.max(sum, max);
            }
        }

        return max; // ! O(n^2)
    }

    // todo : Kadane's algorithm
    public static int maxSubArray3(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            max = Math.max(sum, max);
            if(sum < 0)
                sum = 0;
        }

        return max;
    }

    // todo : print the subarray
    public static void subarray4(int[] nums)
    {
      int sum = 0;
      int max = Integer.MIN_VALUE;
      int start = 0;
      int ansStart =  -1;
      int ansEnd = -1;

      for(int i = 0; i < nums.length; i++) {
        if(sum == 0) start = i;

       sum += nums[i];

       if(sum>max)
       {
         max = sum;
         ansStart = start;
         ansEnd = i;
       }
       if(sum<0)
       {
        sum = 0;
       }
      }

      for(int i = ansStart; i <=ansEnd; i++) 
        System.out.print(nums[i] + " ");
      
    }

}

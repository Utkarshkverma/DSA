public class majority_element {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(arr));
    }

    public static int majorityElement(int[] nums) {
       int el = 0; 
       int cnt = 0;
    

       for(int i = 0; i < nums.length; i++) {
        if(cnt == 0)
        {
         el = nums[i];
         cnt++;
        }

        else if(el == nums[i])
        {
         cnt++;
        }
        else cnt--;
       }
        

       int cnt1 = 0;
       for(int i = 0; i < nums.length; i++)
       {
        if(el == nums[i])
        {
         cnt1++;
        }
       }

       return cnt1 >= nums.length/2 ? el : -1;
    }
}

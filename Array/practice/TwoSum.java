package Arrays;
/*

Given an unsorted integer array, find a pair with the given sum in it.

• Each input can have multiple solutions. The output should match with either one of them.

Input : nums[] = [8, 7, 2, 5, 3, 1], target = 10
Output: (8, 2) or (7, 3)

• The solution can return pair in any order. If no pair with the given sum exists, the solution should return null.

Input : nums[] = [5, 2, 6, 8, 1, 9], target = 12
Output: null

*/



import java.util.*;
public class TwoSum{
    public static void main(String[] args) {
        int arr[] = {8, 7, 2, 5, 3, 1};
        int tar = 10;

        System.out.println(solve(arr, tar));
        System.out.println(solve2(arr, tar));

        int nums[] = {5,2,6,8,1,9};
        int tar2 = 12;
        System.out.println(solve(nums, tar2));
        System.out.println(solve2(nums, tar2));
        
    }

    public static List<List<Integer>> solve(int arr[],int tar) // ! O(n) = Time Complexity O(n) space complexity
    {
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>(); 

        for(int i = 0; i < arr.length; i++)
        {
          if(set.contains(tar - arr[i]))
          {
              ans.add(Arrays.asList(arr[i],tar - arr[i]));
          }
          set.add(arr[i]);
        }

        return ans;
    }


        public static List<List<Integer>> solve2(int arr[],int tar) //!  Time Complexity O(nlog n) space complexity O(1)
        {
            List<List<Integer>> ans = new ArrayList<>();
            Arrays.sort(arr);
            int i = 0;
            int j = arr.length - 1;
            while(i < j)
            {
                if(arr[i]+arr[j]>tar) j--;
                else if(arr[i]+arr[j]<tar) i++;
                else{
                    ans.add(Arrays.asList(arr[i],arr[j]));
                    i++;
                    j--;
                }
            }

            return ans;
        }
}
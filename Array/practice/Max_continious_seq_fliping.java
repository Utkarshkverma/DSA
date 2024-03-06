/*

Given a binary array and a positive integer `k`, return the indices of the maximum sequence of continuous 1’s that can be formed by replacing at most `k` zeroes by ones.

• The solution should return a pair of the starting and the ending index of the maximum sequence.
• For invalid inputs, the solution should return null.
• In case multiple sequence of continuous 1’s of maximum length exists, the solution can return any one of them.

Input : nums[] = [1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 0], k = 0
Output: (6, 9)
Explanation: The longest sequence of continuous 1’s is formed by index 6 to 9.

Input : nums[] = [1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 0], k = 1
Output: (3, 9)
Explanation: The longest sequence of continuous 1’s is formed by index 3 to 9 on replacing zero at index 5.

Input : nums[] = [1, 1, 1, 1, 1], k = 1
Output: (0, 4)

Input : nums[] = [1, 0, 1, 1, 0, 0, 1, 1, 0, 1], k = 1
Output: (0, 3) or (6, 9)

Input : nums[] = [], k = 1
Output: null

*/

public class Max_continious_seq_fliping {
    public static void main(String[] args) {
        int arr[] = {1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 0};
        find(arr, 0); // Output: (6, 9)
        find(arr,1); // Output: (3, 9)
        int arr2[] ={};
        find(arr2, 1);
    }

    public static void find(int arr[],int k)
    {
        if(arr.length == 0 || arr == null)
        {
            System.out.println("null");
            return;
        }

        int flip =0; //todo : count the numbers of the flip
        int length = 0; // todo : store the MAX_LENGTH
        int i = 0; // todo : to traverse the array
        int j =0 ;// todo : helper
        int endIndex = 0; //todo : stores the endinf index

        while(i<arr.length)
        {
           if(arr[i]==0)
           flip ++;
           
           while(flip>k)
           {
            if(arr[j] == 0)
            flip--;
            j++;
           }

           if(length < i-j+1)
           {
            length=i-j+1;
            endIndex = i;
           }
           i++;
        }

        System.out.println(endIndex-length+1+ " "+ endIndex);
    }
}

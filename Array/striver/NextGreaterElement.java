import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement
{
    public static void main(String[] args) {
        int[] input = { 2, 7, 3, 5, 4, 6, 8 };
        System.out.println(find(input));
    }

    public static String find(int arr[])
    {
        int n = arr.length;
        @SuppressWarnings("unused")
        var stack = new Stack<Integer>();
        int res[] = new int[n];
        

        for(int i = n-1;i>=0;i--)
        {
           while(!stack.isEmpty() && stack.peek()<= arr[i])
           stack.pop();

           int val =(stack.isEmpty()) ? -1 : stack.peek();
           res[i] = val;
           stack.push(arr[i]);
        }

        return  Arrays.toString(res);
    }
}
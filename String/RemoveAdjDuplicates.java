/*

Given a string, remove adjacent duplicates characters from it. In other words, remove all consecutive same characters except one.

Input : "AABBBCDDD"
Output: "ABCD"

*/

package Strings;
import java.util.*;
public class RemoveAdjDuplicates {

    public static void main(String[] args) {

        String  str = "AABBCCDDAA";
        System.out.println(removeDuplicates(str));

        System.out.println(removeDuplicatesOptimal(str));
        
    }

    public static  String removeDuplicates(String str){ // ! o(n) TC and o(N) sc
        if(str == null || str.length()==0) return "";

        var stack = new Stack<Character>();
        stack.push(str.charAt(0));
        for(char c : str.toCharArray())
        {
            if(stack.peek() != c)
            {
                stack.push(c);
            }
        }

        var sb = new StringBuffer();
        while(stack.isEmpty() == false)
        {
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }

    public static  String removeDuplicatesOptimal(String str){ // O(n) TC and O(n) sc
        if(str == null || str.length()==0) return "";

        var sb = new StringBuffer();
        sb.append(str.charAt(0));

        for(int i = 1;i<str.length();i++)
            if(sb.charAt(sb.length()-1)!=str.charAt(i))
            sb.append(str.charAt(i));


            return sb.toString();


    }
    
}

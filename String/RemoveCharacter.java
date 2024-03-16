/*

Given a string, remove all occurrences of "AB" and "C" in a single traversal of it.

Input: "CBAABCAB"
Output: "BA"

The solution should remove of all adjacent, as well as non-adjacent occurrences of string "AB" and "C".

Input: "ADAABCB"
Output: "AD"
Explanation: Removing the first adjacent occurrence of "AB" and "C" results in string "ADAB", which again needs to be processed for adjacent "AB". Therefore, the final output string will be "AD".

Input: "AACBBC"
Output: ""
Explanation: AACBBC -> AABB -> AB -> ""

*/


package String;
import java.util.*;
@SuppressWarnings("unused")
public class RemoveCharacter {
    public static void main(String[] args) {
        String Input =  "ADAABCB";
        System.out.println(find(Input));


        String str1 = "CBAABCAB";
        System.out.println(find(str1));
    }

    public static String find(String s)
    {
        if(s == null || s.length()==0) return "";

        var stack = new Stack<Character>();
        stack.push('$');

        for(char c :s.toCharArray())
        {
            if(c == 'A')
            {
                stack.push(c);
            }

            else if(c == 'B')
            {
                if(stack.peek() == 'A')
                {
                    stack.pop(); 
                    continue;
                }

                else{
                    stack.push(c);
                }

            }
            else if(c =='C'){
                continue;
            }

            else{
                stack.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        while(stack.size()>1)
        {
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }
}

/*

Given a string containing opening and closing braces, determine if it represents a balanced expression or not.

Input: "{[{}{}]}[()]"
Output: true

Input: "{{}{}}"
Output: true

Input: "[]{}()"
Output: true

Input: "{()}[)"
Output: false

Input: "{(})"
Output: false

*/

package Strings;
import java.util.*;
@SuppressWarnings("unused")
public class BalancedExpression {

    public static void main(String args[])
    {
        String s1 = "{[{}{}]}[()]";
        System.out.println(isBalanced(s1));

        String s2 =  "{()}[)";
        System.out.println(isBalanced(s2));
    }

    public static boolean isBalanced(String s)
    {
        if(s == null || s.length()%2 == 1) return false;

        var stack = new Stack<Character>();

        for(char c : s.toCharArray())
        {
            if(c == '{' || c == '[' || c == '(')
            {
              stack.push(c);
            }

            else{
                if(stack.isEmpty()) 
                return false;

                else
                {
                    char top = stack.pop();

                    if ((top == '(' && c != ')') ||
                    (top == '{' && c != '}') ||
                    (top == '[' && c != ']')) {
                return false;
            }
                }
            }
        }

        return stack.isEmpty();
    }
    
}

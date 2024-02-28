/*

Given a postfix expression, efficiently evaluate it. Assume that the postfix expression contains only single-digit numeric operands, without any whitespace.

Input: "82/"
Output: 4
Explanation: 82/ will evaluate to 4 (8/2)

Input: "138*+"
Output: 4
Explanation: 138*+ will evaluate to 25 (1+8*3)

Input: "545*+5/"
Output: 5
Explanation: 545*+5/ will evaluate to 5 ((5+4*5)/5)


Assume valid postfix expression.

*/
package String;
import java.util.*;
public class EvalPostFixExpression {
    public static void main(String[] args) {

        String a =  "82/";
        System.out.println(evalPostfix(a)); 
        String b = "138*+";
        System.out.println(evalPostfix(b));  
        String c = "545*+5/";
        System.out.println(evalPostfix(c));   
        
    }

    public static int  evalPostfix(String s) {
        if(s == null || s.length()==0) return 0 ;

        var stack = new Stack<Integer>();

        for(char c: s.toCharArray())
        {
            if(Character.isDigit(c))
            {
                stack.push(c-'0');
            }

            else{
                int x = stack.pop();
                int  y = stack.pop();

                if(c == '+') stack.push(y+x);
                else if(c == '-') stack.push(y-x);
                else if(c == '*')  stack.push(y*x);
                else stack.push(y/x);
            }
        }
        return stack.pop();
}
}

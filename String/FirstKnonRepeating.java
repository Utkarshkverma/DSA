/*

Given a string, find first `k` non-repeating characters in it by doing only a single traversal of it.

Input: s = "ABCDBAGHCHFAC", k = 3
Output: ['D', 'G', 'F']

Input: s = "ABBCDAB", k = 3
Output: ['C', 'D']

If `k` is more than the non-repeating characters count, return all possible non-repeating characters.

Input: s = "YYXBYX", k = 2
Output: ['B']

Input: s = "YYXBYXB", k = 3
Output: []

Note: The solution should return non-repeating characters in the same order as they appear in the string.

*/


package String;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FirstKnonRepeating {
    public static void main(String[] args) {
        String s = "ABCDBAGHCHFAC";
        int k = 3;
        find(s, k);
    }

    public static void find(String s, int k) {

        if(s == null || s.length() ==  0 ) return;

        Set<Character> prevSeen = new HashSet<>();
        Set<Character> res = new HashSet<>();

        for(char c : s.toCharArray())
        {
            if(prevSeen.contains(c))
            {
              res.remove(c);
            }

            else{
                prevSeen.add(c);
                res.add(c);
            }
        }


        if(res.size() <= k){
            System.out.println(res);
        }

        else{
            List<Character> list = new ArrayList<>(res);

            for(int i = 0;i<k;i++)
            System.out.println(list.get(i));
        }

    }
}

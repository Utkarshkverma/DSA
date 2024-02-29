/*

Given two strings, check if they are isomorphic. Two strings, X and Y, are called isomorphic if all occurrences of each character in X can be replaced with another character to get Y and vice-versa.

Note that mapping from a character to itself is allowed, but the same character may not replace two characters.

Input: X = "ACAB", Y = "XCXY"
Output: true
Explanation: The strings "ACAB" and "XCXY" are isomorphic as we can map 'A' to 'X', 'B' to 'Y', and 'C' to 'C'.

Input: X = "xbxb", Y = "Ybyb"
Output: false

*/


package Strings;
public class Isomorphic {
    public static void main(String[] args) {
     String X = "ACAB", Y = "XCXY";
        System.out.println(isIsomorphic(X, Y));

        String  x = "xbxb", y = "Ybyb";
        System.out.println(isIsomorphic(x,y));

        
    }


    public static boolean isIsomorphic(String a,String b) // & o(n) tc and o(n) sc
    {
        if(a.length() !=b.length()) return false;

        var  map = new java.util.HashMap<Character , Character>();

        for (int i=0 ; i< a.length();i++)
        {
            if(map.containsKey(a.charAt(i)))
            {
                if(map.get(a.charAt(i)) != b.charAt(i))
                return false;
            }

            map.put(a.charAt(i),b.charAt(i));
        }

        return true;
    }
}

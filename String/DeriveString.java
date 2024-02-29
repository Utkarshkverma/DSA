/*

Check if a given string can be derived from another string by circularly rotating it. The rotation can be in a clockwise or anti-clockwise rotation.

Input: X = "ABCD", Y = "DABC"
Output: true
Explanation: "DABC" can be derived from "ABCD" by right-rotating it by 1 unit

*/

package Strings;
import java.util.*;
@SuppressWarnings("unused")
public class DeriveString {

    public static void main(String[] args) {
        String x = "ABCD";
        String y = "DABC";
        System.out.println(isDerivedFrom(x,y));

        String l = "ABCD";
        String r = "PQRS";

        System.out.println(isDerivedFrom(l,r));
        
    }
    
    public static boolean isDerivedFrom(String x, String y) {
         if(x == null || y == null) return false;

         String merge = x+x;

         return merge.contains(y);

    }
}

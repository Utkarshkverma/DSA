/*

Given a set of strings, find their longest common prefix (LCP).

Input: ["technique", "technician", "technology", "technical"]
Output: "techn"

Input: ["techie delight", "tech", "techie", "technology", "technical"]
Output: "tech"

*/

package Strings;
import java.util.*;
public class Longest_Common_Prefix {

    public static void main(String[] args) {

        String [] arr = {"technique", "technician", "technology", "technical"};
        System.out.println(longestCommonPrefix(arr));

        arr = new String[]{"techie delight", "tech", "techie", "technology", "technical"};
        System.out.println(longestCommonPrefix(arr));
        
    }
     
    public static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0){
            return "";
        }

        Arrays.sort(strs);

        String low = strs[0];
        String high = strs[strs.length - 1];
        StringBuffer sb = new StringBuffer();

        for(int i = 0; i < Math.min(low.length(), high.length()); i++){
            if(low.charAt(i) == high.charAt(i)){
                sb.append(low.charAt(i));
            }else{
                break;
            }
        }

        return sb.toString();
    }

}

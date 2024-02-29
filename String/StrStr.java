/*

Given a text and a pattern, return the index of the first occurrence of pattern in text and return -1 if pattern is not part of text.

Input: text = "ABCABAABCABAC", pattern = "ABAA"
Output: 3
Explanation: The pattern occurs only once in the text, starting from index 3.

Input: text = "ABCABAABCABAC", pattern = "CAB"
Output: 2
Explanation: The pattern occurs twice in the text, starting from index 2 and 8. The solution should return the index of the first occurrence, i.e., 2.

*/

package Strings;
public class StrStr {
    public static void main(String[] args) {

        String text = "ABCABAABCABAC";
        String pattern = "CAB";
        
        System.out.println(strStr(text, pattern));
    }

    public static int  strStr(String text, String pattern) {
        if(text == null || pattern == null) return -1;
        if(pattern.length() > text.length()) return -1;

        for(int i  =0;i<text.length()-pattern.length()+1;i++){
            if(text.charAt(i) == pattern.charAt(0))
            {
                if(text.substring(i, i+pattern.length()).equals(pattern));
                return i;
            }
           
    }
    return -1;
}


}

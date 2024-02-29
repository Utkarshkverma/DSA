/*

Run–length encoding (RLE) is a simple form of lossless data compression that runs on sequences with the same value occurring many consecutive times. It encodes the sequence to store only a single value and its count.

Input: "WWWWWWWWWWWWBWWWWWWWWWWWWBBBWWWWWWWWWWWWWWWWWWWWWWWWBWWWWWWWWWWWWWW"
Output: "12W1B12W3B24W1B14W"
Explanation: String can be interpreted as a sequence of twelve W’s, one B, twelve W’s, three B’s, and so on..

*/

package Strings;
public class RLE_Encoding {
    public static void main(String[] args) {
        String ip = "WWWWWWWWWWWWBWWWWWWWWWWWWBBBWWWWWWWWWWWWWWWWWWWWWWWWBWWWWWWWWWWWWWW";
        System.out.println(Encoding(ip));
    }

    public static String Encoding(String s)
    {
        if(s== null || s.length()==0) return "";

        StringBuffer sb = new StringBuffer();
        for(int i = 0;i<s.length();i++)
        {
         int cnt = 1;
         while (i  < s.length()-1 && s.charAt(i) == s.charAt(i + 1))
         {
             cnt++;
             i++;
         }
         sb.append(cnt);
         sb.append(s.charAt(i));
        }

        return sb.toString();
    }
}

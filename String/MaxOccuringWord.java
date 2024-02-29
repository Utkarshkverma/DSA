/*

Given a set of strings with duplicates present, return the maximum occurring word in it. If two words have the same count, return any one of them.

Input: [code, coder, coding, codable, codec, codecs, coded, codeless, codecs, codependence, codex, codify, codependents, codes, code, coder, codesign, codec, codeveloper, codrive, codec, codecs, codiscovered]

Output: codec or codecs

*/




package Strings;
import java.util.*;
public class MaxOccuringWord {
    public static void main(String[] args) {
        String arr[] = {"code", "coder", "coding", "codable", "codec", "codecs", "coded", "codeless", "codecs", "codependence", "codex", "codify", "codependents", "codes", "code", "coder", "codesign", "codec", "codeveloper", "codrive", "codec", "codecs", "codiscovered"};
        System.out.println(max_Occuring_Word(arr));
    }
    public static  String max_Occuring_Word(String str[])
    {
       if(str.length == 0 || str == null) return  "";
       var map = new  HashMap<String,Integer>();

       for(String s: str)
       {
        if(map.containsKey(s))
            map.put(s , map.get(s)+1);

            else map.put(s , 1);
       }

       int MaxCount = Integer.MIN_VALUE;
       String res = "";
       for (Map.Entry<String, Integer> entry : map.entrySet())
       {
        int count = entry.getValue();
        String word = entry.getKey();
        if(count > MaxCount || (count == MaxCount &  word.compareTo(res)<0))
        {
          MaxCount = count;
          res = word;
        }
       }

       return res;
    }
}
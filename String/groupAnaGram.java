/*
Given a list of words, efficiently group all anagrams. The two strings, X and Y, are anagrams if by rearranging X's letters, we can get Y using all the original letters of X exactly once.

Input : ["CARS", "REPAID", "DUES", "NOSE", "SIGNED", "LANE", "PAIRED", "ARCS", "GRAB", "USED", "ONES", "BRAG", "SUED", "LEAN", "SCAR", "DESIGN"]

Output:

{
	["CARS", "ARCS", "SCAR"],
	["REPAID", "PAIRED"],
	["SIGNED", "DESIGN"],
	["LANE", "LEAN"],
	["GRAB", "BRAG"],
	["NOSE", "ONES"],
	["DUES", "USED", "SUED"]
}


Input : ["CARS", "LANE", "ONES"]
Output: {}

The solution should return a set containing all the anagrams grouped together, irrespective of the order.

*/ 
import java.util.*;
public class groupAnagram{
    public static void main(String[] args) {
        String arr[] = {"CARS", "REPAID", "DUES", "NOSE", 
        "SIGNED", "LANE", "PAIRED", "ARCS", "GRAB", "USED", 
        "ONES", "BRAG", "SUED", "LEAN", "SCAR", "DESIGN"};

        System.out.println(groupAnagrams(arr));
    }

    public static  List<List<String>> groupAnagrams(String[] strs){
          var  map = new HashMap<String, List<String>>();

          for(String s : strs)
          {
            char[] ca=s.toCharArray();
            Arrays.sort(ca);
            String key = new String(ca);
            
            if(!map.containsKey(key))
            map.put(key ,new ArrayList<>());

            else 
              map.get(key).add(s);
          }

          return new ArrayList<>(map.values());
    }
}
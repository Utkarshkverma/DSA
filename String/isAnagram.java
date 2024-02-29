/*

Given two strings, determine whether they are anagrams.

Any word that exactly reproduces the letters in another order is an anagram. In other words, X and Y are anagrams if by rearranging the letters of X, we can get Y using all the original letters of X exactly once.

Input: X = "silent", Y = "listen"
Output: true

Input: X = "incest", Y = "insect"
Output: true

*/

package Strings;
import java.util.*;
public class isAnagram {
    public static void main(String[] args) {
        
    }

    public static boolean Anagram(String a, String b) { // ! TC (O^nlogn)
        if(a.length() != b.length()) return false;

        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i = 0;i<arr1.length;i++)
        {
            if(arr1[i]!= arr2[i]) return false;
        }

        return true;
    }
}

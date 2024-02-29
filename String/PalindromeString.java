/*

Given a string, check if it is a palindrome. A palindromic string is a string that remains the same with its characters reversed.

Input : "ABCBA"
Output: true

Input : "ABCA"
Output: false

*/

package Strings;
import java.util.*;
@SuppressWarnings("unused")
public class PalindromeString {
    public static void main(String[] args) 
    {
        System.out.println(isPalindrome("ABCBA"));
        System.out.println(isPalindrome("ABCA"));
    }

    public static boolean  isPalindrome(String s){
        int i = 0;
		int j = s.length()-1;
		
		while(i<j)
		{
		if(s.charAt(i)==s.charAt(j))
		{
			i++;
			j--;
		}
		else{
			return false;
		}
		}
		
		return true;
    }
}

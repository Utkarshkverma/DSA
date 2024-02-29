/*

Given an integer representing the capacity of a cyber cafe and a sequence representing entry/exit logs of customers, find the total number of customers who could not get any computer.

The first occurrence in the given sequence indicates the arrival, and the second occurrence indicates the departure for a customer. A customer cannot be serviced when the cafe capacity is full (when all computers are allocated).

Input:

sequence = "ABCDDCEFFEBGAG"
capacity = 3

Output: 2

Explanation: Customers 'D' and 'F' left unattended


Input:

sequence = "ABCDDCBEFFEGAG"
capacity = 2

Output: 3

Explanation: Customers 'C', 'D', and 'F' left unattended

*/

package Strings;
import java.util.*;
public class UnattendedCustomerCount {
    public static void main(String[] args) {
        String seq1 = "ABCDDCEFFEBGAG";
        int cap1 = 3;

        System.out.println(counts(seq1,cap1));

        String seq2 = "ABCDDCBEFFEGAG";
        int cap2 = 2;

        System.out.println(counts(seq2,cap2));
        
    }

    public static int counts(String customer,int capacity) // ! O(n) TC O(n) SC
    {
        if(customer == null || customer.length() == 0)
        return 0;
        var visited = new HashSet<Character>();
        var allocated = new HashSet<Character>();

        int notAllocated = 0;

        for(char c : customer.toCharArray())
        {
         if(!visited.contains(c))
         {
            visited.add(c);
           if(allocated.size()<capacity)
           {
             allocated.add(c);
           }

           else{
            notAllocated++; 
           }
         }

         else{
            visited.remove(c);
            allocated.remove(c);
         }
        }

        return notAllocated;
    }
}

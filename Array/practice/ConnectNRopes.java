/*

Given n ropes of different lengths, connect them into a single rope with minimum cost. Assume that the cost to connect two ropes is the same as the sum of their lengths.

Input: [5, 4, 2, 8]
Output: 36
Explanation: The total cost for connecting all ropes is 6 + 11 + 19 = 36.

[5, 4, 2, 8] –> First, connect ropes of lengths 4 and 2 that will cost 6.
[5, 6, 8]    –> Next, connect ropes of lengths 5 and 6 that will cost 11.
[11, 8]      –> Finally, connect the remaining two ropes that will cost 19.

*/


import java.util.*;
public class ConnectNRopes {
    public static void main(String[] args) {
      List<Integer> list = new ArrayList<>();
      list.add(5);
      list.add(4);
      list.add(2);
      list.add(8);
      System.out.println(cost(list));
    }

    public static int cost(List<Integer> arr){
        if (arr == null || arr.size() == 0) return 0;

        var pq = new PriorityQueue<Integer>(arr);
        int cost = 0;

        while(pq.size()>1)
        {
            int a = pq.poll();
            int b = pq.poll();

            int sum = a+b;
            pq.add(sum);
            cost +=sum;
        }

        return  cost;
    }
}

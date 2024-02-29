/*

Check if a given set of moves is circular or not. A move is circular if its starting and ending coordinates are the same. The moves can contain instructions to move one unit in the same direction (M), to change direction to the left of current direction (L), and to change direction to the right of current direction (R).

Input: "MRMRMRM"
Output: true

Input: "MRMLMRMRMMRMM"
Output: true

Assume that the initial direction is North.

*/

package Strings;
public class CircularMoves {

    public static void main(String[] args) {
        String move1 = "MRMRMRM";
        System.out.println(circularMove(move1));
        String move2 = "MRMLMRMRMMRMM";
        System.out.println(circularMove(move2));
        String move3 =  "MRMLMRMRMMMM";
        System.out.println(circularMove(move3));

    }

    public static  boolean circularMove(String s)
    {
      int x = 0;
      int y = 0;

      char dir = 'N';

      for(int i = 0;i<s.length();i++)
      {
        switch(s.charAt(i))
        {
            case 'M':
            if(dir == 'N') y++;
            else if (dir == 'S') y--;
            else if (dir == 'E')  x++;
            else x--;
            break;

            case 'L':
            if(dir == 'N') dir = 'W';
            else if(dir == 'S') dir = 'E';
            else if(dir == 'E')  dir = 'N';
            else dir = 'S';
            break;

            case 'R' :
            if(dir == 'N') dir = 'E';
            else if(dir == 'S') dir = 'W';
            else if(dir == 'E') dir = 'S';
            else dir = 'N';
            break;

        }
      }

      return(x == 0 && y == 0);
    }
    
}

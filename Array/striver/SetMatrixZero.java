import java.util.*;
public class SetMatrixZero {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));



        // ArrayList<ArrayList<Integer>> ans = zeroMatrix(matrix);

        // System.out.println("The Final matrix is: ");
        // for (ArrayList<Integer> row : ans) {
        //     for (Integer ele : row) {
        //         System.out.print(ele + " ");
        //     }
        //     System.out.println();
        // }

        System.out.println(zeroMatrix2(matrix));
        
    }

    public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix) // ! O(n^3)
    {
        int n = matrix.size(); // rows
        int m = matrix.get(0).size(); // column

        for(int i = 0;i<n;i++)
        {
            for(int j  = 0;j<m;j++)
            {
                if(matrix.get(i).get(j) == 0)
                {
                    // Mark all row and columns as -1 to keep the mark
                    markRow(matrix,m,i);
                    markColumn(matrix, n, j);
                }
            }
        }

        for(int i  = 0;i<n;i++)
        {
            for(int j = 0;j<m;j++)
            {
                if(matrix.get(i).get(j) == -1)
                matrix.get(i).set(j,0);
            }
        }

        return matrix;
    }

    public static void markRow(ArrayList<ArrayList<Integer>> matrix, int m, int i)
    {
       for(int j = 0;j<m;j++)
       {
        if(matrix.get(i).get(j) !=0)
        matrix.get(i).set(j,-1);
       }
    }

    public static void markColumn(ArrayList<ArrayList<Integer>> matrix, int n, int j)
    {
        for(int i = 0;i<n;i++)
        {
            if(matrix.get(j).get(i) !=0)
            {
                matrix.get(i).set(j,-1);
            }
        }
    }


    public static  ArrayList<ArrayList<Integer>> zeroMatrix2(ArrayList<ArrayList<Integer>> matrix)
    {
        int n = matrix.size();
        int m = matrix.get(0).size();

        int rowMatrix[] =  new int[n];
        int colMatrix[] = new int[m];

        for(int i = 0;i<n;i++)
        {
            for(int j  = 0;j<m;j++)
            {
                if(matrix.get(i).get(j)==0){
                  rowMatrix[i] = 1;
                  colMatrix[j] = 1;
                }
            }
        }

        for(int i = 0;i<n;i++)
        {
            for(int j =0;j<m;j++)
            {
                if(rowMatrix[i]== 1 || colMatrix[j]==1)
                {
                    matrix.get(i).set(j,0);
                }
            }
        }

        return matrix;
    }
}

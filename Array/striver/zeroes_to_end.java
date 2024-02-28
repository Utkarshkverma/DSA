public class zeroes_to_end {
    public static void main(String[] args) {
        System.out.println("Hey");
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int n = 10;
        int[] ans = move_zeroes_to_end(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
     
    public static int[] move_zeroes_to_end(int[] zeroes) {
        int first = -1;
        for(int i=0;i<zeroes.length;i++)
        {
            if(zeroes[i]==0)
            {
                first = i;
                break;
            }
        }

        for(int j = first+1;j<zeroes.length;j++)
        {
            if(zeroes[j]!=0)
            {
                int temp = zeroes[j];
                zeroes[j] = zeroes[first];
                zeroes[first] = temp;
                first++;
            }
        }
        return zeroes;
    }

}

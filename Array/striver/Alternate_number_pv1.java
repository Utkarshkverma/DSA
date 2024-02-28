public class Alternate_number_pv1 {
    public static void main(String[] args) {
        int arr[] = {1,-2,-3,4};
        alternateNumber(arr);
    }

    public static void alternateNumber(int[] n) {
        int pIndex = 0;
        int nIndex = 1;

        int ans[] = new int[n.length];

        for(int i = 0; i < n.length; i++)
        {
            if(n[i] >0)
            {
             ans[pIndex] = n[i];
             pIndex +=2;
            }
            else{
             ans[nIndex] = n[i];
             nIndex +=2;
            }
        }

        for(int i = 0; i < n.length; i++)
        {
            System.out.print(ans[i]+" ");
        }

    }
}

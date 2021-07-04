public class searchRowWiseColumnWiseSortedMatrix {
    public static void main(String[] args) {
        int A[][]= { {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9} };
        int B = 2;
        int r=-1;int c=-1;
        /*Best corner to start will be Top right or bottom left
         check for the presence of no to be searched is nearest to which corner b/w these two
         start from there to look for the number.
         No to be searched is 2 so start from Top right corner , if no to be saerched
         for is 9 then start from bottom left as 9 is nearer to 7 i.e. (9-7) < (9-3);
         */

        int sol=0;
        for(int i=0;i<A.length;i++){
            for(int j=A[i].length-1;j>=0;j--){
                if(A[i][j]>B)
                    continue;
                else if(A[i][j]<B)
                    break;
                else if(A[i][j]==B){
                    r=i+1;c=j+1;
                }
            }
            if(r!=-1 && c!=-1)
                break;
        }
        if(r!=-1 && c!=-1)
            sol = (r*1009)+c;
        else
            System.out.println("-1");
        System.out.println(sol);
    }
}

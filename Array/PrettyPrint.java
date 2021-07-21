/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Solution {
    public int[][] prettyPrint(int A) {
        int m= (2*A)-1;
    int[][]arr = new int[m][m];
    int s=0;
    while(A>0)
    {
        
    
    for(int i=s;i<m;i++)
    {
        for(int j=s;j<m;j++)
        {
            arr[i][j] = A;
        }
    }
    A--;
    s++;
    m--;
    }
    return arr;
    }
}

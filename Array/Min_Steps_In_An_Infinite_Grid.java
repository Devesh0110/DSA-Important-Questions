nput Format
Given two integer arrays A and B, where A[i] is x coordinate and B[i] is y coordinate of ith point respectively.



Output Format
Return an Integer, i.e minimum number of steps.



Example Input
Input 1:

 A = [0, 1, 1]
 B = [0, 1, 2]


Example Output
Output 1:

 2


Example Explanation
Explanation 1:

 Given three points are: (0, 0), (1, 1) and (1, 2).
 It takes 1 step to move from (0, 0) to (1, 1). It takes one more step to move from (1, 1) to (1, 2).



     
     
     
     
     
     
     



public class Solution {
    public int coverPoints(int[] x, int[] y) {
         int n=x.length,ans=0;
    for(int i=0;i<n-1;i++){
        if(Math.abs(x[i]-x[i+1])<=Math.abs(y[i]-y[i+1]))
         ans+=Math.abs(y[i]-y[i+1]);
        else{
            ans+=Math.abs(x[i]-x[i+1]);
        }
    }
    return ans;
    }
}

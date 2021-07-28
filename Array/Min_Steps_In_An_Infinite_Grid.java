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
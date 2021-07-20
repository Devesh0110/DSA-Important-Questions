/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

//substract contiguous (n-b) elements sum fom total sum of elements
public class Pickfrombothsides {
    public int solve(int[] a, int b) {
        int s1=0;
        int s2=0;
        int min1=0;
        int min2=0;
        int n=a.length;
        for(int i1=0;i1<n;i1++){
            //a[i1]=sc.nextInt();
            s1=s1+a[i1];
        }
        int i=0;
        int t=a.length-b-1;
        for(int i1=i;i1<=t;i1++){
            s2+=a[i1];
        }
        min1=s2;
        i++;
        t++;
        while(t<a.length){
            s2+=(a[t]-a[i-1]);
            min1=Math.min(s2,min1);
            i++;
            t++;
        }
        return (s1-min1);
    }
}


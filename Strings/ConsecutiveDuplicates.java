public class Solution {
    public String solve(String A, int B) {
       int len = A.length();
    char[] chArr = A.toCharArray();
    int i, j;
    String res = "";
    for(i=0; i<len;) {
        int count = 1;
        for(j=i+1; j<len; j++) {
            if(chArr[j] == chArr[i]) {
                count++;
            } else {
                break;
            } 
        }
        if(count < B){
            res +=A.substring(i,j);
        } 
        i = j;
    }
    return res;
}
}
Problem Description

Given a string A and integer B, remove all consecutive same characters that have length exactly B.
    
Input Format
First Argument is string A.
Second argument is integer B.

Output Format
Return a string after doing the removals.

Example Input
Input 1:

A = "aabcd"
B = 2
    
Input 2:

A = "aabbccd"
B = 2
    
Example Output
Output 1:

 "bcd"
Output 2:

 "d"





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

Given a string S consisting of lowercase Latin Letters. Find the first non-repeating character in S.

Example 1:

Input:
S = hello
Output: h
Explanation: In the given string, the
first character which is non-repeating
is h, as it appears first and there is
no other 'h' in the string.
Example 2:

Input:
S = zxvczbtxyzvy
Output: c
Explanation: In the given string, 'c' is
the character which is non-repeating. 





class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
        //Your code here
        //Your code here
        int[] count= new int[256];
        for(int i=0;i<S.length();i++){
            count[S.charAt(i)]++;
        }
        for(int i=0;i<S.length();i++){
            if(count[S.charAt(i)]==1){
                return S.charAt(i);
            }
        }
        return '$';
    }
}

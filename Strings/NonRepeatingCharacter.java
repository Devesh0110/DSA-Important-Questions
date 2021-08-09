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

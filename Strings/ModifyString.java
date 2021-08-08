Ishaan is playing with strings these days. He has found a new string. He wants to modify it as per the following rules to make it valid:

The string should not have three consecutive same characters (Refer example for explanation).
He can add any number of characters anywhere in the string. 
Find the minimum number of characters which Ishaan must insert in the string to make it valid.

Example 1:

Input:
S = aabbbcc
Output: 1
Explanation: In aabbbcc 3 b's occur
consecutively, we add a 'd',and Hence,
output will be aabbdbcc.
Example 1:

Input:
S = aaaaa
Output: 2
Explanation:  In aaaaa 5 a's occur
consecutively,we need to add 2 'b', and
Hence, the output will be aababaa.




class Solution
{
    //Function to find minimum number of characters which Ishaan must insert  
    //such that string doesn't have three consecutive same characters.
    public static long modified(String a)
    {
        // Your code here
        long ans=0;
        int same=1;
        for(long i = 1; i < a.length(); i++)
        {
            if(a.charAt((int)i) == a.charAt((int)i-1))
                same++;
            else
            {
                ans += (same-1)/2;
                same = 1;
            }
        }
        ans += (same-1)/2;
        //returning the answer.
        return ans;
    }
}

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

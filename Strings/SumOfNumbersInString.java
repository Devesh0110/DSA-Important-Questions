class Solution
{
    //Function to calculate sum of all numbers present in a string.
    public static long findSum(String str)
    {
        // your code here
         String temp = "0";
 
        // holds sum of all numbers present in the string
        int sum = 0;
 
        // read each character in input string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
 
            // if current character is a digit
            if (Character.isDigit(ch))
                temp += ch;
 
            // if current character is an alphabet
            else {
                // increment sum by number found earlier
                // (if any)
                sum += Integer.parseInt(temp);
 
                // reset temporary string to empty
                temp = "0";
            }
        }
 
        // atoi(temp.c_str()) takes care of trailing
        // numbers
        return sum + Integer.parseInt(temp);
    }
    
}

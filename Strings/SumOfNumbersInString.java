Given a string str containing alphanumeric characters. The task is to calculate the sum of all the numbers present in the string.

Example 1:

Input:
str = 1abc23
Output: 24
Explanation: 1 and 23 are numbers in the
string which is added to get the sum as
24.
Example 2:

Input:
str = geeks4geeks
Output: 4
Explanation: 4 is the only number, so the
sum is 4.







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

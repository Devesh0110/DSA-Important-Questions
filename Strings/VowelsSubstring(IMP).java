Given a string A consisting of lowercase characters.

You have to find the number of substrings in A which starts with vowel and end with consonants or vice-versa.

Output Format
Return a integer denoting the the number of substrings in A which starts with vowel and end with consonants or vice-versa with modulo 109 + 7.



Example Input
Input 1:

 A = "aba"
Input 2:

 A = "a"


Example Output
Output 1:

 2
Output 2:

 0 
     
     


public class Solution {
    public int solve(String A) {
        // Count the number of vowels and the number of consonants and return their product
        int vowels = 0;
        int consonant = 0;
        int n = A.length();
        for(int i = 0; i<n; i++){
            if(isVowel(A.charAt(i))){
                vowels++;
            }
            else{
                consonant++;
            }
        }
        return (vowels*consonant)%(1000000007);
        
    }
    public boolean isVowel(char c){
        if(c== 'a' || c== 'e' || c== 'i' || c== 'o' || c== 'u'){
            return true;
        }
        return false;
    }
}

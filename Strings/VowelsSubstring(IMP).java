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

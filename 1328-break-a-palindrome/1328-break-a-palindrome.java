class Solution {
    public String breakPalindrome(String palindrome) {
        int len = palindrome.length();
        if(len == 1){
            return "";
            
        }
        char[] palindromeArr = palindrome.toCharArray();
        for(int i = 0; i < len /2; i++){
            if(palindromeArr[i] != 'a'){
                palindromeArr[i] = 'a';
                return String.valueOf(palindromeArr);
            }
        }
        palindromeArr[len-1] = 'b';
        return String.valueOf(palindromeArr);
        
    }
}
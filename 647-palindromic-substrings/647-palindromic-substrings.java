class Solution {
    private boolean isPalindrome(String s, int start, int end){
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
                
            }
               start++;
                end--;
            
        }
        return true;
    }
    public int countSubstrings(String s) {
        int ans = 0;
        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length() ; j++){

            ans += isPalindrome(s, i, j)? 1: 0;
            }
        }
        return ans;
        
    }
}
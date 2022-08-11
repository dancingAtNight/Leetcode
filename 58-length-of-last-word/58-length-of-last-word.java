class Solution {
    public int lengthOfLastWord(String s) {
        int p = s.length() -1;
        while(p >= 0 && s.charAt(p) == ' '){
            p--;
        } 
        
        int len = 0;
        while(p >= 0 && s.charAt(p) != ' '){
            p--;
            len++;

        
        }
        return len;
    }
}
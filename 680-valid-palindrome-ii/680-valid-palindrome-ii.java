class Solution {
   public static boolean validPalindrome(String s) {
       if(s == null || s.length() == 0) {
           throw new IllegalArgumentException();
       }
     int i = 0, j = s.length() -1;
       while(i < j){
           if(s.charAt(i) != s.charAt(j)){
               return (checkPalindrome(s, i, j-1) )|| (checkPalindrome(s, i+1, j));
           }
           i++;
           j--;
}
       return true;
       
       
    }
    public static boolean checkPalindrome(String s, int i, int j){
        while( i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
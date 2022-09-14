class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0) return 0;
        
        int maxLen = 0;
        Map<Character, Integer> map = new HashMap<>();
        
        for(int left = 0, right = 0; right < s.length() ; right++){
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1 );
            
            while(map.get(s.charAt(right)) > 1){
                map.put(s.charAt(left), map.get(s.charAt(left)) -1);
                left++;
                
            }
            maxLen = Math.max(maxLen, right - left +1);
            
            
            

        }
        return maxLen;
        
    }
}
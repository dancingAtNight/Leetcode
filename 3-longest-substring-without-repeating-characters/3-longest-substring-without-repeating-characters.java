class Solution {
    public int lengthOfLongestSubstring(String s) {
 Map<Character, Integer> map = new HashMap<>();
        int left = 0, right = 0;
        int max = 0;
        while(right < s.length()){
        char c = s.charAt(right);
        right++;
        
        map.put(c, map.getOrDefault(c, 0) + 1);
        while(map.get(c) > 1){
            char d = s.charAt(left);
            left++;
            map.put(d, map.get(d) -1);
            
        
        }
            max = Math.max(max, right - left);
        }
        return max;
}
}
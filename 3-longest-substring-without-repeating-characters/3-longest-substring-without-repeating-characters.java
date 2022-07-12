class Solution {
    public int lengthOfLongestSubstring(String s) {
 Map<Character, Integer> map = new HashMap<>();
        int max = 0;
for(int left = 0, right = 0; right < s.length(); right++){
        char c = s.charAt(right);
        map.put(c, map.getOrDefault(c, 0) + 1);
        while(map.get(c) > 1){
            char d = s.charAt(left);
            left++;
            map.put(d, map.get(d) -1);
            
        
        }
            max = Math.max(max, right - left + 1);
        }
        return max;
}
}
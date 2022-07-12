class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int max = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int left = 0, right = 0; right < s.length(); right++){
            char c = s.charAt(right);
            map.put(c, map.getOrDefault(c, 0) + 1);
            while(map.size() > 2){
                char l = s.charAt(left);
                map.put(l, map.get(l) -1);
                left++;
                if(map.get(l) == 0) map.remove(l);
            
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
        
    }
}
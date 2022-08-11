class Solution {
    public int lengthOfLongestSubstring(String s) {
        //sliding window
        HashMap<Character, Integer> map = new HashMap<>();
        int longest = 0;
        for(int left = 0, right = 0; right < s.length(); right++){
            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
           while(map.get(ch) > 1){
               map.put(s.charAt(left), map.get(s.charAt(left)) -1);
               left++;
               if(map.get(s.charAt(left)) == 0) {
                   map.remove(s.charAt(left));
               }
                  
        }
            longest= Math.max(longest, right - left + 1);
        
    }
        return longest;
}
}
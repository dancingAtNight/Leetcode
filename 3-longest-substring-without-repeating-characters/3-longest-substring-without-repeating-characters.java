class Solution {
    public int lengthOfLongestSubstring(String s) {
        //sliding window
        HashMap<Character, Integer> map = new HashMap<>();
        int longest = 0;
        for(int left = 0, right = 0; right < s.length(); right++){
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);
           while(map.get(s.charAt(right)) > 1){
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
class Solution {
    public int longestSubstring(String s, int k) {
      return helper(s.toCharArray(), 0, s.length(), k);
    }

    static int helper(char[] ch, int start, int end, int k) {
        if(end - start < k) return 0;
        int[] count = new int[26];
        for(int i = start; i < end; i++){
            count[ch[i] -'a']++;
        }
        for(int i = start; i < end; i++){
            if(count[ch[i] -'a'] < k){
                int j = i+1;
                while(j < end && count[ch[j] -'a'] < k){
                    j++;
                }
                int a = helper(ch, start, i, k);
                int b = helper(ch, j,end, k );
                return Math.max(a,b);

            }

        }
        return end - start;
    }

}
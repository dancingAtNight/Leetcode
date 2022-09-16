class Solution {
  public int minSteps(String s, String t) {
    int ans = 0;
    int[] sCounter = new int[26], tCounter = new int[26];
    for(char ch: s.toCharArray()) sCounter[ch - 'a']++;
    for(char ch: t.toCharArray()) tCounter[ch - 'a']++;
    for (int i = 0; i < 26; i++) ans += Math.abs(sCounter[i] - tCounter[i]);
    return ans;
}
}
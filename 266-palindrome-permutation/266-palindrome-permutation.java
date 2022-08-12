class Solution {
    public boolean canPermutePalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        
        int count = 0;
        for(char key: map.keySet()){
            count += map.get(key) % 2;

        }
        return count <= 1;
        
    }
}
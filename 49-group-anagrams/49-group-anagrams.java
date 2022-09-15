class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        
        if(strs == null || strs.length == 0) return res;
        for(int i = 0; i < strs.length; i++){
            String str = strs[i];
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String s = String.valueOf(ch);
            if(!map.containsKey(s)){
                map.put(s, new ArrayList<>());
            }
            map.get(s).add(strs[i]);
            
        }
        return new ArrayList<>(map.values());
        
    }
}
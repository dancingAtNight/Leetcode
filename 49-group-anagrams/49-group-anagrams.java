class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        
        /*
        "eat"  -> ate
        
        
        */
        
        if (strs == null || strs.length == 0) return res;
        for(String str: strs){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String s = String.valueOf(ch);
            
            if(!map.containsKey(s)){
                map.put(s, new ArrayList<>());
                
            }
            map.get(s).add(str);
        }
        return new ArrayList<>(map.values());
        
    }
}
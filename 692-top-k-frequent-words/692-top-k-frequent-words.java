import java.util.Map.Entry;
class Solution {
 public static List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
        List<String>  res = new ArrayList(map.keySet());
        Collections.sort(res,(w1, w2) -> map.get(w1).equals(map.get(w2))? w1.compareTo(w2): map.get(w2) - map.get(w1));
        return res.subList(0, k);
    }
}
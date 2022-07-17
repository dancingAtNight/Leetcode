class Solution {
    public static String mostCommonWord(String paragraph, String[] banned) {
        Map<String, Integer> map = new HashMap<>();
        String[] words = paragraph.replaceAll("\\pP", " ").toLowerCase().split("\\s+");
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        for (String banWord : banned) {
            if (map.containsKey(banWord)) {
                map.remove(banWord);
            }
        }
        String res = " ";
        for (String word : map.keySet()) {
            if (res == " " || map.get(word) > map.get(res)) {
                res = word;
            }
        }
        return res;
    }
}
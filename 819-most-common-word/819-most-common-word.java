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
       PriorityQueue<Map.Entry<String, Integer>> maxHeap = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        maxHeap.addAll(map.entrySet());
        return maxHeap.poll().getKey();
        }
}
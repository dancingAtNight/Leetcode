class Solution {
    Map<Integer, Integer> cache = new HashMap<>(Map.of(0, 0, 1, 1, 2, 1));
    public int tribonacci(int n) {
        if(cache.containsKey(n)){
            return cache.get(n);
        }
        cache.put(n, tribonacci(n-3) + tribonacci(n-2) + tribonacci(n-1)) ;
        return cache.get(n);
        
        
    }
}
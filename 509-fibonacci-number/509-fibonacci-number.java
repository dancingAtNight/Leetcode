class Solution {
    private Map<Integer, Integer> cache = new HashMap<>(Map.of(0, 0, 1, 1));
    public int fib(int n) {
        if(cache.containsKey(n)){
            return cache.get(n);
            }
           cache.put(n, fib(n - 1) + fib(n-2));
            return cache.get(n);
                    
          
   
    }  
}
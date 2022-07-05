class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums == null || nums.length == 0) return null;
        if(nums.length == k) return nums;
 
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        Queue<Integer> heap = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));
        
        for(int i : map.keySet()){
            heap.add(i);
            if(heap.size() > k){
                heap.poll();
            }
        }
        int[] arr = new int[k];
        for(int i = k-1; i >= 0; i--){
arr[i] = heap.poll();
        }
        return arr;
        
    }
}
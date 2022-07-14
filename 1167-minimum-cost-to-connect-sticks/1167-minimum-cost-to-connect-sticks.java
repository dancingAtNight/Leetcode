class Solution {
    public int connectSticks(int[] sticks) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int stick: sticks){
            minHeap.offer(stick);
        }
        int temp = 0, res = 0;
        while(minHeap.size() > 1){
            temp = minHeap.poll() + minHeap.poll();
            res += temp;
            minHeap.offer(temp);
        }
        return res;
    }
}
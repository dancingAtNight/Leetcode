class Solution {
    public int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals, ((int[] a, int[] b) -> (a[0] - b[0])));
       PriorityQueue<Integer> pq = new PriorityQueue<>();
       pq.offer(intervals[0][1]);
       for(int i = 1; i < intervals.length; i++){
           if(intervals[i][0] >= pq.peek()){
               pq.poll();
           }
           pq.offer(intervals[i][1]);
       }
       return pq.size();
}
}
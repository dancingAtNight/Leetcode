class Solution {
    public int[][] merge(int[][] intervals) {
        LinkedList<int[]> res  = new LinkedList<>();
        Arrays.sort(intervals, (a, b) -> {return a[0] - b[0];
                                         });
        res.add(intervals[0]);
        for(int i = 1; i < intervals.length; i++){
            int[] curr = intervals[i];
            int[] last = res.getLast();
            if(curr[0] <= last[1]){
                last[1] = Math.max(last[1] , curr[1]);
                
            }else{
                res.add(curr);
            }
        }
        return res.toArray(new int[0][0]);
        
    }
}
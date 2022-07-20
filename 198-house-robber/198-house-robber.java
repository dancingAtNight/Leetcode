class Solution {
    public int rob(int[] nums) {
        int len = nums.length;
        if(len == 0) return 0;
        int[] f = new int[len+ 1];
        f[len] = 0;
        f[len -1] = nums[len-1];
        for(int i = len -2; i >= 0; i--){
        f[i] = Math.max(f[i+1],  f[i+2] + nums[i]);
            }
            return f[0];
            
        
        
        
        
    }
}
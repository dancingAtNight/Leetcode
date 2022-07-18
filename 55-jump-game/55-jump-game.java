class Solution {
    public boolean canJump(int[] nums) {
        //确定状态（
        int len = nums.length;
    int farthest = 0;
    for(int i = 0; i < len-1; i++){
        farthest = Math.max(farthest, i+ nums[i]);
        if(farthest <= i){
                return false;}
    }
        return farthest >= len-1;
    }
}
class Solution {
    public int twoSumLessThanK(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        int sum = -1;
        while(left < right){
            if(nums[left] + nums[right] < k){
                sum = Math.max(sum, nums[left] + nums[right]);
                left++;
            }else{
                right--;
            }
            
        
    }
        return sum;
}
}
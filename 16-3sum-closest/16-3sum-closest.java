class Solution {
   public int threeSumClosest(int[] nums, int target) {
        if(nums.length < 3) return 0;
        Arrays.sort(nums);
        int temp = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length -2; i++){
            int sum = nums[i] + twoSumClosest(nums, i+ 1, target -nums[i]);
            if(Math.abs(temp) > Math.abs(target -sum)){
                temp = target - sum;
            }
        }
        return target - temp;
    }
    private int twoSumClosest(int[] nums, int start, int target){
        int left = start, right = nums.length -1;
        int temp = Integer.MAX_VALUE;
        while(left < right){
            int sum = nums[left] + nums[right];
            if(Math.abs(temp)  > Math.abs(target - sum)){
                temp = target - sum;
            }
            if(sum < target){
                left++;
            }else{
                right--;
            }
        }
        return target - temp;
    }
    
}
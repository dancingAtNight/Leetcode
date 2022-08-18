class Solution {
    public double average(int[] salary) {
        Double sum = 0.0; 
        int mini = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int num: salary){
            mini = Math.min(mini, num);
            max = Math.max(max, num);
            sum += num;
}
        return (sum - max - mini)/(salary.length -2);
    }
}
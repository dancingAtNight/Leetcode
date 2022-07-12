class Solution {
   public int numTrees(int n) {
        // Memorization.
        int[] memo = new int[n + 1];        
        Arrays.fill(memo, -1);
        // Base case.
        memo[0] = 1;
        memo[1] = 1;
        
        return numTrees(n, memo);
    }
    
    private int numTrees(int n, int[] memo) {
        if (memo[n] != -1)
            return memo[n];

        // Recursive case.
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int leftRes = numTrees(n - i - 1, memo);
            memo[n - i - 1] = leftRes;
            int rightRes = numTrees(i, memo);
            memo[i] = rightRes;
            sum += leftRes * rightRes;
        }
        return sum;
    }
}
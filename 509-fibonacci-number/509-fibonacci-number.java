class Solution {
    public int fib(int n) {
        if(n <= 1) return n;
        int[] f = new int[2];
        f[0] = 0;
        f[1] = 1;
        for(int i = 2; i <= n; i++){
         int sum = f[0] + f[1];
            f[0] = f[1];
            f[1] = sum;
        }
        return f[1];
        
    }
}
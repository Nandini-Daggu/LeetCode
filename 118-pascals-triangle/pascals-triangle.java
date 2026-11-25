class Solution {
    int[][] dp;
    public List<List<Integer>> generate(int n) {
        dp = new int[n][n];
        List<List<Integer>> lst = new ArrayList<>();
        for(int i = 0;i<n;i++){
            dp[i][0] = 1;
            dp[i][i] = 1;
            for(int j = 1;j<i;j++){
                dp[i][j] = dp[i-1][j]+dp[i-1][j-1];
            }
            List<Integer> ans = new ArrayList<>();
            for(int j = 0;j<=i;j++){
                ans.add(dp[i][j]);
            }
            lst.add(ans);
        }
        return lst;
    }
}
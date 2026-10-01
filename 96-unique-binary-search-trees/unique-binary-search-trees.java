class Solution {
    public int numTrees(int n) {
        int[] arr = new int[n+1];
        arr[0] = 1;
        arr[1] = 1;
        for(int i = 2;i<=n;i++){
            for(int j = 1;j<=i;j++){
                int left = arr[j-1];
                int right = arr[i-j];
                arr[i] += left*right; 
            }
        }
        return arr[n];
    }
}
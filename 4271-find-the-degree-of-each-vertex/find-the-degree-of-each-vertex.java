class Solution {
    public int[] findDegrees(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int[] arr = new int[r];
        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                if(matrix[i][j]==1){
                    arr[j]++;
                }
            }
        }
        return arr;
    }
}
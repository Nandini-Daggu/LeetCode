class Solution {
    public int minMoves(int[] nums) {
        int min = nums[0];
        int count = 0;
        for(int ele:nums){
            min = Math.min(ele,min);
        }
        for(int ele:nums){
            count+=ele-min;
        }
        return count;
    }
}
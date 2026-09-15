class Solution {
    public int[] singleNumber(int[] nums) {
        int[] ans = new int[2];
        int res = 0;
        for(int i = 0;i<nums.length;i++){
            res ^=nums[i]; 
        }
        int bit = res&-res;
        int num1 = 0,num2=0;
        for(int num:nums){
            if((num&bit)!=0){
                num1^=num;
            }
            else{
                num2^=num;
            }
        }
        ans[0] = num1;
        ans[1] = num2;
    return ans;
    }
}
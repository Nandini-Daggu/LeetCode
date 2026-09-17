class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            int count = mp.getOrDefault(nums[i],0)+1;
            mp.put(nums[i],count);
            if(count>nums.length/2)
                return nums[i];
        }
        return -1;
    }
}
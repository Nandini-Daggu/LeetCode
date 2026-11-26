class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int[] arr = new int[nums.size()];
        for(int i = 0;i<nums.size();i++){
            arr[i] = nums.get(i);
        }
        int min = Integer.MAX_VALUE;
        for(int k = l;k<=r;k++){
            int s = sum(arr,k);
            if(s!=-1){
                min = Math.min(min,s);
            }
        }
        return min == Integer.MAX_VALUE?-1:min;
    }
    public int sum(int[] arr,int l){
        int min =  Integer.MAX_VALUE;
        for(int i = 0;i<=arr.length-l;i++){
            int sum = 0;
            for(int j = i;j<i+l;j++){
                sum+=arr[j];
            }
            if(sum>0){
                min = Math.min(min,sum);
            }
        }
        if(min==Integer.MAX_VALUE) return -1;
        return min;
    }
}
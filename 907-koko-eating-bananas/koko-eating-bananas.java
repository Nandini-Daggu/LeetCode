class Solution {
    public int minEatingSpeed(int[] piles, int high) {
        int low = 1,ans = -1;
        int h = Arrays.stream(piles).max().getAsInt();
        while(low<=h){
            int mid = low+(h-low)/2;
            long time = helper(piles,mid);
            if(time<=high){
                ans = mid;
                h = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
    public long helper(int[] piles,int mid){
        long time = 0;
        for(int ele:piles){
            time+=(ele+mid-1)/mid;
        }
        return time;
    }
}
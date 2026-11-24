class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> st = new HashSet<>();
        for(int ele:nums){
            st.add(ele);
        }
        if(st.size()<3) return Collections.max(st);
        st.remove(Collections.max(st));
        st.remove(Collections.max(st));
        return Collections.max(st);
    }
}
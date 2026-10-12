class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> st = new HashSet<>();
        Set<Integer> res = new HashSet<>();
        for(int ele:nums1){
            st.add(ele);
        }
        for(int ele:nums2){
            if(st.contains(ele)){
                res.add(ele);
            }
        }
        int[] arr = new int[res.size()];
        int i = 0;
        for(int ele:res){
            arr[i++] = ele;
        }
        return arr;
    }
}
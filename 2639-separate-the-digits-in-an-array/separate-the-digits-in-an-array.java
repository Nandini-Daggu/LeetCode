class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> lst = new ArrayList<>();
        for(int num: nums){
            int[] digit = new int[10];
            int ind = 0;
            while(num!=0){
                digit[ind++] = num%10;
                num/=10;
            }
            for(int i = ind-1;i>=0;i--){
                lst.add(digit[i]);
            }
        }
        int[] arr = new int[lst.size()];
        for(int i = 0;i<lst.size();i++){
            arr[i] = lst.get(i);
        }
        return arr;
    }
}
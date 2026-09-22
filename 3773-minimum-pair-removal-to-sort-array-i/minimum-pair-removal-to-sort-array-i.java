class Solution {
    public int minimumPairRemoval(int[] nums) {
        List<Integer> lst = new ArrayList<>();
        for(int num:nums) lst.add(num);
        int op = 0;
        while(true){
            boolean sorted = true;
            for(int i = 0;i<lst.size()-1;i++){
                if(lst.get(i)>lst.get(i+1)){
                    sorted = false;
                    break;
                }
            }
            if(sorted) return op;
            int min = Integer.MAX_VALUE;
            int ind = -1;
            for(int i = 0;i<lst.size()-1;i++){
                int sum = lst.get(i)+lst.get(i+1);
                if(sum<min){
                    min = sum;
                    ind = i;
                }
            }
            lst.set(ind,min);
            lst.remove(ind+1);
            op++;
        }
    }
}
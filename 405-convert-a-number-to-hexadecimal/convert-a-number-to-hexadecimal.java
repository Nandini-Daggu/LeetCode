class Solution {
    public String toHex(int num) {
        char[] hex = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        int n = num;
        if(n==0)
            return "0";
        StringBuilder sb = new StringBuilder();
        while(n!=0){
            int rem = n&15;
            sb.append(hex[rem]);
            n=n>>>4;
        }
        return sb.reverse().toString();
    }
}
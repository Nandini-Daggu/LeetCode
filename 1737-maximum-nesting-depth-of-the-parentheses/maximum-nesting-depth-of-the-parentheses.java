class Solution {
    public int maxDepth(String s) {
        int ans = 0,res = 0;
        for(char c:s.toCharArray()){
            if(c=='('){
                ans++;
                if(ans>res)
                    res = ans;
            }
            else if(c==')'){
                ans--;
            }
        }
        return res;
    }
}
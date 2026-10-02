class Solution {
     List<String> lst = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        helper(n,n,"");
        return lst;    
    }
    public void helper(int open,int close,String s){
        if(open == 0&&close==0){
            lst.add(s);
            return;
        }
        if(open>0){
            helper(open-1,close,s+"(");
        }
        if(close>open){
            helper(open,close-1,s+")");
        }
    }
}
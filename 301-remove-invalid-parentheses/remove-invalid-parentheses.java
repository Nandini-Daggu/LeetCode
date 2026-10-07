class Solution {
    public List<String> removeInvalidParentheses(String s) {
        List<String> res = new ArrayList<>();
        helper(s,res,0,0);
        return res;
    }
    public void helper(String s,List<String> lst,int l,int h){
        int bal = 0;
        for(int i = l;i<s.length();i++){
            if(s.charAt(i)=='(') bal++;
            if(s.charAt(i)==')') bal--;
            if(bal>=0) continue;
            for(int j = h;j<=i;j++){
                if(s.charAt(j)==')'&&(j==h||s.charAt(j-1)!=')'))
                    helper(s.substring(0,j)+s.substring(j+1),lst,i,j);
            }
            return;
        }
        help(s,lst,s.length()-1,s.length()-1);
    }
    public void help(String s,List<String> lst,int l,int h){
        int bal = 0;
        for(int i = l;i>=0;i--){
            if(s.charAt(i)==')') bal++;
            if(s.charAt(i)=='(') bal--;
            if(bal>=0) continue;
            for(int j = h;j>=i;j--){
                if(s.charAt(j)=='('&&(j==h||s.charAt(j+1)!='('))
                    help(s.substring(0,j)+s.substring(j+1),lst,i-1,j-1);
            }
            return;
        }
        lst.add(s);
    }

}
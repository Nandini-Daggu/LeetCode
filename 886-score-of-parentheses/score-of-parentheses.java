class Solution {
    public int scoreOfParentheses(String s) {
       Stack<Integer> stk = new Stack<>();
       stk.push(0);
       int score;
       for(char c:s.toCharArray()){
        if(c=='('){
            stk.push(0);
        }
        else{
            int num = stk.pop();
            if(num==0){
                score = 1;
            }
            else{
                score = 2*num;
            }
            stk.push(stk.pop()+score);
        }
       }
       return stk.peek();
    }
}
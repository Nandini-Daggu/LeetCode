class Solution {
    public boolean canAliceWin(int n) {
        int num = 10,count = 0;
        while(n>=num){
            n-=num;
            num--;
            count++;
        }
        if(count%2!=0) return true;
        return false;
    }
}
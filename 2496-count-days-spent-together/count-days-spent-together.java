class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int start = Math.max(change(arriveAlice),change(arriveBob));
        int end = Math.min(change(leaveAlice),change(leaveBob));
        return Math.max(0,end-start+1);
    }
    public int change(String date){
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        String[] dates = date.split("-");
        int mon = Integer.parseInt(dates[0]);
        int dat = Integer.parseInt(dates[1]);
        for(int i = 0;i<mon-1;i++){
            dat+=days[i];
        }
        return dat;
    }
}
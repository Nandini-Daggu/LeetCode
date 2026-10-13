class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> mp = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            char ch1 = t.charAt(i);
            if(mp.containsKey(ch)){
                if(mp.get(ch)!=ch1){
                    return false;
                }
            }
            else if(mp.containsValue(ch1)){
                return false;
            }
            mp.put(ch,ch1);
        }
        return true;
    }
}
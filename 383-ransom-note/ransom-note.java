class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> mp = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            if (!mp.containsKey(c)) {
                mp.put(c, 1);
            } else {
                mp.put(c, mp.get(c) + 1);
            }
        }
        for(char s : ransomNote.toCharArray()){
            if(!mp.containsKey(s)) return false;

            if(mp.get(s) == 1){
                mp.remove(s);
            }
            else{
                mp.put(s,mp.get(s)-1);
            }
        }
        return true;
    }
}
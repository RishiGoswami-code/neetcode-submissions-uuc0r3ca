class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        int[] freq = new int[26];

        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();
        for (char ch : charS){
            ch = Character.toLowerCase(ch);
            freq[ch - 'a'] +=1;
        }
        for (char ch : charT){
            ch = Character.toLowerCase(ch);
            freq[ch - 'a']  -=1;
        }

        for (int i : freq){
            if (i != 0){
                return false;
            }
        }
        return true;
        
    }
}

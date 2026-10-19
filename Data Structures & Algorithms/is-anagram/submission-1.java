class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() == t.length()){
            char[] sArr = s.toCharArray();
            Arrays.sort(sArr);
            char[] tArr = t.toCharArray();
            Arrays.sort(tArr);
            return Arrays.equals(sArr, tArr);
        }
        return false;

    }
}

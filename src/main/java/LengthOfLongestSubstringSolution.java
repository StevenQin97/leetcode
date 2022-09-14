public class LengthOfLongestSubstringSolution {
    public int lengthOfLongestSubstring(String s) {
        int length = s.length();
        String currentSub = "";
        int res = 0;
        for (int i = 0; i < length; i++) {
            if (currentSub.indexOf(s.charAt(i)) > -1) {
                currentSub = currentSub.substring(currentSub.indexOf(s.charAt(i)) + 1) + s.charAt(i);
            } else {
                currentSub = currentSub + s.charAt(i);
            }
            res = Math.max(res, currentSub.length());
        }
        return res;
    }
}

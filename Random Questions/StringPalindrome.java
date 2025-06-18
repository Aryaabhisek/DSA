public class Solution {
    public static boolean isPalindrome(String str) {
         String org = str;
        String rev = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            rev+=str.charAt(i);
        }
        if (rev.equals(org)) {
            return true;
        }
        else
        {
            return false;
        }
    }
}
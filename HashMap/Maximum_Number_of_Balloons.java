/* Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.

You can use each character in text at most once. Return the maximum number of instances that can be formed.

 

Example 1:



Input: text = "nlaebolko"
Output: 1
Example 2:



Input: text = "loonbalxballpoon"
Output: 2
Example 3:

Input: text = "leetcode"
Output: 0 */





class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> map = new HashMap();

        for (char i : text.toCharArray()){
            if (i == 'b' || i == 'a' || i == 'l' || i == 'o' || i == 'n'){
                map.put(i,map.getOrDefault(i,0) + 1);
            }
        }
        int x = Math.min(map.getOrDefault('b',0), Math.min(map.getOrDefault('a',0),
        map.getOrDefault('n',0)));
        int y = Math.min(map.getOrDefault('l',0),map.getOrDefault('o',0));
        return Math.min(y / 2,x);
    }
}
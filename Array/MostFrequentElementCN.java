public class MostFrequentElementCN {
    public static Character mostFrequentChar(String s) {
        int[] freq = new int[256]; 
        int maxFreq = 0;
        char result = ' ';

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch]++;

            if (freq[ch] > maxFreq || (freq[ch] == maxFreq && ch < result)) {
                maxFreq = freq[ch];
                result = ch;
            }
        }

        return result;
    }
}

import java.util.*;

public class MostFrequentEvenNumberLC {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int el : nums) {
            if (el % 2 == 0) {
                map.put(el, map.getOrDefault(el, 0) + 1);
            }
        }

        int maxCount = 0;
        int result = -1;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();
            if (count > maxCount || (count == maxCount && num < result)) {
                maxCount = count;
                result = num;
            }
        }

        return result;
    }
}

package DSA;

import java.util.*;

public class TriangleFormationCheck {
    public static boolean possibleToMakeTriangle(ArrayList<Integer> arr) {
        // Check for null or size less than 3
        if (arr == null || arr.size() < 3) {
            return false;
        }

        // Sort the array to apply the triangle inequality rule
        Collections.sort(arr);

        // Check every triplet
        for (int i = 0; i < arr.size() - 2; i++) {
            int a = arr.get(i);
            int b = arr.get(i + 1);
            int c = arr.get(i + 2);

            // Triangle is possible if sum of two smaller sides > largest side
            if (a + b > c) {
                return true;
            }
        }

        return false;
    }

    // Example usage
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(4, 1, 2, 10));
        boolean result = possibleToMakeTriangle(arr);
        System.out.println("Can form triangle? " + result);
    }
}

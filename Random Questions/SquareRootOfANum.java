/* Problem statement
You are given a positive integer ‘n’.
Your task is to find and return its square root. 
If ‘n’ is not a perfect square, then return the floor value of sqrt(n).

Example:
Input: ‘n’ = 7
Output: 2 */

import java.util.*;
import java.io.*;

public class Solution {
    public static int sqrtN(long N) {
        if (N < 0) {
            throw new IllegalArgumentException("N must be non-negative");
        }
        return (int) Math.sqrt(N);
    }
}
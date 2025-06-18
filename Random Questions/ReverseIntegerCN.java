/* Problem statement
You are given a 32-bit signed integer ‘N’. So, the integer will lie in the range [-2^31, 2^31 - 1].
 Your task is to return the reverse of the given integer. If reversing causes overflow, then return -1.

Note:

(1) Do not use data types with the capacity of more than 32-bit like ‘long int’ or ‘long long int’ in C++.
 The problem is meant to reverse the integer using a 32-bit data type only.

(2) You should assume that the environment does not allow storing signed or unsigned 64-bit integers. */

public class Solution {
    public static int reverseInteger(int n) {
        int rev = 0;
        while (n != 0) {
            int rem = n % 10;

            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && rem > 7)) {
                return -1;
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && rem < -8)) {
                return -1;
            }

            rev = rev * 10 + rem;
            n /= 10;
        }
        return rev;
    }
}
import java.util.*;
import java.io.*;

public class Solution {

    public static long sumOrProduct(int n, int q) {
        long mod = 1000000007;
        long sum = 0, prod = 1;

        for (int i = 1; i <= n; i++) {
            if (q == 1) {
                sum = sum + i;
            } else {
                prod = (prod * i) % mod;
            }
        }

        return (q == 1) ? sum : prod;
    }
}

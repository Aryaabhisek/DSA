/* Problem statement
Write a program to generate the reverse of a given number N. Print the corresponding reverse number.

Note : If a number has trailing zeros, then its reverse will not include them. For e.g.,
 reverse of 10400 will be 401 instead of 00401. */

import java.util.*;
class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int RevNum = 0;

        while (n > 0) {
            int LastDigit = n % 10;
            RevNum = (RevNum * 10) + LastDigit;
            n = n / 10;
        }
        System.out.println();
        System.out.println(RevNum);
        sc.close();
    }

}

 
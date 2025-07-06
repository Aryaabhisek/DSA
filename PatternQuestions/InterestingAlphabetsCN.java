/* Problem statement
Print the following pattern for the given number of rows.

Pattern for N = 5
E
DE
CDE
BCDE
ABCDE */

import java.util.Scanner;
public class InterestingAlphabetsCN {
    public static void main(String[] Arya) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            for (int j = i; j < n; j++) {
                ch++;
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        sc.close();
    }
}

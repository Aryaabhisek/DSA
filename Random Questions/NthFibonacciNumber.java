/* Problem statement
The n-th term of Fibonacci series F(n), where F(n) is a function, is calculated using the following formula -

    F(n) = F(n - 1) + F(n - 2), 
    Where, F(1) = 1, F(2) = 1
Provided 'n' you have to find out the n-th Fibonacci Number. Handle edges cases like 
when 'n' = 1 or 'n' = 2 by using conditionals like if else and return what's expected.
"Indexing is start from 1"

Example :
Input: 6
Output: 8 */

import java.util.Scanner;
public class NthFibonacciNumber {

	public static int fibonacci(int n,int a,int b){
		if(n==0){
			return a; 
		}
		return fibonacci(n-1, b, a+b);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fibonacci(n-1, 1, 1));
	}

}
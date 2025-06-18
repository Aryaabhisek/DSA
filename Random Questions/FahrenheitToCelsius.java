
//Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W),
//you need to convert all Fahrenheit values from Start to End at the gap of W,
// into their corresponding Celsius values and print the table.

Hint : Use type casting
import java.util.* ;
import java.io.*; 
class Solution {
    
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int stepSize = sc.nextInt();

        for(int i=start ; i<=end ; i+=stepSize){
            System.out.print(i +" ");
            double celsius = (i-32)*(5.0/9.0);
            System.out.println((long)celsius);
            sc.close();
        }       
    }
}  
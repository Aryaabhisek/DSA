import java.util.Scanner;
public class BinaryToDecimalCN {
    static int binaryToDecimal(String b) {
        int res = 0;
        int powof2 = 1;

        for (int i = b.length() - 1; i >= 0; i--) {
            if (b.charAt(i) == '1') {
                res = res + powof2;
            }
            powof2 = powof2 * 2;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String b = sc.next();
        System.out.println(binaryToDecimal(b));
    }
}

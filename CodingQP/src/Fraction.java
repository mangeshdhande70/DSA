
import java.util.Scanner;

public class Fraction {

    class fraction {
        static int gcd(int a, int b) {
            if (a == 0)
                return b;
            return gcd(b % a, a);
        }
        static void lowest(int den3, int num3) {
            int common_factor = gcd(num3, den3);

            den3 = den3 / common_factor;
            num3 = num3 / common_factor;
            System.out.println(num3 + "/" + den3);
        }
        static void addFraction(int num1, int den1, int num2, int den2) {

            int den3 = gcd(den1, den2);

            den3 = (den1 * den2) / den3;
            int num3 = (num1) * (den3 / den1) + (num2) * (den3 / den2);
            lowest(den3, num3);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num1 = sc.nextInt(), den1 = sc.nextInt(), num2 = sc.nextInt(), den2 = sc.nextInt();
            if (den1 != 0 && den2 != 0) {
                addFraction(num1, den1, num2, den2);
            } else {
                System.out.println("Cannot perform this action , denominator cannot be Zero");
            }
        }
    }
}

package Other_ques;
import java.lang.Math;
public class Number {
    private int num;

    public Number(int num) {
        this.num = num;
    }

    public static boolean isZero(int n) {
        return (n == 0);
    }

    public static boolean isPositive(int n) {
        return (n > 0);
    }

    public static boolean isNegative(int n) {
        return (n < 0);
    }

    public static boolean isOdd(int n) {
        return (n % 2 != 0);
    }

    public static boolean isEven(int n) {
        return (n % 2 == 0);
    }

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    public static boolean isArmstrong(int n) {
        int temp, digits = 0, last = 0, sum = 0;
        temp = n;
        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }
        temp = n;
        while (temp > 0) {
            last = temp % 10;
            sum += (Math.pow(last, digits));
            temp = temp / 10;
        }
        if (n == sum)
            return true;
        else return false;
    }

    public static int getFactorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++)
            f = f * i;
        return f;
    }

    public static int getSqrt(int n) {
        return (int) Math.sqrt(n);
    }

    public static int getSqr(int n) {
        return n * n;
    }

    public static int sumDigits(int n) {
        int digit, sum = 0,cpy = n;
        while (n > 0) {
            digit = n % 10;
            sum = sum + digit;
            n = n / 10;
        }
        return sum;
    }
    public static String dispBinary(int n){
        return Integer.toBinaryString(n);
    }
    public static String dispOctal(int n){
        return Integer.toOctalString(n);
    }
    public static String displayhexa(int n){
        return Integer.toHexString(n);
    }

    public static void main(String[] args) {
        System.out.println( Number.dispBinary(10));
        System.out.println(Number.getFactorial(10));
        System.out.println(Number.isArmstrong(153));
    }
}

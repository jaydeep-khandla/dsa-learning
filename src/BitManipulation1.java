public class BitManipulation1 {
    public static void main(String[] args) {

        int number = 31;
        // int res = decimalToBinary(number);
        int res = decimalToAnyBase(number, 2);
        // int res = binaryToDecimal(number);
        // int res = anyBaseToDecimal(number, 2);
        // double res = fastExponentiation(2, 18);
        System.out.println(res);
    }

    static int decimalToBinary(int number) {
        int res = 0;

        int power = 0;

        while (number > 0) {
            res += (number % 2) * (int) Math.pow(10, power);
            number /= 2;
            power++;
        }

        return res;
    }

    static int decimalToAnyBase(int number, int base) {
        int res = 0;

        int power = 0;

        while (number > 0) {
            res += (number % base) * (int) Math.pow(10, power);
            number /= base;
            power++;
        }

        return res;
    }

    static int binaryToDecimal(int number) {
        int res = 0;
        int power = 0;

        while (number > 0) {
            res += (number % 10) * (int) Math.pow(2, power);
            number /= 10;
            power++;
        }

        return res;
    }

    static int anyBaseToDecimal(int number, int base) {
        int res = 0;

        int power = 0;

        while (number > 0) {
            res += (number % 10) * (int) Math.pow(base, power);
            number /= 10;
            power++;
        }

        return res;
    }

    static double fastExponentiation(int num, int power) {
        if (power == 0)
            return 1.0;
        if (power == 1)
            return num;

        double temp = fastExponentiation(num, power / 2);

        if (power % 2 == 0) {
            return temp * temp;
        } else {
            return temp * temp * num;
        }
    }
}

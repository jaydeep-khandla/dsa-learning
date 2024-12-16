public class BitManipulation4 {
    public static void main(String[] args) {
        // printBits(clearBitsTillLSB(53, 4));
        // printBits(clearBitsTillMSB(53, 4));
        // printBits(clearBitsTillMSBExclusive(53, 4));
        // System.out.println(lowerCaseToUpperCase('t'));
        // System.out.println(upperCaseToLowerCase('T'));
        // removeDuplicate(new int[]{1, 1, 2, 2, 3, 3, 4, 4});
        // System.out.println(uniqueNumber(new int[]{1, 1, 2, 2, 3, 3, 4, 4, 5}));
        twoUniqueNumbers(new int[] { 1, 1, 2, 2, 3, 3, 4, 4, 5, 6 });

    }

    static void printBits(long number) {
        for (int i = 7; i >= 0; i--) {
            long bit = (number >> i) & 1;
            System.out.print(bit);
        }
        System.out.println();
    }

    static long clearBitsTillLSB(int number, int index) {
        // printBits(number);
        System.out.println("------------------------------------");
        return number & ~((1 << index + 1) - 1);
    }

    static long clearBitsTillMSB(int number, int index) {
        // printBits(number);
        System.out.println("------------------------------------");
        return number & ((1 << index) - 1);
    }

    static long clearBitsTillMSBExclusive(int number, int index) {
        // printBits(number);
        System.out.println("------------------------------------");
        return number & ((1 << index + 1) - 1);
    }

    static char lowerCaseToUpperCase(char character) {
        return (char) (character & '_');
    }

    static char upperCaseToLowerCase(char character) {
        return (char) (character | ' ');
    }

    static void removeDuplicate(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i] & ~arr[i + 1];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int uniqueNumber(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res ^= arr[i];
        }
        return res;
    }

    static void twoUniqueNumbers(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res ^= arr[i];
        }
        // return res;
        int bit = 0;
        int setBit = 0;
        while (res > 0) {
            if ((res >> bit & 1) != 0) {
                setBit = bit;
                break;
            }
            bit++;
        }

        int res1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] >> setBit & 1) != 0) {
                res1 ^= arr[i];
            }
        }

        int num1 = res ^ res1;
        int num2 = res1;

        System.out.println(num1 + " " + num2);
    }
}

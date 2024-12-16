public class BitManipulation3 {
    public static void main(String[] args) {
        // printBits(4294967295L);
        // printOddEvenBits(4294967295L);
        // setBit(204, 5);
        // clearBit(204, 6);
        // toggleBit(204, 7);
        isPowerOfTwo(204);
    }

    static void printBits(long number) {
        for (int i = 31; i >= 0; i--) {
            long bit = (number >> i) & 1;
            System.out.print(bit);
        }
        System.out.println();
    }

    static void printOddEvenBits(long number) {
        for (int i = 31; i >= 0; i--) {
            long bit = (number >> i) & 1;
            if (bit == 1) {
                System.out.print("1");
            } else {
                System.out.print("0");
            }
        }
        System.out.println();
    }

    static void setBit(long number, int index) {
        printBits(number);
        long mask = 1 << index;
        // System.out.println(number | mask);
        printBits(number | mask);
    }

    static void clearBit(long number, int index) {
        printBits(number);
        long mask = ~(1 << index);
        // System.out.println(number & mask);
        printBits(number & mask);
    }

    static void toggleBit(long number, int index) {
        printBits(number);
        long mask = 1 << index;
        // System.out.println(number ^ mask);
        printBits(number ^ mask);
    }

    static void isPowerOfTwo(long number) {
        if ((number & (number - 1)) == 0) {
            System.out.println(number + " is a power of 2");
        } else {
            System.out.println(number + " is not a power of 2");
        }
    }
}

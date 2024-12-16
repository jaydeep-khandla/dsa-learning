public class BitManipulation2 {
    public static void main(String[] args) {
        // int res = countDigit(012345);
        // countDigitsWithLog(123456);
        // System.out.println(res);
        // palindrome(12321);
        // divisorNumber(12);
        // primeNUmber(12);
        // seiveOfEratosthenes(100);
        // newtonRaphson(2);
        // euclidianGcd(50, 24);
        // lcm(50, 24);
        factorial(5);
    }

    static int countDigit(int number) {
        int count = 0;
        if (number == 0)
            return 1;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    static void countDigitsWithLog(int number) {
        if (number == 0)
            System.out.println(1);
        int count = (int) Math.log10(number) + 1;
        System.out.println(count);
    }

    static void palindrome(int number) {
        int reverse = 0, remainder;
        while (number > 0) {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number /= 10;
        }
        System.out.println(reverse);
    }

    static void divisorNumber(int number) {
        int counter = 1;
        while (counter <= (int) Math.sqrt(number)) {
            if (number % counter == 0) {
                int otherNumber = number / counter;
                System.out.println(counter + " is a divisor of " + number);
                if (otherNumber != counter) {
                    System.out.println(otherNumber + " is a divisor of " + number);
                }
            }
            counter++;
        }
    }

    static void primeNUmber(int number) {
        int counter = 2;
        while (counter <= (int) Math.sqrt(number)) {
            if (number % counter == 0) {
                System.out.println(number + " is not a prime number");
                return;
            }
            counter++;
        }
        System.out.println(number + " is a prime number");
    }

    static void seiveOfEratosthenes(int number) {
        boolean[] isPrime = new boolean[number + 1];
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i <= number; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i <= number; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= number; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        for (int i = 0; i <= number; i++) {
            if (isPrime[i]) {
                System.out.println(i);
            }
        }
    }

    static void newtonRaphson(int number) {
        double guess = number;
        double precision = 1e-10;
        while (true) {
            double root = (guess / 2) + ((number / guess) / 2);
            if ((guess - root) < precision) {
                break;
            }
            guess = root;
        }
        System.out.println(guess);
    }

    static int euclidianGcd(int number1, int number2) {
        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        if (number1 % number2 == 0) {
            // System.out.println(number2);
            return number2;
        } else {
            return euclidianGcd(number2, number1 % number2);
        }
    }

    static void lcm(int number1, int number2) {
        int gcd = euclidianGcd(number1, number2);
        System.out.println((number1 * number2) / gcd);
    }

    static void factorial(int number) {
        int res = 1;
        while (number > 1) {
            res *= number;
            number--;
        }
        System.out.println(res);
    }
}

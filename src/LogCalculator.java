public class LogCalculator {
    public static double naturalLog(double x) {
        if (x <= 0) {
            throw new IllegalArgumentException("Logarithm undefined for non-positive numbers.");
        }

        double guess = x / 2; // Initial guess
        double precision = 1e-10; // Desired precision

        while (true) {
            double nextGuess = guess - (Math.exp(guess) - x) / Math.exp(guess);
            if (Math.abs(nextGuess - guess) < precision) {
                break;
            }
            guess = nextGuess;
        }
        return guess;
    }

    // Function to calculate log base b of a
    public static double logBase(double a, double b) {
        if (a <= 0 || b <= 0 || b == 1) {
            throw new IllegalArgumentException("Invalid input: a must be > 0, b must be > 0 and not equal to 1.");
        }

        return naturalLog(a) / naturalLog(b);
    }

    public static void main(String[] args) {
        double a = 1000000; // Number to calculate log of
        double b = 10; // Base

        try {
            double result = logBase(a, b);
            System.out.printf("log_%f(%f) = %f%n", b, a, result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

package Day5;

public class PrimeInRange {

    // Method to check if a number is prime
    static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    // Method to print all prime numbers up to a given limit
    static void printPrimes(int limit) {
        System.out.println("Prime numbers up to " + limit + " are:");
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int range = 53; // You can change this value as needed
        printPrimes(range);
    }
}


public class PrimeFactors {

    // Efficient solution
    static void printPrimeFactor(int n) {
        if (n <= 1)
            return;

        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                System.out.println(i);
                n = n / i;
            }
        }
        if (n > 1)
            System.out.println(n);
    }

    // More Efficient
    static void printPrimeFactor1(int n) {
        if (n <= 1)
            return;

        while (n % 2 == 0) {
            System.out.println(2);
            n = n / 2;
        }
        for (int i = 3; i * i <= n; i = i + 2) {
            while (n % i == 0) {
                System.out.println(i);
                n = n / i;
            }
        }
        if (n > 1)
            System.out.println(n);
    }

    public static void main(String[] args) {
        int a = 20;

        printPrimeFactor(a);

        System.out.println(".....");

        printPrimeFactor1(a);
    }
}

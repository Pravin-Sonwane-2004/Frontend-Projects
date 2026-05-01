public class CPNAAP {

    void main() {
        int[] arr = { 2, 5, 6, 9, 11, 13, 15, 17 };

        for (int num : arr) {
            if (isPrime(num)) {
                IO.println(num);
            }
        }
    }

    boolean isPrime(int n) {

        if (n <= 1)
            return false;
        if (n == 2)
            return true;
        if (n % 2 == 0)
            return false;

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0)
                return false;
        }

        return true;
    }
}

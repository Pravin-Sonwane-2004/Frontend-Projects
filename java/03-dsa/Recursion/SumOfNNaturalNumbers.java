public class SumOfNNaturalNumbers {

    // A static method to calculate the sum of first N natural numbers recursively
    public static int sum(int n) {
        // Base case: if n is 0, the sum is 0
        if (n == 0) {
            return 0;
        }
        // Recursive case: n + sum of first (n-1) natural numbers
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        int n = 18;
        // Use standard System.out.println to print the result
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum(n));
    }
}

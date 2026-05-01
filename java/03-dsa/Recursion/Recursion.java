public class Recursion {
    public static void main (String [] args) {
        int n = 5;
        reverse(n);
    }
    public static void reverse (int n) {
        if(n == 0) return;
        IO.println(n);
        reverse(n-1);
    }
}

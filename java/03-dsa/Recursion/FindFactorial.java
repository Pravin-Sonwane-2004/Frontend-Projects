	

public class FindFactorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(printFactorial(n));
    }
    public static int printFactorial(int n) {
        if(n<=1) {
            return 1;
        }
        return n * printFactorial(n-1);
    }
}

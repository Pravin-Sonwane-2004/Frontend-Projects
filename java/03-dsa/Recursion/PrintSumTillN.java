
public class PrintSumTillN{
    static void main(String[] args) {
        int n = 4;
        System.out.println(returnSum(n));
    }

    public static int returnSum(int n) {
        int y  =0;
        if(n == 0) {
            return -0;
        }
        return n+returnSum(n-1);
    }
}
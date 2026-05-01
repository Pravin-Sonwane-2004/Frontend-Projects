public class Prime {
    boolean isPrime(int num) {
        if(num<=1) return false;
        if(num==2) return true;
        if(num%2==0) return false;

        for(int i=3;i*i<=num;i=i+2) {
            if(num%i == 0) {
                return false;
            }
        }
        return true;
    } 
    boolean IsPrime(int num) {
                int i = num;
            for(int j=2;j*j<=i;j++) {
                if(i%j==0) {
                    return false;
                }
            }
        return true;
    }

    void main() {
        // for (int i = 1; i <= 100; i++) {
        //     if (IsPrime(i)) {
        //         IO.println(i);
        //     }
        // }
        for(int i =2;i<=100;i++) {
            boolean isPrime = true;
            for(int j = 2;j*j<=i;j++) {
                if(i%j==0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                IO.println(i);
            }
        }
    }
}

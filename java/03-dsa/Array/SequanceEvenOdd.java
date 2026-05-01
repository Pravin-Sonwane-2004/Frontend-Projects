// arr = {1,2,3,4,5,6};
// ans = {2,1,4,3,6,5};

public class SequanceEvenOdd {
    void main() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        
        int n = arr.length;

        int even = 0;   // index where even should be
        int odd = 1;    // index where odd should be
 
        while(even < n && odd < n){

            // even index must contain ODD
            if(arr[even] % 2 == 1)
                even += 2;

            // odd index must contain EVEN
            else if(arr[odd] % 2 == 0)
                odd += 2;

            // both wrong → swap
            else{
                int temp = arr[even];
                arr[even] = arr[odd];
                arr[odd] = temp;

                even += 2;
                odd += 2;
            }
    }
}
}
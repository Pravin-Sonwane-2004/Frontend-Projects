import java.util.Arrays;
public class SortAnArrayCalledBubbleNativeSort {
    static void main(String[] args) {
    int [] arr = {5,2,6,4,9,8,2,3,20,2,0,62,0,5,9,8,77};
        System.out.println(Arrays.toString(returnReversed(arr)));

    }

    public static int [] returnReversed(int [] arr) {
        for(int i = 0;i<arr.length;i++) {
            for(int j = 0;j<arr.length;j++){
                if(arr[i] < arr[j]) {
                   int temp =  arr[i];
                   arr[i] = arr[j];
                   arr[j]=temp;
                }
            }

        }
        return arr;
    }
}

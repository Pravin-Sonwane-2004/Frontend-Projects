
import java.util.*;
public class MoveAllZerosAtEnd {

    public static void main(String [] args) {
        int arr [] = {5,6,21,4,8,0,0,5,0,8};
        int j = 0;
        for(int i = 0; i<arr.length;i++) {
            if (arr[i]!=0) {
                arr[j] = arr[i];
                j++;
            }
        }
        while(j < arr.length) {
            arr[j] =0;
            j++;
        }
        System.out.println(Arrays.toString(arr));
    }
}

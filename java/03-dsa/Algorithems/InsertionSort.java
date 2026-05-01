package Algorithems;

import java.util.Arrays;

//insertion sort is slgorithem which choses the element where should it go and then insert it
//into correct position
public class InsertionSort {
    public static int[] retInsertion(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    void main() {
        InsertionSort ret = new InsertionSort();
        int arr[] = {5, 3, 4, 1};
        IO.println(Arrays.toString(ret.retInsertion(arr)));
    }
}

package Algorithems;

import java.util.Arrays;

public class SelectionSortPractice {
       void main() {
         int arr  [] = {3,4,62,12,5,7,3};

        for(int i =0;i<arr.length-1;i++) {
            int minindex = i;
            for(int j=i+1;j<arr.length;j++) {
                if(arr[minindex] > arr[j]) {
                  minindex = j;
                }
            }
             int temp = arr[minindex];
                arr[minindex] = arr[i];
                arr[i] = temp;
        }
        IO.println(Arrays.toString(arr));
    }
}

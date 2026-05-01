//package Algorithems;
//
//import java.util.*;
//class SelectionSort {
//	static int [] sort (int [] arr) {
//		  for(int i=0;i<arr.length-1;i++) {
//			  int minIndex = i;
//			  for(int j=i+1;j<arr.length;j++) {
//				  if(arr[minIndex] > arr[j]) {
//					  minIndex = j;
//				  }
//			  }
//			  int temp = arr[minIndex];
//			  arr[minIndex] = arr[i];
//			  arr[i] = temp;
//		  }
//		  return arr;
//	}
//	void main() {
//		int arr[] = {2,4,6,8,01,1,2,4};
//		IO.println(Arrays.toString(sort(arr)));
//	}
//}
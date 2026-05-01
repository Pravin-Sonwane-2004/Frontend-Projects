class CheckArraySort {
		  boolean isSorted(int [] arr , int i) {
			  if(i==arr.length-1) {
				  return true;
			  }
			  if(arr[i]<arr[i-1])  {
				  return false;
			  }
			return isSorted(arr,i+1);
		   }
	  void main() {
		int arr[] = {1,2,3,10,6,7,9};
		IO.println(isSorted(arr,1));
	  }
}
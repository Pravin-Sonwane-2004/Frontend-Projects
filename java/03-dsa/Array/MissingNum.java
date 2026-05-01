class MissingNum {
	void main() {
		int arr [] = {1,2,4,5,6,7};
		
		
		int sum = 0;
		int n = 7;
		int actualSum  = n*(n+1)/2;
		// 28
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
			
			// 25
		}   
			IO.println("sum "+sum);
			IO.println("actualSum "+actualSum);

		IO.println(actualSum-sum);
	}
}
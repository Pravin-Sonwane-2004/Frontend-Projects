class CountFreqA  {
	void main() {
		int [] arr = {1, 2, 2, 3, 3,3, 3, 4,4,4,4,4};
		int count = 1;
		for(int i = 1;i<arr.length;i++) {
			if(arr[i] == arr[i-1]) {
				count++;
			}
			else {
				System.out.println(arr[i - 1] + " -> " + count);
				count = 1;
			}

		}
			System.out.println(arr[ arr.length-1] + " -> " + count);

	}
}
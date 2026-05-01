class Missing {
	void main() {
	int[] arr = new int[]{1,2,4,5,7,9};
		
		int expected = 1;
		
		for(int i=0;i<arr.length;i++) {
			int actual = arr[i];
			while(expected < actual) {
				IO.println(expected);
				expected++;
			}
			expected++;
		}
	}
}
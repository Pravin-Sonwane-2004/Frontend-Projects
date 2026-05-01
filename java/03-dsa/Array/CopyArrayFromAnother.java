class CopyArrayFromAnother {
	void main() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] newArr = new int[arr.length];

        System.arraycopy(arr, 0, newArr, 0, arr.length);
		
		for(int n : newArr) {
			System.out.println(n);
		}
	}
}
class Transpose {
	void main() {
		 int[][] firstMat = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
		int arr [][]  = new int [3][3];
		for(int i=0;i<firstMat.length;i++) {
			for(int j=0;j<firstMat[i].length;j++) {
				arr[j][i] = firstMat[i][j];
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				IO.print(arr[i][j]+ "  ");
			}
			IO.println();
		}
	}
}
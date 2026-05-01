import java.util.Scanner;
class JaggedArray {
	void main() {
        int[][] arr1 = new int[3][];
		
		arr1[0]= new int[3];	
		arr1[1]= new int[1];
		arr1[2]= new int[2];

		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the Elements for arr 1");
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				 arr1[i][j]=sc.nextInt();
			}
		}
		// System.out.println("Enter the Elements for arr 2");
		// for(int i=0;i<arr1.length;i++) {
			// for(int j=0;j<arr1[i].length;j++) {
				 // arr1[i][j]=sc.nextInt();
			// }
		// }
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				System.out.print(arr1[i][j] + "  ");
			}
			System.out.println();
		}
	}
}
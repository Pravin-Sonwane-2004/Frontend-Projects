import java.util.Scanner;

class Additionof22dArray {
	
	void main() {
		Scanner sc = new Scanner(System.in);
		IO.println("Input size of rows");
		int sizei = sc.nextInt();
		IO.println("Input size of col");
		int sizej = sc.nextInt();
		
		IO.println("Enter Array One");
		int arr1[] [] = new int[sizei][sizej];
		int arr2[] [] = new int [sizei][sizej];
			int add[] [] = new int[sizei][sizej];
		int mul [] [] = new int[sizei][sizej];	
		
		for(int i=0;i<sizei;i++) {
			for(int j =0;j<sizej;j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
		IO.println("Entered Array 1");
		for(int i=0;i<arr1.length;i++) {
			for(int j =0;j<arr1[i].length;j++) {
				IO.print(arr1[i][j] + " ");
			}
			IO.println();
		} 
		IO.println("Enter Second array");
		for(int i=0;i<sizei;i++) {
			for(int j =0;j<sizej;j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
		
		IO.println("Entered Array 2");
		for(int i=0;i<arr1.length;i++) {
			for(int j =0;j<arr1[i].length;j++) {
				IO.print(arr2[i][j] + " ");
			}
			IO.println();
		} 
		IO.println();
		IO.println("Additon Of Arrays");
		for(int i =0;i<sizei;i++) {
			for(int j = 0;j<sizej;j++) {
				 add[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		IO.println("Addition of arrays");
		for(int i=0;i<sizei;i++) {
			for(int j =0;j<sizej;j++) {
				IO.print(add[i][j] + " ");
			}
			IO.println();
		}
		//multiplication 
		
		for(int i=0;i<sizei;i++) {
			for(int j =0; j<sizej;j++) {
				for(int k = 0;k<sizej;k++) {
					mul[i][j] += arr1[i][k]*arr2[k][j];
				}
			}
		}
		System.out.println("Mul result : ");
        for (int i = 0; i < sizei; i++) {
            for (int j = 0; j < sizej; j++) {
                System.out.print(mul[i][j] + " ");
            }
            System.out.println();
        }
	}
}
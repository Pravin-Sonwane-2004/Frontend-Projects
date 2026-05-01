import java.util.Scanner;
// Q3. Write a Java program to display even & odd values from an array.
// Input:
 // Array Size = 6
 // Array Elements = 11 20 33 42 55 60
// Output:
 // Even Values = 20 42 60
 // Odd Values = 11 33 55

class DisplayEvenAndOddNumbers {
    static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Size of Array");
		int size = sc.nextInt();
		int [] arr = new int[size];
		
		System.out.println("Enter The Elements of Array");
		for(int i = 0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		// for(int i = 0;i<arr.length;i++) {
			// if(arr[i] % 2 == 0) {
				// System.out.print("even " + arr[i] +" ");
			// }
		// }
		// System.out.println();
		// for(int i = 0;i<arr.length;i++) {
			// if(arr[i] % 2 != 0) {
				// System.out.print("odd " + arr[i] +" ");
			// }
		// }
		
		
		int [] evenN = new int [arr.length];
		int [] oddN = new int [arr.length];
		
		int idex = 0;
		int odex = 0;
		for (int i = 0;i<arr.length;i++) {
			  if(arr[i] % 2 == 0) {
				evenN[idex++] = arr[i]; 
			  }
			  else {
				 oddN[odex++] = arr[i]; 
			  }
		}
		System.out.println("even : ");
		for(int i = 0;i<idex;i++) {
			System.out.print(evenN[i] + " " );
		}
		System.out.println();
		System.out.println("odd : ");
			for(int i = 0;i<odex;i++) {
			System.out.print(oddN[i] + " " );
		}
		// System.out.println("even : ");

		
		// for(int num : evenN) {
			// System.out.println(num);
		// }
		
		// System.out.println();

		// System.out.println("odd: ");
		// for(int num : oddN) {
			// System.out.println(num);
		// }
		
		
	}
}
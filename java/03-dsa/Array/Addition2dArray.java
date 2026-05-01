import java.util.Scanner;
// 1 2 3   1 2 3 
// 4 5 6   4 5 6 
// 7 8 9   7 8 9 

// 1 4 9
// 16 25 36
// 49 56 81


class Addition2dArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter I Size : ");
        int sizei = sc.nextInt();

        System.out.println("Enter J Size : ");
        int sizej = sc.nextInt();

        int[][] arr  = new int[sizei][sizej];
        int[][] arr2 = new int[sizei][sizej];
        int[][] arr3 = new int[sizei][sizej];
		int[][] arr4 = new int[sizei][sizej];


        System.out.println("Enter elements arr1 : ");
        for (int i = 0; i < sizei; i++) {
            for (int j = 0; j < sizej; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements arr2 : ");
        for (int i = 0; i < sizei; i++) {
            for (int j = 0; j < sizej; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        // Addition
        for (int i = 0; i < sizei; i++) {
            for (int j = 0; j < sizej; j++) {
                arr3[i][j] = arr[i][j] + arr2[i][j];
            }
        }

        System.out.println("Addition result : ");
        for (int i = 0; i < sizei; i++) {
            for (int j = 0; j < sizej; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < sizei; i++) {
            for (int j = 0; j < sizej; j++) {
                for(int k = 0 ;k<sizej;k++) {
                    arr4[i][j]+=arr[i][k]*arr2[k][j];
                }
            }
        }

        System.out.println("Mul result : ");
        for (int i = 0; i < sizei; i++) {
            for (int j = 0; j < sizej; j++) {
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

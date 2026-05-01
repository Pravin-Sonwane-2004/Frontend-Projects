import java.util.Scanner;

class JaggedArrayPractice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row size of Array: ");
        int row = sc.nextInt();

        int[][] arr = new int[row][];

        System.out.println("Enter column size for each row:");
        for (int i = 0; i < row; i++) {
            int column = sc.nextInt();
            arr[i] = new int[column];
        }

        System.out.println("Enter elements:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Jagged Array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

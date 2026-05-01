public class OAPP {
   public static void main(String x[]) {
      int arr[] = new int[] { 10, 20, 30, 40, 50 };
      display(show(arr));
      System.out.println("display array values");
      for (int i = 0; i < arr.length; i++) {
         System.out.printf("%d\t", arr[i]);
      }
   }

   public static int[] show(int m[]) {
      m[1] = 1000;
      return m;
   }

   public static void display(int t[]) {
      t[2] = 2000;
      t[1 >> 1] = 500;
   }
}

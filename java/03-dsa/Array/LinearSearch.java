

public class LinearSearch {
    static void main(String[] args) {
        int [] arr = {2,5,6,4,8,9,70};
        System.out.println(returnElementsPosition(arr,8));
    }

    public static int returnElementsPosition (int [] arr, int target) {
    for(int i = 0;i<arr.length;i++) {
        if(arr[i] == target) {
            return i;
        }
      }
        return -1;
    }
}

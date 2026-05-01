
public class FindLargestElement {
    public static void main (String [] args) {
        int [] arr = {2,4,5,6,7,7,9,12,45,67,90};
        System.out.println(returnLargest(arr));
    }
    public static int returnLargest (int arr[]) {
        int index = -1;
        for(int i = 0;i<arr.length;i++) {
            if(arr[i] > index) {
                index = arr[i];
            }
        }
        return index;
    }
}

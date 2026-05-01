public class SecSmallest {
    void main() {
        int arr[] = new int [] {2,2,2,5};
        int sec = Integer.MAX_VALUE;
        int first = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]<first) {
                sec = first;
                  first = arr[i];
            }
            else if ( arr[i] != first && arr[i] < sec) {
                sec = arr[i];
            }
        }
        IO.println(sec);
    }
}



public class RemoveDuplicates {
    public static void remove (int [] arr) {
        if(arr.length == 0) return;
        int j = 0;
        for(int i = 1;i<arr.length;i++) {
            if(arr [i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }

        // print unique elements
        for (int i = 0; i <= j; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}

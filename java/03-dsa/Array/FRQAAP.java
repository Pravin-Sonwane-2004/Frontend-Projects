class FRQAAP {
    static void countTheFreq(int[] arr) {
        boolean[] bArr = new boolean[arr.length];
        int count = 0;
        for(int i=0;i<arr.length-1;i++) {
            count = 1;
            if (bArr[i]) continue;
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i]==arr[j]) {
                    bArr[j]=true;
                    count++;
                }
            }
            IO.println(arr[i] + "->" +count);
        }
    }
    void main() {
        int[] arr = {1, 1, 2, 2, 3, 3, 3, 3, 4, 4, 5, 5};
        countTheFreq(arr);
    }
}
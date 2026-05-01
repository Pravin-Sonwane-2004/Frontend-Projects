
public class FindMissingNumber {
        public static int missing (int arr[]) {
            int n = arr[arr.length-1];
            int expectedSum = n * (n+1)/2;
            int actualSum = 0;
            for(int i = 0;i<arr.length ; i++) {
                actualSum += arr[i];
            }
            return expectedSum-actualSum;
        }

    }

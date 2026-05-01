class SmallestSubArray {
    static void main(String[] args) {
        int[] arr = {2,3,5,6,5,2,3,2,1};
        int target = 7;
		
        int left = 0;                                      //
        int sum = 0;                                   //
        int minLen = Integer.MAX_VALUE;                //

        for (int right = 0; right < arr.length; right++) {    // 2
            sum += arr[right];                                  // 10

            while (sum >= target) {                               // 10>=7
                minLen = Math.min(minLen, right - left + 1);        //
                sum -= arr[left];                                     //
                left++;                                                 //
            }
        }

        if (minLen == Integer.MAX_VALUE)
            System.out.println("No subarray found");
        else
            System.out.println("Smallest subarray length = " + minLen);
    }
}

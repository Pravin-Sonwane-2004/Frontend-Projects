
// . Given an integer array and a number K,
//  find the length of the longest continuous subarray whose sum is less than or equal to K.
// Explanation:
// Use two pointers (start, end)
// Expand the window by moving end
// If sum > K, shrink window from start
// Track maximum window length
// Input :- arr = [2, 1, 5, 1, 3, 2]		K = 7
// Output :- 3

class LargestSubarraySum {

    void main() {
        int [] arr ={2, 1, 5, 1, 3, 2};
        int start = 0;
        int maxL = 0;
        int sum = 0;
        int k = 7;

        for(int i=0;i<arr.length;i++) { //0 , 1 , 2
            sum = sum+arr[i]; //sum = 0+2  , 2+1   , 3+5=8
            while(sum>k) { //2>k  ,  3>7  ,   8>7 --> enter  , 6>7
                sum = sum-arr[start];  //6 = 8 - 2
                start++;  //1
            }
        maxL = Math.max(maxL,i-start+1); //1-0-1 = 0,  1-0-1  , 
        }
        System.out.println(maxL); // 3
    }
}

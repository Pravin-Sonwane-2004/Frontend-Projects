public class MajorityElements {
    public static int majorityElement(int[] nums) {
        int ele = nums[0];
        int count = 1;
        int i;
        int n = nums.length/2;
        for (i = 1; i < nums.length; i++) {
            if (ele == nums[i]) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                ele = nums[i];
                count = 1;
            }
        }
        if(count > n) {
            return ele;
        }
        return -1;
    }

    void main() {
        int[] arr = {1, 2, 3, 4, 5, 5, 5, 5};
        IO.println(majorityElement(arr));
    }
}
package CodingBatProblems;

public class Array3 {

    public int maxSpan(int[] nums) {

        int maxSpan = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j >= i; j--) {

                if (nums[i] == nums[j]) {
                    int span = j - i + 1;
                    maxSpan = Math.max(maxSpan, span);
                    break;
                }
            }
        }

        return maxSpan;
    }

    public boolean canBalance(int[] nums) {
        int total = 0;

        for (int n : nums) {
            total += n;
        }

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            leftSum += nums[i];

            if (leftSum == total - leftSum) {
                return true;
            }
        }
        return false;
    }
}

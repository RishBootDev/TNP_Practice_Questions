package CodingBatProblems;

import java.util.Arrays;

public class Array2 {

    public int countEvens(int[] nums) {

        int count = 0;
        for(int x : nums){

            if(x%2 == 0)  count++;
        }
        return count;
    }

    public int bigDiff(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length-1]-nums[0];
    }

    public int centeredAverage(int[] nums) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int n : nums) {
            min = Math.min(min, n);
            max = Math.max(max, n);
            sum += n;
        }
        sum -= (min + max);

        return sum / (nums.length - 2);
    }

}

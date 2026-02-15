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

    public int sum13(int[] nums) {

        int sum = 0;
        for(int i=0;i<nums.length;i++){

            if(nums[i] == 13 ) i++;
            else sum+=nums[i];
        }
        return sum;
    }

    public int sum67(int[] nums) {

        boolean flag = true;
        int sum = 0;
        for (int num : nums) {

            if (num == 6) {
                flag = false;
            }
            else if (num == 7 && !flag) {
                flag = true;
                continue;
            }
            if (flag) sum += num;
        }
        return sum;
    }

    public boolean has22(int[] nums){

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i+1] == 2) return true;
        }
        return false;
    }

    public boolean lucky13(int[] nums) {

        for(int x : nums) {
            if(x == 3) return false;
            if(x == 1) return false;
        }

        return true;
    }

    public boolean sum28(int[] nums) {

        int sum = 0;

        for (int x : nums) {
            if(x == 2) sum+=x;
        }
        return sum ==8;
    }

    public boolean more14(int[] nums) {

        int count1 =0;
        int count4 =0;

        for(int x : nums){

            if (x == 1) count1++;
            else if(x == 4) count4++;
        }

        return count1>count4;
    }

    public boolean only14(int[] nums) {

        for(int x: nums){
            if(x != 1 && x!=4) return false;
        }

        return true;
    }

    public boolean isEverywhere(int[] nums, int val) {

        for (int i= 0;i<nums.length-1;i++){

            int a = nums[i];
            int b = nums[i+1];

            if(a!=val && b!=val) return false;
        }

        return true;
    }
    public boolean no14(int[] nums) {

        boolean present1 = false;
        boolean present4 = false;

        for(int x : nums){
            if(x == 1) present1 = true;
            if(x == 4) present4 = true;

            if(present1 && present4) return false;
        }

        return true;
    }

    public boolean has77(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 7) {

                if (nums[i + 1] == 7) return true;

                if (i < nums.length - 2 && nums[i + 2] == 7) return true;
            }
        }
        return false;
    }

    public boolean has12(int[] nums) {

        boolean flag = false;

        for(int x : nums) {
            if (x == 1) flag = true;

            if (flag && x == 2) return true;
        }
        return false;
    }

}

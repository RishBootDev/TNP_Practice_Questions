package CodingBatProblems;

public class Array1 {

    public boolean firstLast6(int[] nums) {
        if(nums[0] == 6 || nums[nums.length-1] == 6) return true;

        return false;
    }

    public boolean commonEnd(int[] a, int[] b) {

        if(a[0] == b[0] || a[a.length-1] == b[b.length-1]) return true;

        return false;
    }

    public boolean sameFirstLast(int[] nums) {

        if(nums.length == 0) return false;

        if (nums.length == 1 || nums[0] == nums[nums.length-1]) return true;

        return false;
    }

    public int[] makePi() {
        return new int[]{3,1,4};
    }

    public int sum3(int[] nums) {

        int sum = 0;

        for(int x : nums) sum+=x;

        return sum;
    }

    public int[] rotateLeft3(int[] nums) {
        return new int[] { nums[1], nums[2], nums[0] };
    }

    public int[] reverse3(int[] nums) {


        return new int[]{nums[2], nums[1], nums[0]};
    }

    public int[] maxEnd3(int[] nums) {

        int max = Math.max(nums[0], nums[2]);

        return new int[]{max, max, max};
    }


    public int sum2(int[] nums) {

        if(nums.length ==0) return 0;
        else if(nums.length == 1) return nums[0];

        return nums[0]+nums[1];
    }

    public int[] middleWay(int[] a, int[] b) {
        return new int[] { a[1], b[1] };
    }

    public int[] makeEnds(int[] nums) {
        return new int[] { nums[0], nums[nums.length - 1] };
    }

    public boolean has23(int[] nums) {
        return nums[0] == 2 || nums[0] == 3
                || nums[1] == 2 || nums[1] == 3;
    }




}

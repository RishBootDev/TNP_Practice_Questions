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

    public boolean no23(int[] nums) {
        int a = nums[0];
        int b = nums[1];

        if((a != 2 && b !=2) && (a !=3 && b !=3)) return true;
        return false;
    }

    public int[] makeLast(int[] nums) {

        int res[] = new int[nums.length*2];

        res[res.length-1] = nums[nums.length-1];

        return res;
    }

    public boolean double23(int[] nums) {
        return nums.length == 2 && (nums[0] == nums[1]) && (nums[0] == 2 || nums[0] == 3);
    }

    public int[] fix23(int[] nums) {

        if(nums[0] == 2 && nums[1] == 3) nums[1] = 0;
        if(nums[1] == 2 && nums[2] == 3) nums[2] = 0;

        return nums;
    }

    public int start1(int[] a, int[] b) {

        int count = 0;

        if(a.length > 0 && a[0] == 1) count++;

        if(b.length > 0 && b[0] == 1) count++;

        return count;

    }

    public int[] biggerTwo(int[] a, int[] b) {

        int sum1 = a[0] + a[1];
        int sum2 = b[0] + b[1];
        return sum1 >= sum2? a:b;
    }

    public int[] swapEnds(int[] nums) {

        int temp = nums[0];
        nums[0] = nums[nums.length-1];
        nums[nums.length-1] = temp;

        return nums;

    }

    public int[] plusTwo(int[] a, int[] b) {

        return new int[]{a[0],a[1],b[0],b[1]};

    }

    public int[] makeMiddle(int[] nums) {
        int mid = nums.length / 2;
        return new int[] { nums[mid - 1], nums[mid] };
    }

    public int[] midThree(int[] nums) {
        int mid = nums.length / 2;
        return new int[] { nums[mid - 1], nums[mid], nums[mid + 1] };
    }

    public boolean unlucky1(int[] nums) {
        int n = nums.length;

        if (n >= 2 && nums[0] == 1 && nums[1] == 3) return true;
        if (n >= 3 && nums[1] == 1 && nums[2] == 3) return true;
        if (n >= 2 && nums[n - 2] == 1 && nums[n - 1] == 3) return true;

        return false;
    }

    public int maxTriple(int[] nums) {
        int mid = nums.length / 2;
        return Math.max(nums[0], Math.max(nums[mid], nums[nums.length - 1]));
    }

    public int[] make2(int[] a, int[] b) {
        int[] result = new int[2];
        int index = 0;

        for (int i = 0; i < a.length && index < 2; i++) {
            result[index++] = a[i];
        }

        for (int i = 0; i < b.length && index < 2; i++) {
            result[index++] = b[i];
        }

        return result;
    }

    public int[] front11(int[] a, int[] b) {

        if(a.length >= 1 && b.length >= 1){
            return new int[]{a[0],b[0]};
        }
        else if(a.length >= 1 && b.length == 0){
            return new int[]{a[0]};
        }
        else if(a.length == 0 && b.length >= 1){
            return new int[]{b[0]};
        }

        return new int[0];
    }

    public int[] frontPiece(int[] nums) {
        int len = Math.min(2, nums.length);
        int[] result = new int[len];

        for (int i = 0; i < len; i++) {
            result[i] = nums[i];
        }

        return result;
    }


}

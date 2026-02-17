package CodingBatProblems;

import java.util.*;

public class Array3 {

    public static void main(String[] args) {
        Array3 array3 = new Array3();
        array3.squareUp(4);
        System.out.println(Arrays.toString(array3.seriesUp(4)));

        display();
    }

    static void display(){
        System.out.println("Hello this is display");
    }

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

    public boolean linearIn(int[] outer, int[] inner) {

        Set<Integer> set = new HashSet<>();
        for (int x : outer) set.add(x);

        for (int x : inner) {
            if (!set.contains(x)) return false;

        }

        return true;
    }

    public int[] squareUp(int n) {

        int[] ans = new int[n * n];
        int i = 0;

        for (int group = 1; group <= n; group++) {

            int zeros = n - group;
            for (int j = 0; j < zeros; j++) {
                ans[i++] = 0;
            }
            for (int j = group; j >= 1; j--) {
                ans[i++] = j;
            }
        }

        return ans;
    }

    public int countClumps(int[] nums) {

        Set<Integer> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (!set.contains(nums[i]) && nums[i] == nums[i + 1]) {
                count++;
                set.add(nums[i]);
            } else if (nums[i] != nums[i + 1]) set.remove(nums[i]);
        }

        return count;
    }

    public int maxMirror(int[] nums) {
        int n = nums.length;
        int max = 0;

        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= 0; j--) {

                int left = i;
                int right = j;
                int count = 0;

                while (left < n && right >= 0 && nums[left] == nums[right]) {
                    count++;
                    left++;
                    right--;
                }

                max = Math.max(max, count);
            }
        }
        return max;
    }

    public int[] fix45(int[] nums) {

        if (nums.length == 0) return nums;

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] == 4 && nums[i + 1] != 5) {
                list1.add(i + 1);
            }

            if (nums[i] == 5 && (i == 0 || nums[i - 1] != 4)) {
                list2.add(i);
            }
        }

        int last = nums.length - 1;
        if (nums[last] == 5 && nums[last - 1] != 4) {
            list2.add(last);
        }
        int h = 0;
        for (int i = 0; i < list1.size(); i++) {
            int temp = nums[list1.get(i)];
            nums[list1.get(i)] = nums[list2.get(h)];
            nums[list2.get(h)] = temp;
            h++;
        }

        return nums;
    }

    public int[] fix34(int[] nums) {

        if (nums.length == 0) return nums;

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] == 3 && nums[i + 1] != 4) {
                list1.add(i + 1);
            }

            if (nums[i] == 4 && (i == 0 || nums[i - 1] != 3)) {
                list2.add(i);
            }
        }

        int last = nums.length - 1;
        if (nums[last] == 4 && nums[last - 1] != 3) {
            list2.add(last);
        }

        int h = 0;
        for (int i = 0; i < list1.size(); i++) {
            int temp = nums[list1.get(i)];
            nums[list1.get(i)] = nums[list2.get(h)];
            nums[list2.get(h)] = temp;
            h++;
        }

        return nums;
    }

    public int[] seriesUp(int n) {

        int temp = 1;
        int res[] = new int[n*(n+1)/2];

        for (int i = 0; i < res.length; ) {
            int k = 1;
            for (int j = 0; j < temp; j++) {
                res[i] = k++;
                i++;
            }
            temp++;
        }
        return res;
    }


}

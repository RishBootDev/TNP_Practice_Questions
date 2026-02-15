package CodingBatProblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Array3 {

    public static void main(String[] args) {
        Array3 array3 = new Array3();
        array3.squareUp(4);
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
        for(int x : outer) set.add(x);

        for(int x : inner){
            if(!set.contains(x)) return false;

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

}

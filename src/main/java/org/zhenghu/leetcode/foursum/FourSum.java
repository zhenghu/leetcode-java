package org.zhenghu.leetcode.foursum;

import java.util.*;

/**
 * 4 sum solution
 */
public class FourSum {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> results = new LinkedList<>();
        if (nums == null || nums.length < 4)
            return results;
        Arrays.sort(nums);

        for (int s = 0; s < nums.length - 3; s++) {
            if (s != 0 && nums[s] == nums[s - 1]) continue;

            for (int e = nums.length - 1; e >= s + 3; e--) {
                if (e != nums.length - 1 && nums[e] == nums[e + 1]) continue;

                int local = target - nums[s] - nums[e];
                int j = s + 1;
                int k = e - 1;
                while (j < k) {
                    if ((nums[j] + nums[k]) > local) {
                        while (k > j && k > s && nums[k] == nums[k - 1]) {
                            k--;
                        }
                        k--;
                    } else if ((nums[j] + nums[k]) < local) {
                        while (j < k && j < e && nums[j] == nums[j + 1]) {
                            j++;
                        }
                        j++;
                    } else {
                        List<Integer> comb = new LinkedList<>();
                        comb.add(nums[s]);
                        comb.add(nums[j]);
                        comb.add(nums[k]);
                        comb.add(nums[e]);
                        results.add(comb);
                        while (k > j && k > s && nums[k] == nums[k - 1]) {
                            k--;
                        }
                        k--;
                        while (j < k && j < e && nums[j] == nums[j + 1]) {
                            j++;
                        }
                        j++;
                    }
                }
            }
        }
        return results;
    }
}

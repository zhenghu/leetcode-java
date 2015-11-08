package org.zhenghu.leetcode.removeduplicatefromsortedarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Remove Duplicates from sorted array
 */
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }

        Arrays.sort(nums);

        List<Integer> duplications = new ArrayList<>();
        int duplicate = 0;
        int compare = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (compare == nums[i]) {
                duplicate++;
                if (duplicate >= 2) {
                    duplications.add(nums[i]);
                }
            }
            if (compare != nums[i]) {
                duplicate = 0;
            }
            compare = nums[i];
        }
        return nums.length - duplications.size();
    }
}

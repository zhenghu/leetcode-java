package org.zhenghu.leetcode.removeduplicatefromsortedarray;

import java.util.Arrays;

/**
 * Remove Duplicates from sorted array
 */
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if(nums.length <= 2){
            return nums.length;
        }

        Arrays.sort(nums);

        int count = 2;

        for (int i = 2; i < nums.length; i++) {
            nums[count] = nums[i];
            if (!(nums[count] == nums[count-1] && nums[count]==nums[count-2])){
                count++;
            }
        }
        return count;
    }
}

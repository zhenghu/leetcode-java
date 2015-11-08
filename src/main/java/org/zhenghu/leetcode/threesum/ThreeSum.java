package org.zhenghu.leetcode.threesum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * LeetCode ThreeSum Solution
 */
public class ThreeSum {
    public List<List<Integer>> threesum(int[] inputArray) {
        List<List<Integer>> result = new ArrayList<>();
        if(inputArray == null || inputArray.length < 2) return result;
        Arrays.sort(inputArray);

        int len = inputArray.length;
        for(int i = 0; i < len; i++) {
            if(i > 0 && inputArray[i] == inputArray[i - 1]) continue;           // Skip same results
            int target = 0 - inputArray[i];
            int j = i + 1, k = len - 1;
            while(j < k) {
                if(inputArray[j] + inputArray[k] == target) {
                    result.add(Arrays.asList(inputArray[i], inputArray[j], inputArray[k]));
                    while(j < k && inputArray[j] == inputArray[j + 1]) j++;     // Skip same results
                    while(j < k && inputArray[k] == inputArray[k - 1]) k--;     // Skip same results
                    j ++; k--;
                } else if(inputArray[j] + inputArray[k] < target) {
                    j ++;
                } else {
                    k --;
                }
            }
        }
        return result;
    }
}

package org.zhenghu.leetcode.threesumcloset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Solution of 3Sum Closet for java
 * Here we want find out is the each num which close to the target.
 */
public class EachThreeSumCloset {
    public int calculate(int[] nums, int target) {
        List<numWithDiff> numDiff = new ArrayList<>();
        int sum = 0;
        for(int num : nums){
            int diff = Math.abs(target - num);
            numDiff.add(new numWithDiff(num, diff));
        }

        Collections.sort(numDiff, new Comparator<numWithDiff>() {
            @Override
            public int compare(numWithDiff o1, numWithDiff o2) {
                return o1.getDiff() - o2.getDiff();
            }
        });

        for(int i=0;i<3;i++){
            sum += numDiff.get(i).getNum();
        }

        return sum;
    }

    public class numWithDiff {
        private int num;
        private int diff;

        public numWithDiff(int num, int diff){
            this.num = num;
            this.diff = diff;
        }

        public int getNum(){
            return num;
        }

        public int getDiff(){
            return diff;
        }
    }
}

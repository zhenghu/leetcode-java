package org.zhenghu.leetcode.threesumcloset;

import java.util.Arrays;

/**
 * Solution of 3Sum Closet for java
 * Here we want find out is the each num which close to the target.
 */
public class TotalThreeSumCloset {
    public int calculate(int[] num, int target) {

        if(num.length < 3) return 0;

        Arrays.sort(num);

        int pleft = 0 , pright = num.length - 1;

        int closest = num[0] + num[1] + num[2];

        while(pright > 0){
            while(pleft < pright){
                int sum = num[pleft];
                sum += num[pright];

                for(int i  = pleft + 1; i < pright; i++){
                    if((target - closest) == 0 ){
                        return target;
                    }
                    if(Math.abs(target - (num[i] + sum)) < Math.abs(target - closest) ) {
                        closest = num[i] + sum;
                    }
                }

                int old = num[pleft];
                while(pleft < pright && num[pleft] == old) pleft++;
            }

            pleft = 0;

            int old = num[pright];
            while(pright > 0 && num[pright] == old) pright--;
        }


        return closest;
    }

}

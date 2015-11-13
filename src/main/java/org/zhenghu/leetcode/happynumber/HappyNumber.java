package org.zhenghu.leetcode.happynumber;

/**
 * Happy Number Solution
 */
public class HappyNumber {

    public boolean isHappy(int n) {
        while (n != 1) {
            n = calculate(String.valueOf(n));
            if(n == 4){
                return false;
            }
        }

        return true;
    }

    private int calculate(String numberStr) {
        int sum = 0;
        for (String number : numberStr.split("")) {
            sum += Integer.parseInt(number) * Integer.parseInt(number);
        }

        return sum;
    }

}

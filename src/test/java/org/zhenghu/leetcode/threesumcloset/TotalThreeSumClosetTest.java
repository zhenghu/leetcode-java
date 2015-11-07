package org.zhenghu.leetcode.threesumcloset;


import org.fest.assertions.api.Assertions;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by hz on 11/6/2015.
 */
public class TotalThreeSumClosetTest {

    TotalThreeSumCloset totalThreeSumCloset;

    @Before
    public void setUp(){
        this.totalThreeSumCloset = new TotalThreeSumCloset();
    }

    @Test
    public void test_three_sum_closet() {
        //Given
        int[] nums = {5, 2, 3, 1, 4};
        int target = 2;

        //When

        int result = totalThreeSumCloset.calculate(nums, target);

        //Then
        Assertions.assertThat(result).isEqualTo(6);
    }

    @Test
    public void test_three_sum_closet2() {
        //Given
        int[] nums = {1, 1, 1, 0};
        int target = 100;

        //When

        int result = totalThreeSumCloset.calculate(nums, target);

        //Then
        Assertions.assertThat(result).isEqualTo(3);
    }

    @Test
    public void test_three_sum_closet3() {
        //Given
        int[] nums = {1, 1, 1, 0};
        int target = -100;

        //When

        int result = totalThreeSumCloset.calculate(nums, target);

        //Then
        Assertions.assertThat(result).isEqualTo(2);
    }

    @Test
    public void test_three_sum_closet4() {
        //Given
        int[] nums = {0, 2, 1, -3};
        int target = 1;

        //When

        int result = totalThreeSumCloset.calculate(nums, target);

        //Then
        Assertions.assertThat(result).isEqualTo(0);
    }


}
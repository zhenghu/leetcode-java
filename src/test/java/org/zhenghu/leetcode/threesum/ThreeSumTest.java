package org.zhenghu.leetcode.threesum;

import org.fest.assertions.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by hz on 11/8/2015.
 */
public class ThreeSumTest {

    ThreeSum threeSum;

    @Before
    public void setUp(){
        this.threeSum = new ThreeSum();
    }

    @Test
    public void test_three_sum_1(){
        //Given
        int[] s = {-1, 0, 1, 2, -1, -4};

        //When
        List<List<Integer>> result = this.threeSum.threesum(s);

        //Then
        Assertions.assertThat(result.size()).isEqualTo(2);
        Assertions.assertThat(result.get(1)).isEqualTo(Arrays.asList(new Integer[] {-1, 0 ,1}));
        Assertions.assertThat(result.get(0)).isEqualTo(Arrays.asList(new Integer[] {-1, -1 , 2}));
    }

}
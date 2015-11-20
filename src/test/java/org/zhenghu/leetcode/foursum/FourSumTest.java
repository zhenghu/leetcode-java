package org.zhenghu.leetcode.foursum;

import org.fest.assertions.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * test
 */
public class FourSumTest {

    FourSum fourSum;

    @Before
    public void setUp() throws Exception {
        this.fourSum = new FourSum();
    }

    @Test
    public void testFourSum() throws Exception {
        // Given
        int[] input = new int[]{1, 0, -1, 0, -2, 2};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(new Integer[]{-2,-1,1,2}));
        expected.add(Arrays.asList(new Integer[]{-2,0,0,2}));
        expected.add(Arrays.asList(new Integer[]{-1,0,0,1}));

        //When
        List<List<Integer>> actual = this.fourSum.fourSum(input,0);

        //Then
        Assertions.assertThat(actual).isEqualTo(expected);

    }
}
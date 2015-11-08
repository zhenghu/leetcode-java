package org.zhenghu.leetcode.removeduplicatefromsortedarray;

import org.fest.assertions.api.Assertions;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by hz on 11/8/2015.
 */
public class RemoveDuplicatesFromSortedArrayTest {

    RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray;

    @Before
    public void setUp(){
        this.removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
    }

    @Test
    public void test_removeDuplicates(){
        //Given
        //When
        //Then
        Assertions.assertThat(removeDuplicatesFromSortedArray.removeDuplicates(new int[] {1,1,1,2,2,3})).isEqualTo(5);
        Assertions.assertThat(removeDuplicatesFromSortedArray.removeDuplicates(new int[] {1,1,1,2,2,2,2,3,3})).isEqualTo(6);
        Assertions.assertThat(removeDuplicatesFromSortedArray.removeDuplicates(new int[] {1,2,4,4,4,4,4,4,4,4,2,2,2,3,3,3})).isEqualTo(7);
        Assertions.assertThat(removeDuplicatesFromSortedArray.removeDuplicates(new int[] {1,2,3})).isEqualTo(3);
        Assertions.assertThat(removeDuplicatesFromSortedArray.removeDuplicates(new int[] {1})).isEqualTo(1);
        Assertions.assertThat(removeDuplicatesFromSortedArray.removeDuplicates(new int[] {})).isEqualTo(0);
        Assertions.assertThat(removeDuplicatesFromSortedArray.removeDuplicates(new int[] {1,1,1,2})).isEqualTo(3);
    }
}
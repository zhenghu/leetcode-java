package org.zhenghu.leetcode.regularexpressionmatching;

import org.fest.assertions.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by hz on 11/8/2015.
 */
public class RegularExpressionMatchingTest {

    RegularExpressionMatching regularExpressionMatching;

    @Before
    public void setUp() throws Exception {
        this.regularExpressionMatching = new RegularExpressionMatching();
    }

    @Test
    public void test(){
        //Given
        //When
        //Then
        Assertions.assertThat(regularExpressionMatching.isMatch("aa","a")).isFalse();
        Assertions.assertThat(regularExpressionMatching.isMatch("aa","aa")).isTrue();
        Assertions.assertThat(regularExpressionMatching.isMatch("aab", "c*a*b")).isTrue();
    }
}
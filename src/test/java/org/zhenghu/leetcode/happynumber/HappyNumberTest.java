package org.zhenghu.leetcode.happynumber;

import org.fest.assertions.api.Assertions;
import org.junit.Before;
import org.junit.runner.RunWith;

import com.googlecode.zohhak.api.TestWith;
import com.googlecode.zohhak.api.runners.ZohhakRunner;

/**
 * test
 */
@RunWith(ZohhakRunner.class)
public class HappyNumberTest {

	HappyNumber happyNumber;

	@Before
	public void setUp() throws Exception {
		this.happyNumber = new HappyNumber();
	}

	@TestWith({
			"19,true",
			"2,false",
			"9,false"
	})
	public void testIsHappy(int input, boolean expected) throws Exception {
		// Given
        // When
		// Then
		Assertions.assertThat(this.happyNumber.isHappy(input)).isEqualTo(expected);
	}
}
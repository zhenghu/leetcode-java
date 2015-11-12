package org.zhenghu.leetcode.validpalindrome;

import org.fest.assertions.api.Assertions;
import org.junit.Before;
import org.junit.runner.RunWith;

import com.googlecode.zohhak.api.Configure;
import com.googlecode.zohhak.api.TestWith;
import com.googlecode.zohhak.api.runners.ZohhakRunner;

/**
 * test
 */
@RunWith(ZohhakRunner.class)
@Configure(separator = "\\|")
public class ValidPalindromeTest {

	ValidPalindrome validPalindrome;

	@Before
	public void setUp() throws Exception {
		this.validPalindrome = new ValidPalindrome();
	}

	@TestWith({
			"A man, a plan, a canal: Panama|true",
			"1a2|false"

	})
	public void testIsPalindrome(String input,boolean expected) throws Exception {
		//Given
		//When
		//Then
		Assertions.assertThat(this.validPalindrome.isPalindrome(input)).isEqualTo(expected);

	}
}
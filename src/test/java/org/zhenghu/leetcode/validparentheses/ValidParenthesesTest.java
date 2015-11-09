package org.zhenghu.leetcode.validparentheses;

import org.fest.assertions.api.Assertions;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by ZH16093N on 09/11/2015.
 */
public class ValidParenthesesTest {

	ValidParentheses validParentheses;
	@Before
	public void setUp() throws Exception {
		this.validParentheses = new ValidParentheses();
	}

	@Test
	public void test_isValid_shoud_return_true_if_valid(){
		//Given
		//When
		//Then
		Assertions.assertThat(this.validParentheses.isValid("()")).isTrue();
		Assertions.assertThat(this.validParentheses.isValid("(){}[]")).isTrue();
		Assertions.assertThat(this.validParentheses.isValid("(){)}[]")).isFalse();
		Assertions.assertThat(this.validParentheses.isValid("(){{[]")).isFalse();
	}
}
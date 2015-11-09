package org.zhenghu.leetcode.validparentheses;

import java.util.regex.Pattern;

/**
 * Valid Parenthese solution
 */
public class ValidParentheses {

	public boolean isValid(String s) {
		String regex = "^[^()]*(?:\\([^()]*\\)[^()]*)*$";
		return Pattern.matches(regex,s);
	}
}

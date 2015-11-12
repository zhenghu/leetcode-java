package org.zhenghu.leetcode.validpalindrome;

/**
 * Valid Palindrome Solution.
 */
public class ValidPalindrome {

	private static final String IGNORES_REGEX = "[^a-z0-9]";

	public boolean isPalindrome(String s) {
		String order = s.toLowerCase().replaceAll(IGNORES_REGEX,"");
		String desorder = new StringBuilder(order).reverse().toString();
		return order.equals(desorder);
	}

}

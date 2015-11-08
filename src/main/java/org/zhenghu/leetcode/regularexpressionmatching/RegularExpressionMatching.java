package org.zhenghu.leetcode.regularexpressionmatching;

import java.util.regex.Pattern;

/**
 * LeetCode Regular Expression Matching Solution
 */
public class RegularExpressionMatching {

    public boolean isMatch(String s, String p) {
        return Pattern.matches(p,s);
    }
}

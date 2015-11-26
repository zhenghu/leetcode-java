package org.zhenghu.leetcode.wordbreak;

/**
 * Created by hz on 11/11/2015.
 */
public class WordWithIndex {
    private String word;
    private Integer index;

    public WordWithIndex(String word, Integer index) {
        this.word = word;
        this.index = index;
    }

    public String getWord() {
        return this.word;
    }

    public Integer getIndex() {
        return this.index;
    }
}

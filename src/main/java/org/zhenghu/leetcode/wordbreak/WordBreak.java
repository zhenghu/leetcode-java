package org.zhenghu.leetcode.wordbreak;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * word break solution
 */
public class WordBreak {

    public List<String> wordBreak(String s, Set<String> wordDict) {

        List<String> result = new ArrayList<>();
        List<WordWithIndex> indexes = new ArrayList<>();

        for (String word : wordDict) {
            if (s.indexOf(word) != -1) {
                indexes.add(new WordWithIndex(word, s.indexOf(word)));
            }
        }

        if (wordDict.size() == 0 || indexes.size() == 0) {
            return Arrays.asList(new String[]{});
        }

        if (s.length() == 1 && wordDict.size() != 0) {
            return Arrays.asList(new String[]{s});
        }



        indexes.sort((o1, o2) -> o1.getIndex() - o2.getIndex());

        for (WordWithIndex wordWithIndex : indexes) {
            if (wordWithIndex.getIndex() == 0) {
                result.add(makeSentence(wordWithIndex, indexes));
            }
        }

        return result;
    }

    private String makeSentence(WordWithIndex wordWithIndex, List<WordWithIndex> indexes) {
        String sentences;
        String words;
        sentences = wordWithIndex.getWord() + " ";
        words = wordWithIndex.getWord();
        WordWithIndex next = getNextWord(wordWithIndex.getWord(), indexes);

        while (next != null) {
            sentences += next.getWord() + " ";
            words += next.getWord();
            next = getNextWord(words, indexes);
        }

        if (sentences.trim().equals(wordWithIndex.getWord())) {
            sentences += wordWithIndex.getWord();
        }

        return sentences.trim();
    }

    private WordWithIndex getNextWord(String word, List<WordWithIndex> indexes) {
        List<WordWithIndex> next = indexes.stream().filter(i -> i.getIndex() == word.length()).collect(Collectors.toList());
        if (next.size() == 1) {
            return next.get(0);
        } else {
            return null;
        }
    }


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
}


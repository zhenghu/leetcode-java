package org.zhenghu.leetcode.wordbreak;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * word break II solution for match all words in Dict
 */
public class WordBreakForMatchAllDict {

    public static final List<String> EMPTY_STRING_ARRAY = Arrays.asList(new String[]{});

    public List<String> wordBreak(String s, Set<String> wordDict) {

        List<String> result = new ArrayList<>();
        List<WordWithIndex> indexes = new ArrayList<>();

        for (String word : wordDict) {
            if (s.indexOf(word) != -1) {
                indexes.add(new WordWithIndex(word, s.indexOf(word)));
            }
        }

        if (wordDict.size() == 0 || indexes.size() == 0) {
            return EMPTY_STRING_ARRAY;
        }

        if (s.length() == 1 && wordDict.size() != 0) {
            return Arrays.asList(new String[]{s});
        }


        indexes.sort((o1, o2) -> o1.getIndex() - o2.getIndex());

        for (WordWithIndex wordWithIndex : indexes) {
            if (wordWithIndex.getIndex() == 0) {
                String sentence = makeSentence(s.length(), wordWithIndex, indexes);
                if (!sentence.isEmpty()) {
                    result.add(sentence);
                }
            }
        }

        return result;
    }

    private String makeSentence(Integer lenOfInput, WordWithIndex firstWordWithIndex, List<WordWithIndex> indexes) {
        String sentences;
        String words;
        sentences = firstWordWithIndex.getWord() + " ";
        words = firstWordWithIndex.getWord();
        List<WordWithIndex> next = getNextWord(firstWordWithIndex.getWord(), indexes);

        if (next.isEmpty()) {
            sentences += makeSentenceForOnly0Indexes(lenOfInput, firstWordWithIndex, indexes);
        }

        while (!next.isEmpty() && words.length() < lenOfInput) {
            for (WordWithIndex word : next) {
                sentences += word.getWord() + " ";
                words += word.getWord();
            }
            next = getNextWord(words, indexes);
        }


        if (sentences.trim().equals(firstWordWithIndex.getWord())) {
            sentences += firstWordWithIndex.getWord();
        }

        if (sentences.replaceAll("\\s+", "").length() != lenOfInput) {
            return "";
        }

        return sentences.trim();
    }

    private String makeSentenceForOnly0Indexes(Integer lenOfInput, WordWithIndex firstWordWithIndex, List<WordWithIndex> indexes) {
        String subSentences = "";
        for (WordWithIndex index : indexes) {
            if(!index.getWord().equals(firstWordWithIndex.getWord())){
                subSentences += index.getWord() + " ";
            }
        }
        return subSentences;
    }

    private List<WordWithIndex> getNextWord(String words, List<WordWithIndex> indexes) {
        return indexes.stream().filter(i -> i.getIndex() == words.length()).collect(Collectors.toList());
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


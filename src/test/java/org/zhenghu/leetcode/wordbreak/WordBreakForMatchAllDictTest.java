package org.zhenghu.leetcode.wordbreak;

import com.googlecode.zohhak.api.TestWith;
import com.googlecode.zohhak.api.runners.ZohhakRunner;
import org.fest.assertions.api.Assertions;
import org.junit.Before;
import org.junit.runner.RunWith;

import java.util.*;

/**
 * test
 */
@RunWith(ZohhakRunner.class)
public class WordBreakForMatchAllDictTest {

    WordBreakForMatchAllDict wordBreakForMatchAllDict;

    @Before
    public void setUp() throws Exception {
        this.wordBreakForMatchAllDict = new WordBreakForMatchAllDict();
    }

    @TestWith({
            "catsanddog,cat cats and sand dog,cats and dog@cat sand dog",
            "bb,a b bbb bbbb,b b",
            "a,a,a",
            "a, ,a",
            "a,b,",
            "abcd,a abc b cd,a b cd",
            "aaaaaaa,aaaa aaa,aaa aaaa@aaaa aaa",
            "aaaaaaa,aaaa aa a,aa a aaaa@a aa aaaa@aaaa aa a"

    })
    public void testWordBreak(String s, String dictS, String output) throws Exception {
        // Given
        Set<String> dict = new HashSet<>(Arrays.asList(dictS.split(" ")));
        List<String> expected = new ArrayList<>(Arrays.asList(output.split("@")));
        if(output.isEmpty()){
            expected = new ArrayList<>(Arrays.asList(new String[]{}));
        }



        // When
        List<String> actual = this.wordBreakForMatchAllDict.wordBreak(s, dict);

        //Then
        Assertions.assertThat(actual).isEqualTo(expected);

    }
}
package org.zhenghu.leetcode.wordbreak;

import com.googlecode.zohhak.api.TestWith;
import com.googlecode.zohhak.api.runners.ZohhakRunner;
import org.fest.assertions.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.*;

import static org.junit.Assert.*;

/**
 * Created by hz on 11/10/2015.
 */
@RunWith(ZohhakRunner.class)
public class WordBreakTest {

    WordBreak wordBreak;

    @Before
    public void setUp() throws Exception {
        this.wordBreak = new WordBreak();
    }

    @TestWith({
            "catsanddog,cat cats and sand dog,cats and dog@cat sand dog",
            "bb,a b bbb bbbb,b b",
            "a,a,a",
            "a, ,a",
            "a,b,",
            "abcd,a abc b cd,a b cd"

    })
    public void testWordBreak(String s, String dictS, String output) throws Exception {
        // Given
        Set<String> dict = new HashSet<>(Arrays.asList(dictS.split(" ")));
        List<String> expected = new ArrayList<>(Arrays.asList(output.split("@")));
        if(output.isEmpty()){
            expected = new ArrayList<>(Arrays.asList(new String[]{}));
        }



        // When
        List<String> actual = this.wordBreak.wordBreak(s, dict);

        //Then
        Assertions.assertThat(actual).isEqualTo(expected);

    }
}
package org.zhenghu.leetcode.wordbreak;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * Word Break II for matching any in Dict
 */
public class WordBreakForMatchAnyDict {

    public List<String> wordBreak(String s, Set<String> wordDict) {
        return dfs(s, wordDict, new HashMap<>());
    }

    private List<String> dfs(String s, Set<String> wordDict, HashMap<String, List<String>> map) {
        List<String> res = new ArrayList<>();

        if(map.containsKey(s)){
            return map.get(s);
        }

        if(s.length() == 0){
            res.add("");
            return res;
        }

        for(String word : wordDict){
            if(s.startsWith(word)){
                List<String> subList = dfs(s.substring(word.length()),wordDict,map);
                for(String subWord : subList) {
                    res.add((word + " " + subWord).trim());
                }
            }
        }
        map.put(s, res);
        return res;
    }

}

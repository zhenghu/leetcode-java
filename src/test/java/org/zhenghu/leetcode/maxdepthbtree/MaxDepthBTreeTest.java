package org.zhenghu.leetcode.maxdepthbtree;

import org.fest.assertions.api.Assertions;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by hz on 11/7/2015.
 */
public class MaxDepthBTreeTest {

    MaxDepthBTree maxDepthBTree;

    @Before
    public void setUp(){
        this.maxDepthBTree = new MaxDepthBTree();
    }

    @Test
    public void testMaxDepth() throws Exception {
        //Given
        TreeNode treeNode = new TreeNode(3);

        //When
        int result = this.maxDepthBTree.maxDepth(treeNode);

        //Then
        Assertions.assertThat(result).isEqualTo(1);
    }
}
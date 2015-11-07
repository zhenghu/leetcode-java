package org.zhenghu.leetcode.maxdepthbtree;

/**
 * Created by hz on 11/7/2015.
 */
public class MaxDepthBTree {

    public int maxDepth(TreeNode root){
        return root==null?0:Math.max(1+maxDepth(root.left),1+maxDepth(root.right));
    }

}

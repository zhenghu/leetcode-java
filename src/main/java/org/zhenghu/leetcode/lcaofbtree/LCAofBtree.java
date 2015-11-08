package org.zhenghu.leetcode.lcaofbtree;

/**
 * LeetCode LCA of Binary Tree Solution
 */
public class LCAofBtree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {this.val = x;}
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }

        TreeNode left = lowestCommonAncestor(root.left, p,q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (root == p || root == q || left != null && right != null) {
            return root;
        } else if (left != null) {
            return left;
        } else if (right != null) {
            return right;
        }

        return null;
    }

}

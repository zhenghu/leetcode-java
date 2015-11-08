package org.zhenghu.leetcode.binarytreepostordertraversal;

import org.zhenghu.leetcode.maxdepthbtree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by hz on 11/8/2015.
 */
public class BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()){
            while(root != null ){
                result.add(0, root.val);
                stack.push(root);
                root = root.right;
            }

            root = stack.pop();
            root = root.left;
        }

        return result;
    }
}

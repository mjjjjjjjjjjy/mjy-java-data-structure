package 二叉树;

/**
 * @Author: Mo Jianyue
 * @Description
 * @Date: 2022/5/23 下午3:25
 * @Modified By
 *
 *            a
 *        b       c
 *      d   e   f    g
 *    h   i
 *
 *
 *
 */
public class BinaryTree {
    public static TreeNode createTree() {
        TreeNode a = new TreeNode("a");
        TreeNode b = new TreeNode("b");
        TreeNode c = new TreeNode("c");
        TreeNode d = new TreeNode("d");
        TreeNode e = new TreeNode("e");
        TreeNode f = new TreeNode("f");
        TreeNode g = new TreeNode("g");
        TreeNode h = new TreeNode("h");
        TreeNode i = new TreeNode("i");

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;

        d.left = h;
        d.right = i;
        return a;
    }
}

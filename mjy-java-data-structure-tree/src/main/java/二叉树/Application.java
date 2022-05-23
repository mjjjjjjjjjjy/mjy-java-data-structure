package 二叉树;

/**
 * @Author: Mo Jianyue
 * @Description
 * @Date: 2022/5/23 下午3:06
 * @Modified By
 */
public class Application {



    public static class 平衡二叉树 {
        /**
         *  *            a
         *  *        b       c
         *  *      d   e   f    g
         *  *    h   i
         * @param args
         */
        public static void main(String[] args) {
            TreeNode root = BinaryTree.createTree();
            preOrder(root);
            System.out.println("========");
            middleOrder(root);
            System.out.println("========");
            postOrder(root);
        }

        private static void preOrder(TreeNode root) {
            if (root == null){
                return;
            }
            System.out.println(root.value);
            preOrder(root.left);
            preOrder(root.right);
        }

        private static void middleOrder(TreeNode root) {
            if (root == null){
                return;
            }
            middleOrder(root.left);
            System.out.println(root.value);
            middleOrder(root.right);
        }

        private static void postOrder(TreeNode root) {
            if (root == null){
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.value);
        }
    }
}

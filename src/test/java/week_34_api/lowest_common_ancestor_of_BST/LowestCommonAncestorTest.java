package week_34_api.lowest_common_ancestor_of_BST;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

class LowestCommonAncestorTest {

    LowestCommonAncestor solution = new LowestCommonAncestor();

    static TreeNode getSampleTreeNode1(){
        TreeNode root = new TreeNode(13);
        root.left = new TreeNode(5);
        root.right = new TreeNode(16);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(10);
        root.right.left = new TreeNode(14);
        root.right.right = new TreeNode(28);

        return root;
    }

    static TreeNode getSampleTreeNode2(){
        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(-15);
        root.right = new TreeNode(0);
        root.left.left = new TreeNode(-22);
        root.left.right = new TreeNode(-13);
        root.left.left.left = new TreeNode(-25);

        return root;
    }

    static Stream<Arguments> input() {
        return Stream.of(
                               // root = 13                 p = 5                         q = 16
          arguments(getSampleTreeNode1(), getSampleTreeNode1().left, getSampleTreeNode1().right, 13),
                        // root = 13                 p = 16                         q = 14
          arguments(getSampleTreeNode1(), getSampleTreeNode1().right, getSampleTreeNode1().right.left, 16),
                        // root = 10                 p = -13                        q = -25
          arguments(getSampleTreeNode2(), getSampleTreeNode2().left.right, getSampleTreeNode2().left.left.left, -15)
        );
    }

    @ParameterizedTest
    @MethodSource(value = "input")
    void iterativeSolution(TreeNode root, TreeNode p, TreeNode q, int expected) {
        Assertions.assertEquals(expected, solution.iterativeSolution(root, p, q).val);
    }

    @ParameterizedTest
    @MethodSource(value = "input")
    void recursiveSolution(TreeNode root, TreeNode p, TreeNode q, int expected) {
        Assertions.assertEquals(expected, solution.recursiveSolution(root, p, q).val);
    }
}
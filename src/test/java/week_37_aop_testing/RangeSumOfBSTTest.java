package week_37_aop_testing;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class RangeSumOfBSTTest {

    static Stream<Arguments> input() {
        RangeSumOfBST.TreeNode root = new RangeSumOfBST.TreeNode(10);
        root.left = new RangeSumOfBST.TreeNode(5);
        root.right = new RangeSumOfBST.TreeNode(15);
        root.left.left = new RangeSumOfBST.TreeNode(3);
        root.left.right = new RangeSumOfBST.TreeNode(7);
        root.right.right = new RangeSumOfBST.TreeNode(18);


        RangeSumOfBST.TreeNode root2 = new RangeSumOfBST.TreeNode(10);
        root2.left = new RangeSumOfBST.TreeNode(5);
        root2.right = new RangeSumOfBST.TreeNode(15);
        root2.left.left = new RangeSumOfBST.TreeNode(3);
        root2.left.right = new RangeSumOfBST.TreeNode(7);
        root2.right.left = new RangeSumOfBST.TreeNode(13);
        root2.right.right = new RangeSumOfBST.TreeNode(18);
        root2.left.left.left = new RangeSumOfBST.TreeNode(1);
        root2.left.right.left = new RangeSumOfBST.TreeNode(6);

        return Stream.of(
                arguments(root, 7, 15, 32),
                arguments(root2, 6, 10, 23)
        );
    }

    @ParameterizedTest
    @MethodSource(value = "input")
    void rangeSumBST(RangeSumOfBST.TreeNode root, int low, int high, int expected) {
        assertEquals(expected, RangeSumOfBST.rangeSumBST(root, low, high));
    }

    @ParameterizedTest
    @MethodSource(value = "input")
    void rangeSumBSTWithStack(RangeSumOfBST.TreeNode root, int low, int high, int expected) {
        assertEquals(expected, RangeSumOfBST.rangeSumBSTWithStack(root, low, high));
    }
}
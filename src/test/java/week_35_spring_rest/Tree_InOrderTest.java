package week_35_spring_rest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

class Tree_InOrderTest {

    static Stream<Arguments> input() {
        Tree_InOrder.TreeNode root = new Tree_InOrder.TreeNode(10);
        root.left = new Tree_InOrder.TreeNode(4);
        root.right = new Tree_InOrder.TreeNode(15);
        root.left.left = new Tree_InOrder.TreeNode(3);
        root.left.right = new Tree_InOrder.TreeNode(5);

        Tree_InOrder.TreeNode root2 = new Tree_InOrder.TreeNode(1);

        Tree_InOrder.TreeNode root3 = new Tree_InOrder.TreeNode(1);
        root3.right = new Tree_InOrder.TreeNode(2);
        root3.right.left = new Tree_InOrder.TreeNode(3);
        return Stream.of(
                arguments(root, List.of(3, 4, 5, 10, 15)),
                arguments(root2, List.of(1)),
                arguments(root3, List.of(1, 3, 2)),
                arguments(null, Collections.EMPTY_LIST)
        );
    }

    @ParameterizedTest
    @MethodSource(value = "input")
    void inorderTraversal(Tree_InOrder.TreeNode root, List<Integer> expected) {
        Assertions.assertEquals(expected, Tree_InOrder.inorderTraversal(root));
    }

    @ParameterizedTest
    @MethodSource(value = "input")
    void withIteration(Tree_InOrder.TreeNode root, List<Integer> expected) {
        Assertions.assertEquals(expected, Tree_InOrder.withIteration(root));
    }
}
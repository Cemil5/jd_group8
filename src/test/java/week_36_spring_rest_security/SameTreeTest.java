package week_36_spring_rest_security;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SameTreeTest {

    static Stream<Arguments> input() {
        SameTree.TreeNode firstTreeRoot = new SameTree.TreeNode(10);
        firstTreeRoot.left = new SameTree.TreeNode(4);
        firstTreeRoot.right = new SameTree.TreeNode(15);
        firstTreeRoot.left.left = new SameTree.TreeNode(3);
        firstTreeRoot.left.right = new SameTree.TreeNode(5);

        SameTree.TreeNode secondTreeRoot = new SameTree.TreeNode(10);
        secondTreeRoot.left = new SameTree.TreeNode(4);
        secondTreeRoot.right = new SameTree.TreeNode(15);
        secondTreeRoot.left.left = new SameTree.TreeNode(3);
        secondTreeRoot.left.right = new SameTree.TreeNode(5);

        SameTree.TreeNode thirdTreeRoot = new SameTree.TreeNode(10);
        thirdTreeRoot.left = new SameTree.TreeNode(4);
        thirdTreeRoot.right = new SameTree.TreeNode(15);
        thirdTreeRoot.left.left = new SameTree.TreeNode(3);
        thirdTreeRoot.left.right = new SameTree.TreeNode(5);
        thirdTreeRoot.right.right = new SameTree.TreeNode(25);

        return Stream.of(
                arguments(null, null, true),
                arguments(firstTreeRoot, secondTreeRoot, true),
                arguments(firstTreeRoot, thirdTreeRoot, false),
                arguments(thirdTreeRoot, firstTreeRoot, false)
        );
    }

    @ParameterizedTest
    @MethodSource(value = "input")
    void withRecursion(SameTree.TreeNode p, SameTree.TreeNode q, boolean expected) {
        assertEquals(expected, SameTree.withRecursion(p, q));
    }

    @ParameterizedTest
    @MethodSource(value = "input")
    void withIteration(SameTree.TreeNode p, SameTree.TreeNode q, boolean expected) {
        assertEquals(expected, SameTree.withIteration(p, q));
    }
}
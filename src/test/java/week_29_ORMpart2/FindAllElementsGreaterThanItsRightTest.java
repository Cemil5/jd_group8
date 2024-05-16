package week_29_ORMpart2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class FindAllElementsGreaterThanItsRightTest {

    FindAllElementsGreaterThanItsRight solution = new FindAllElementsGreaterThanItsRight();

    static Stream<Arguments> inputs(){
        return Stream.of(
          arguments(List.of(10, 6, 5), new int[]{10, 4, 6, 3, 5}),
          arguments(List.of(10), new int[]{10}),
          arguments(List.of(), new int[0]),
          arguments(List.of(), null)
        );
    }


    @ParameterizedTest
    @MethodSource(value = "inputs")
    void withLinkedList(List<Integer> expected, int[] input) {
        assertEquals(expected, solution.withLinkedList(input));
    }

    @ParameterizedTest
    @MethodSource(value = "inputs")
    void withStack(List<Integer> expected, int[] input) {
        assertEquals(expected, solution.withStack(input));
    }

    @ParameterizedTest
    @MethodSource(value = "inputs")
    void withDeque(List<Integer> expected, int[] input) {
        assertEquals(expected, solution.withDeque(input));
    }

    @ParameterizedTest
    @MethodSource(value = "inputs")
    void withArrayDeque(List<Integer> expected, int[] input) {
        assertEquals(expected, solution.withDeque(input));
    }

    @ParameterizedTest
    @MethodSource(value = "inputs")
    void withArrayList(List<Integer> expected, int[] input) {
        assertEquals(expected, solution.withDeque(input));
    }
}
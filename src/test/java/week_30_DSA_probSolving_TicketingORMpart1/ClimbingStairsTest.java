package week_30_DSA_probSolving_TicketingORMpart1;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class ClimbingStairsTest {

    ClimbingStairs stairs = new ClimbingStairs();

    static Stream<Arguments> values(){
        return Stream.of(
                arguments(1, 1),
                arguments(2, 2),
                arguments(3, 3),
                arguments(4, 5),
                arguments(5, 8),
                arguments(6, 13),
                arguments(7, 21),
                arguments(45, 1_836_311_903)
        );
    }


    @ParameterizedTest
    @MethodSource(value = "values")
    void iteration(int input, int expected) {
        assertEquals(expected, stairs.iteration(input));
    }

    @ParameterizedTest
    @MethodSource(value = "values")
    void recursion(int input, int expected) {
        assertEquals(expected, stairs.recursion(input));
    }

    @ParameterizedTest
    @MethodSource(value = "values")
    void map_recursive(int input, int expected) {
        assertEquals(expected, stairs.map_recursive(input));
    }

    @ParameterizedTest
    @MethodSource(value = "values")
    void array_recursive(int input, int expected) {
        assertEquals(expected, stairs.array_recursive(input));
    }

    @ParameterizedTest
    @MethodSource(value = "values")
    void onlyWithArray(int input, int expected) {
        assertEquals(expected, stairs.onlyWithArray(input));
    }

    static Stream<Arguments> valuesForFollowUp(){
        return Stream.of(
                arguments(1, 1),
                arguments(2, 2),
                arguments(3, 4),
                arguments(4, 7),
                arguments(5, 13),
                arguments(6, 24),
                arguments(7, 44),
                arguments(45, 501_774_317_241L)
        );
    }

    @ParameterizedTest
    @MethodSource(value = "valuesForFollowUp")
    void iteration_follow_up(int input, long expected) {
        assertEquals(expected, stairs.iteration_follow_up(input));
    }

    @Disabled   // arguments(45, 501_774_317_241L) takes too long time
    @ParameterizedTest
    @MethodSource(value = "valuesForFollowUp")
    void recursion_follow_up(int input, long expected) {
        assertEquals(expected, stairs.recursion_follow_up(input));
    }

    @ParameterizedTest
    @MethodSource(value = "valuesForFollowUp")
    void map_recursive_follow_up(int input, long expected) {
        assertEquals(expected, stairs.map_recursive_follow_up(input));
    }

    @ParameterizedTest
    @MethodSource(value = "valuesForFollowUp")
    void memoizationArray_recursive_follow_up(int input, long expected) {
        assertEquals(expected, stairs.memoizationArray_recursive_follow_up(input));
    }

    @ParameterizedTest
    @MethodSource(value = "valuesForFollowUp")
    void onlyWithArray_follow_up(int input, long expected) {
        assertEquals(expected, stairs.onlyWithArray_follow_up(input));
    }
}
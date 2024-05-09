package week_28_Stack_Recursion_ORMpart1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class HappyNumberTest {

    HappyNumber happyNumber = new HappyNumber();

    static Stream<Arguments> values() {
        return Stream.of(
                Arguments.arguments(true, 19),
                Arguments.arguments(false, 20),
                Arguments.arguments(false, 4),
                Arguments.arguments(false, 2),
                Arguments.arguments(true, 365),
                Arguments.arguments(false, 256)
                );
    }

    @ParameterizedTest
    @MethodSource(value = "values")
    void solutionWithSet(boolean expected, int input) {
        Assertions.assertEquals(expected, happyNumber.solutionWithSet(input));
    }

    @ParameterizedTest
    @MethodSource(value = "values")
    void twoPointer(boolean expected, int input) {
        Assertions.assertEquals(expected, happyNumber.twoPointer(input));
    }

    @ParameterizedTest
    @MethodSource(value = "values")
    void solutionWithNestedLoop(boolean expected, int input) {
        Assertions.assertEquals(expected, happyNumber.solutionWithNestedLoop(input));
    }

    @ParameterizedTest
    @MethodSource(value = "values")
    void solutionWithRecursion(boolean expected, int input) {
        Assertions.assertEquals(expected, happyNumber.solutionWithRecursion(input));
    }

}
package week_37_aop_testing;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SumOfDigitsTest {

    static Stream<Arguments> values() {
        return Stream.of(
                arguments(16, 7),
                arguments(942, 6),
                arguments(132189, 6),
                arguments(493193, 2),
                arguments(888888, 3)
        );
    }

    @ParameterizedTest
    @MethodSource(value = "values")
    void digitalRoot(int input, int expected) {
        assertEquals(expected, SumOfDigits.digitalRoot(input));
    }

    @ParameterizedTest
    @MethodSource(value = "values")
    void withLoop(int input, int expected) {
        assertEquals(expected, SumOfDigits.withLoop(input));
    }

    @ParameterizedTest
    @MethodSource(value = "values")
    void withLoop2(int input, int expected) {
        assertEquals(expected, SumOfDigits.digitalRoot2(input));
    }
}
package week_35_spring_rest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

class LongestSubstringWithoutRepeatingCharactersTest {

    static Stream<Arguments> values() {
        return Stream.of(
                arguments("abcabcbb", 3),   // "abc"
                arguments("bbbbb", 1),      // "b"
                arguments("pwwkew", 3),     // "wke"
                arguments(" ", 1),          // " "
                arguments("au", 2),         // "au"
                arguments("ababc", 3),      // "abc"
                arguments("abba", 2)        // "ab"
        );
    }

    @ParameterizedTest
    @MethodSource(value = "values")
    void withNestedLoop(String input, int expected) {
        Assertions.assertEquals(expected, LongestSubstringWithoutRepeatingCharacters.withNestedLoop(input));
    }

    @ParameterizedTest
    @MethodSource(value = "values")
    void withSet(String input, int expected) {
        Assertions.assertEquals(expected, LongestSubstringWithoutRepeatingCharacters.withSet(input));
    }

    @ParameterizedTest
    @MethodSource(value = "values")
    void withMap(String input, int expected) {
        Assertions.assertEquals(expected, LongestSubstringWithoutRepeatingCharacters.withMap(input));
    }
}
package week_27_SQL_newFeatures_readWriteFiles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;
import static week_27_SQL_newFeatures_readWriteFiles.PlusOne.*;

public class PlusOneTest {


    public static Stream<Arguments> inputs() {

        return Stream.of(
                arguments(new int[]{4, 3, 2, 2}, new int[]{4, 3, 2, 1}),
                arguments(new int[]{1, 0}, new int[]{9}),
                arguments(new int[]{1, 0, 0, 0, 0, 0}, new int[]{9, 9, 9, 9, 9}),
                arguments(new int[]{9, 8, 7, 6, 5, 5, 0, 0, 0, 0}, new int[]{9, 8, 7, 6, 5, 4, 9, 9, 9, 9}),
                arguments(new int[]{7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1, 1, 1, 7, 4, 0, 0, 7},
                        new int[]{7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1, 1, 1, 7, 4, 0, 0, 6})
        );
    }

    // this test fails, it is here just to show what happens if we use long
    @Disabled
    @ParameterizedTest
    @MethodSource(value = "inputs")
    void withLong_Test(int[] expected, int[] input){
        int[] actual = withLong(input);
        Assertions.assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            Assertions.assertEquals(expected[i], actual[i]);
        }
        // same with above:
        Assertions.assertArrayEquals(expected, withLong(input));
    }

    @ParameterizedTest
    @MethodSource(value = "inputs")
     void withBigInteger_Test(int[] expected, int[] input){
        int[] actual = withBigInteger(input);
        Assertions.assertArrayEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource(value = "inputs")
    void withBigInteger2_Test(int[] expected, int[] input){
        int[] actual = withBigInteger2(input);
        Assertions.assertArrayEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource(value = "inputs")
    void withOneLoop_Test(int[] expected, int[] input){
        int[] actual = withOneForLoop(input);
        Assertions.assertArrayEquals(expected, actual);
    }

    // for other solutions
    @ParameterizedTest
    @MethodSource(value = "inputs")
    void withStream_Test(int[] expected, int[] input){
        Assertions.assertArrayEquals(expected, withStream(input));
    }

}

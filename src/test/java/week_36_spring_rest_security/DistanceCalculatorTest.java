package week_36_spring_rest_security;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.File;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class DistanceCalculatorTest {

   static Stream<Arguments> values() {
       File resourcesDirectory = new File("src/test/resources");
       String path1 = resourcesDirectory.getAbsolutePath() + "/coordinates.txt";
       String path2 = resourcesDirectory.getAbsolutePath() + "/coordinates2.txt";
        return Stream.of(
                arguments(path1, List.of(26.0)),
                arguments(path2, List.of(26.0, 90.0))
        );
    }

    @ParameterizedTest
    @MethodSource(value = "values")
    void withScanner(String path, List<Double> expected) {
        assertEquals(expected, DistanceCalculator.withScanner(path));
    }

    @ParameterizedTest
    @MethodSource(value = "values")
    void withFilesReadAllLines(String path, List<Double> expected) {
        assertEquals(expected, DistanceCalculator.withFilesReadAllLines(path));
    }

    @ParameterizedTest
    @MethodSource(value = "values")
    void withStream(String path, List<Double> expected) {
        assertEquals(expected, DistanceCalculator.withStream(path));
    }
}
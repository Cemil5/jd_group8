package week_34_api;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseWordsTest {

    @ParameterizedTest
    @CsvSource({
            "'the sky is blue', 'blue is sky the'",
            "'  hello world  ', 'world hello'",
            "'a good   example', 'example good a'",
            "'example', 'example'",
            "'', ''",
            "'   ', ''"
    })
    public void withStringBuilderTest(String input, String expected) {
        assertEquals(expected, ReverseWords.withStringBuilder(input));
    }

    @ParameterizedTest
    @CsvSource({
            "'the sky is blue', 'blue is sky the'",
            "'  hello world  ', 'world hello'",
            "'a good   example', 'example good a'",
            "'example', 'example'",
            "'', ''",
            "'   ', ''"
    })
    public void withStringJoinTest(String input, String expected) {
        assertEquals(expected, ReverseWords.withStringJoin(input));
    }


}
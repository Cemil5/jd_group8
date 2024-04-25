package week_25_Validation_ThymeleafPart2_TicketingMVCPart1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfLastWordTest {

    @Test
    void withSplit() {
        int actualLength = LengthOfLastWord.withSplit("Hello   world we are aliens   ");
        assertEquals(6, actualLength);
    }

    @Test
    void withTrimAndIndexOf() {
        int actualLength = LengthOfLastWord.withTrimAndIndexOf("Hello   world we are aliens   ");
        assertEquals(6, actualLength);
    }
}
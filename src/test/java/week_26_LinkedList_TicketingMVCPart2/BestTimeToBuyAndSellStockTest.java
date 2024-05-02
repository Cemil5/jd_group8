package week_26_LinkedList_TicketingMVCPart2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static week_26.BestTimeToBuyAndSellStock.*;

class BestTimeToBuyAndSellStockTest {

    @Test
    void withBruteForce_Test() {
        int[] ints = {7, 1, 5, 3, 6, 4};
        int actualProfit = withBruteForce(ints);
        assertEquals(5, actualProfit);
    }

    @Test
    void withOneLoop_Test() {
        int[] ints = {7, 1, 5, 3, 6, 4};
        int actualProfit = withOneLoop(ints);
        assertEquals(5, actualProfit);
    }

    @Test
    void withForEachLoop_Test() {
        int[] ints = {7, 1, 5, 3, 6, 4};
        int actualProfit = withForEachLoop(ints);
        assertEquals(5, actualProfit);
    }
}
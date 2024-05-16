package week_29_ORMpart2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class PalindromeLinkedListTest {

    PalindromeLinkedList solution = new PalindromeLinkedList();

    static Stream<Arguments> input() {
        //for positive scenario
        MyLinkedList linkedList = new MyLinkedList();
        Stream.of(1, 8, 3, 6, 3, 8, 1).forEach(linkedList::add);

        MyLinkedList linkedList1 = new MyLinkedList();
        Stream.of(1, 8, 3, 6, 6, 3, 8, 1).forEach(linkedList1::add);

        //for negative scenario
        MyLinkedList linkedList2 = new MyLinkedList();
        Stream.of(1, 8, 3, 6, 4, 8, 1).forEach(linkedList2::add);

        MyLinkedList linkedList3 = new MyLinkedList();
        Stream.of(1, 8, 3, 6, 5, 3, 8, 1).forEach(linkedList3::add);

        // list with one element
        MyLinkedList linkedList4 = new MyLinkedList();
        linkedList4.add(3);
        return Stream.of(
                arguments(true, linkedList.head),
                arguments(true, linkedList1.head),
                arguments(false, linkedList2.head),
                arguments(false, linkedList3.head),
                arguments(true, linkedList4.head)
        );
    }

    @ParameterizedTest
    @MethodSource(value = "input")
    void withStackSimple(boolean expected, ListNode head) {
        assertEquals(expected, solution.withStackSimple(head));
    }

    @ParameterizedTest
    @MethodSource(value = "input")
    void withStackAdvanced(boolean expected, ListNode head) {
        assertEquals(expected, solution.withStackAdvanced(head));
    }

    @ParameterizedTest
    @MethodSource(value = "input")
    void withTwoPointer(boolean expected, ListNode head) {
        assertEquals(expected, solution.withTwoPointer(head));
    }
}
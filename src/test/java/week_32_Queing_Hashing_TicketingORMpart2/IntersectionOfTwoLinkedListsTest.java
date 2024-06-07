package week_32_Queing_Hashing_TicketingORMpart2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class IntersectionOfTwoLinkedListsTest {

    IntersectionOfTwoLinkedLists solution = new IntersectionOfTwoLinkedLists();

    static Stream<Arguments> input() {
        MyLinkedList linkedList1A = new MyLinkedList();
        Stream.of(4, 1, 8, 4, 5).forEach(linkedList1A::add);
        MyLinkedList linkedList1B = new MyLinkedList();
        Stream.of(5, 6, 1).forEach(linkedList1B::add);
        linkedList1B.tail.next = linkedList1A.head.next.next; // intersection at 8

        MyLinkedList linkedList2A = new MyLinkedList();
        Stream.of(1, 9, 1, 2, 4).forEach(linkedList2A::add);
        MyLinkedList linkedList2B = new MyLinkedList();
        linkedList2B.add(3);
        linkedList2B.tail.next = linkedList2A.head.next.next.next; // intersection at 2

        MyLinkedList linkedList3A = new MyLinkedList();
        Stream.of(2, 6, 4).forEach(linkedList3A::add);
        MyLinkedList linkedList3B = new MyLinkedList();
        Stream.of(1, 5, 4).forEach(linkedList3B::add); // no intersection

        //linked lists without cycle
        MyLinkedList linkedList4A = new MyLinkedList();
        Stream.of(3, 2, 0, -4).forEach(linkedList4A::add);
        MyLinkedList linkedList4B = linkedList4A;

        return Stream.of(
                arguments(8, linkedList1A.head, linkedList1B.head),
                arguments(2, linkedList2A.head, linkedList2B.head),
                arguments(null, linkedList3A.head, linkedList3B.head),
                arguments(3, linkedList4A.head, linkedList4B.head)
        );
    }

    @ParameterizedTest
    @MethodSource(value = "input")
    void withSetTwoLoop(Integer expected, ListNode headA, ListNode headB) {
        ListNode actual = solution.withSetTwoLoop(headA, headB);
        assertEquals(expected, actual != null ? actual.val : null);
    }

    @ParameterizedTest
    @MethodSource(value = "input")
    void withFindingLength(Integer expected, ListNode headA, ListNode headB) {
        ListNode actual = solution.withFindingLength(headA, headB);
        assertEquals(expected, actual != null ? actual.val : null);
    }
}
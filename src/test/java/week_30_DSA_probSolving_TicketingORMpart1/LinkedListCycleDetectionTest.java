package week_30_DSA_probSolving_TicketingORMpart1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class LinkedListCycleDetectionTest {

    LinkedListCycleDetection solution = new LinkedListCycleDetection();

    static Stream<Arguments> input() {
        //linked lists with cycle
        MyLinkedList linkedList = new MyLinkedList();
        Stream.of(3, 2, 0, -4).forEach(linkedList::add);
        linkedList.tail.next = linkedList.head;    // cycle at head

        MyLinkedList linkedList1 = new MyLinkedList();
        Stream.of(3, 2, 0, -4, 9, 7).forEach(linkedList1::add);
        linkedList1.tail.next = linkedList1.head.next.next;    // cycle at 0

        MyLinkedList linkedList2 = new MyLinkedList();
        Stream.of(3, 2, 0, -4, 9, 7).forEach(linkedList2::add);
        linkedList2.tail.next = linkedList2.tail;    // cycle at tail

        //linked lists without cycle
        MyLinkedList linkedList3 = new MyLinkedList();
        Stream.of(3, 2, 0, -4).forEach(linkedList3::add);

        MyLinkedList linkedList4 = new MyLinkedList();
        Stream.of(3, 2, 0, -4, 9, 7).forEach(linkedList4::add);
        return Stream.of(
                arguments(true, linkedList.head),
                arguments(true, linkedList1.head),
                arguments(true, linkedList2.head),
                arguments(false, linkedList3.head),
                arguments(false, linkedList4.head)
        );
    }

    @ParameterizedTest
    @MethodSource(value = "input")
    void hashSet(boolean expected, ListNode head) {
        assertEquals(expected, solution.hashSet(head));
    }

    @ParameterizedTest
    @MethodSource(value = "input")
    void twoPointer(boolean expected, ListNode head) {
        assertEquals(expected, solution.twoPointer(head));
    }
}
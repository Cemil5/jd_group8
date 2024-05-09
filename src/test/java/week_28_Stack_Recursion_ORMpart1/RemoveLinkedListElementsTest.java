package week_28_Stack_Recursion_ORMpart1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

class RemoveLinkedListElementsTest {

    RemoveLinkedListElements linkedList = new RemoveLinkedListElements();

    static Stream<Arguments> input() {
        MyLinkedList list1 = new MyLinkedList();
        Stream.of(1, 2, 6, 3, 4, 5, 6).forEach(list1::add);

        MyLinkedList list2 = new MyLinkedList();
        Stream.of(6, 1, 2, 6, 3, 4, 5, 6).forEach(list2::add);

        MyLinkedList list3 = new MyLinkedList();
        Stream.of(7, 7, 7, 7).forEach(list3::add);

        MyLinkedList list4 = new MyLinkedList();
        Stream.of(2, 2, 3, 4).forEach(list4::add);
        return Stream.of(
                arguments(List.of(1, 2, 3, 4, 5), list1, 6),
                arguments(List.of(1, 2, 3, 4, 5), list2, 6),
                arguments(List.of(), list3, 7),
                arguments(List.of(3, 4), list4, 2),
                arguments(List.of(), new MyLinkedList(), 6)
        );
    }

    @ParameterizedTest
    @MethodSource(value = "input")
    void twoPointer_test(List<Integer> expected, MyLinkedList list, int val) {
        ListNode head = linkedList.twoPointer(list.head, val);
        List<Integer> actual = getActualValues(head);
        Assertions.assertEquals(expected, actual, "two pointer failed");
    }

    private List<Integer> getActualValues(ListNode current) {
        List<Integer> actual = new ArrayList<>();
        while (current != null) {
            actual.add(current.val);
            current = current.next;
        }
        return actual;
    }

    @ParameterizedTest
    @MethodSource(value = "input")
    void withFakeHead(List<Integer> expected, MyLinkedList list, int val) {
        ListNode head = linkedList.withFakeHead(list.head, val);
        List<Integer> actual = getActualValues(head);
        Assertions.assertEquals(expected, actual, "fake head failed");
    }

    @ParameterizedTest
    @MethodSource(value = "input")
    void withOnePointer(List<Integer> expected, MyLinkedList list, int val) {
        ListNode head = linkedList.withOnePointer(list.head, val);
        List<Integer> actual = getActualValues(head);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource(value = "input")
    void withShiftingHeadFirst(List<Integer> expected, MyLinkedList list, int val) {
        ListNode head = linkedList.withShiftingHeadFirst(list.head, val);
        List<Integer> actual = getActualValues(head);
        Assertions.assertEquals(expected, actual, "shifting head failed");
    }

    @ParameterizedTest
    @MethodSource(value = "input")
    void withRecursive(List<Integer> expected, MyLinkedList list, int val) {
        ListNode head = linkedList.withRecursive(list.head, val);
        List<Integer> actual = getActualValues(head);
        Assertions.assertEquals(expected, actual, "recursive solution failed");
    }

    @ParameterizedTest
    @MethodSource(value = "input")
    void withRecursive2(List<Integer> expected, MyLinkedList list, int val) {
        ListNode head = linkedList.withRecursive2(list.head, val);
        List<Integer> actual = getActualValues(head);
        Assertions.assertEquals(expected, actual, "recursive solution-2 failed");
    }
}

package week_27_SQL_newFeatures_readWriteFiles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class RemoveDuplicatesFromLinkedListTest {

    RemoveDuplicatesFromLinkedList linkedList = new RemoveDuplicatesFromLinkedList();

    MyLinkedList list1;
    MyLinkedList list2;
    MyLinkedList list3;
    MyLinkedList list4;
    List<Integer> expected1;
    List<Integer> expected2;
    List<Integer> expected3;
    List<Integer> expected4;

    @BeforeEach
    void setUp() {
        list1 = new MyLinkedList();
        Stream.of(1, 1, 2).forEach(list1::add);

        list2 = new MyLinkedList();
        Stream.of(1, 2, 3, 3).forEach(list2::add);

        list3 = new MyLinkedList();
        Stream.of(1, 1, 2, 3, 3, 4).forEach(list3::add);

        list4 = new MyLinkedList();
        list4.add(4);

        expected1 = List.of(1, 2);
        expected2 = List.of(1, 2, 3);
        expected3 = List.of(1, 2, 3, 4);
        expected4 = List.of(4);
    }

    @Test
    void twoPointer() {
        assertSolution(linkedList.twoPointer(list1.head), expected1);
        assertSolution(linkedList.twoPointer(list2.head), expected2);
        assertSolution(linkedList.twoPointer(list3.head), expected3);
        assertSolution(linkedList.twoPointer(list4.head), expected4);
    }

    private void assertSolution(ListNode head, List<Integer> expected) {
        List<Integer> actual = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            actual.add(current.val);
            current = current.next;
        }
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void withOnePointer() {
        assertSolution(linkedList.withOnePointer(list1.head), expected1);
        assertSolution(linkedList.withOnePointer(list2.head), expected2);
        assertSolution(linkedList.withOnePointer(list3.head), expected3);
        assertSolution(linkedList.withOnePointer(list4.head), expected4);
    }

    @Test
    void withOnePointerTwoWhile() {
        assertSolution(linkedList.withOnePointerTwoWhile(list1.head), expected1);
        assertSolution(linkedList.withOnePointerTwoWhile(list2.head), expected2);
        assertSolution(linkedList.withOnePointerTwoWhile(list3.head), expected3);
        assertSolution(linkedList.withOnePointerTwoWhile(list4.head), expected4);
    }
}

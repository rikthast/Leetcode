package in.rikthast.LinkedLists;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListTest {

  @Test
  void emptyListConstructor() {
    int[] list = new int[]{ };
    ListNode pointer = new SinglyLinkedList(list).pointer;
    assertNull(pointer);
  }

  @Test
  void listConstructor() {
    int[] list = new int[]{ 1, 2, 3, 4, 5 };
    ListNode pointer = new SinglyLinkedList(list).pointer;
    assertNotNull(pointer);

    int index = 0;
    while (pointer.next != null) {
      assertEquals(list[index], pointer.val);
      pointer = pointer.next;
      index++;
    }
  }

  @Test
  void toEmptyList() {
    int[] list = new int[]{ };
    SinglyLinkedList singlyLinkedList = new SinglyLinkedList(list);

    List<Integer> linkedList = singlyLinkedList.toList();
    assertArrayEquals(list, linkedList.stream().mapToInt(Integer::intValue).toArray());
  }

  @Test
  void toList() {
    int[] list = new int[]{ 1, 2, 3, 4, 5 };
    SinglyLinkedList singlyLinkedList = new SinglyLinkedList(list);

    List<Integer> linkedList = singlyLinkedList.toList();
    assertArrayEquals(list, linkedList.stream().mapToInt(Integer::intValue).toArray());
  }
}

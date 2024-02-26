package in.rikthast.LinkedLists;
import org.junit.jupiter.api.Test;

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
}

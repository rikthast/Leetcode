package in.rikthast.LinkedLists;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListNodeTest {
  @Test
  void valueConstructor() {
    int value = 5;
    var listNode = new ListNode(value);

    assertEquals(listNode.val, value);
  }

  @Test
  void valueAndNextConstructor() {
    int value = 5;
    ListNode next = new ListNode();
    var listNode = new ListNode(value, next);

    assertEquals(listNode.val, value);
    assertEquals(listNode.next, next);
  }
}
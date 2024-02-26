package in.rikthast.LinkedLists;

import java.util.ArrayList;
import java.util.List;

public class SinglyLinkedList {
  ListNode pointer = null;

  SinglyLinkedList(int[] list) {
    int index = list.length - 1;
    while(index >= 0) {
      pointer = new ListNode(list[index--], pointer);
    }
  }

  public List<Integer> toList() {
    List<Integer> list = new ArrayList<>();
    while (pointer != null) {
      list.add(pointer.val);
      pointer = pointer.next;
    }
    return list;
  }
}

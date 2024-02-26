package in.rikthast.LinkedLists;

public class SinglyLinkedList {
  ListNode pointer = null;

  SinglyLinkedList(int[] list) {
    int index = list.length - 1;
    while(index >= 0) {
      pointer = new ListNode(list[index--], pointer);
    }
  }
}

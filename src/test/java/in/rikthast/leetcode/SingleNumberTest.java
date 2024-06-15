package in.rikthast.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SingleNumberTest {
  @Test
  void singleElementArray() {
    int[] nums = new int[]{ 1 };
    int expected = 1;
    assertEquals(expected, SingleNumber.call(nums));
  }

  @Test
  void multipleElementArray() {
    int[] nums = new int[]{ 1, 1, 4, 4, 5 };
    int expected = 5;
    assertEquals(expected, SingleNumber.call(nums));
  }

  @Test
  void multipleRandomlySpreadElementArray() {
    int[] nums = new int[]{ 1, 2, 4, 3, 1, 3, 2 };
    int expected = 4;
    assertEquals(expected, SingleNumber.call(nums));
  }
}

package in.rikthast.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
  @Test
  void twoSumArrayLengthTwo() {
    int[] nums = new int[]{ 1, 2 };
    int target = 3;

    int[] expected = new int[]{ 0, 1 };
    assertArrayEquals(expected, TwoSum.call(nums, target));
  }

  @Test
  void twoSumArrayGreaterThanTwo() {
    int[] nums = new int[]{ 1, 2, 3, 4, 5 };
    int target = 8;

    int[] expected = new int[]{ 4, 2 };
    assertArrayEquals(expected, TwoSum.call(nums, target));
  }

  @Test
  void twoSumArrayWithoutSolution() {
    int[] nums = new int[]{ 1, 2, 3, 4, 5 };
    int target = 10;

    int[] expected = new int[]{ 0, 1 };
    assertArrayEquals(expected, TwoSum.call(nums, target));
  }
}

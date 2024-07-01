package in.rikthast.leetcode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MajorityElementTest {
  @Test
  void clearMajorityElement() {
    int[] input = new int[] {1, 1, 1, 1, 2};
    int majorityElement = 1;

    assertEquals(majorityElement, MajorityElement.call(input));
  }

  @Test
  void majorityElement() {
    int[] input = new int[] {1, 2, 1, 2, 1, 2, 1, 2, 2};
    int majorityElement = 2;

    assertEquals(majorityElement, MajorityElement.call(input));
  }

  @Test
  void majorityElementFirst() {
    int[] input = new int[] {1, 1, 2, 1, 2, 1, 2, 1, 2};
    int majorityElement = 1;

    assertEquals(majorityElement, MajorityElement.call(input));
  }
}

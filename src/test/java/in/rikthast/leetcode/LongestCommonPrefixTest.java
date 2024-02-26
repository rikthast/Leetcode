package in.rikthast.leetcode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {
  @Test
  void completeCommonSubString() {
    String[] input = new String[] { "head", "header", "heading" };
    String expectedOutput = "head";

    assertEquals(expectedOutput, LongestCommonPrefix.call(input));
  }

  @Test
  void partialCommonSubString() {
    String[] input = new String[] { "headstand", "header", "heading" };
    String expectedOutput = "head";

    assertEquals(expectedOutput, LongestCommonPrefix.call(input));
  }

  @Test
  void noCommonSubString() {
    String[] input = new String[] { "head", "tech" };
    String expectedOutput = "";

    assertEquals(expectedOutput, LongestCommonPrefix.call(input));
  }

  @Test
  void singleString() {
    String[] input = new String[] { "head" };
    String expectedOutput = "head";

    assertEquals(expectedOutput, LongestCommonPrefix.call(input));
  }
}
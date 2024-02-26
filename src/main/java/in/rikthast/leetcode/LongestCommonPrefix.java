package in.rikthast.leetcode;
import java.util.Arrays;

public class LongestCommonPrefix {
  public static String call(String[] strs) {
    Arrays.sort(strs);
    String first = strs[0];
    String last = strs[strs.length - 1];

    int index = 0;
    while (index < first.length()) {
      // not using guard clause since negation is one extra step resulting to execution time difference
      if (first.charAt(index) != last.charAt(index)) break;
      else index++;
    }

    return first.substring(0, index);
  }
}

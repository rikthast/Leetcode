package in.rikthast.leetcode;

public class SingleNumber {
  /** Uses XOR Identity and XOR Negation
   */

  public static int call(int[] nums) {
    int result = 0;
    for(int i: nums) {
      result = result ^ i;
    }
    return result;
  }
}

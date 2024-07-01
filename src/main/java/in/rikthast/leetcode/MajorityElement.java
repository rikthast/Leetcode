package in.rikthast.leetcode;

public class MajorityElement {
  public static int call(int[] nums) {
    int occurrences = 0;
    int candidate = Integer.MIN_VALUE;

    for(int i : nums) {
      if(occurrences == 0) candidate = i;

      if(candidate == i) occurrences++;
      else occurrences--;
    }

    return candidate;
  }
}

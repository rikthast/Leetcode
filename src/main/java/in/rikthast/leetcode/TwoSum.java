package in.rikthast.leetcode;

import java.util.HashMap;

public class TwoSum {
  public static int[] call(int[] nums, int target) {
    if(nums.length == 2) return new int[]{ 0, 1 };

    HashMap<Integer, Integer> hash = new HashMap<>();
    int length = nums.length;

    for(int index = 0; index < length; index++) {
      if(hash.containsKey(target - nums[index])) {
        return new int[]{ index, hash.get(target - nums[index]) };
      }

      hash.put(nums[index], index);
    }

    return new int[]{ 0, 1 };
  }
}

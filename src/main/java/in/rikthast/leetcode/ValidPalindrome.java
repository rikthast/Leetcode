package in.rikthast.leetcode;

public class ValidPalindrome {
  public static boolean call(String s) {
    if(s.isEmpty() || s.length() == 1) { return true; }

    int pointerOne = 0;
    int pointerTwo = s.length() - 1;
    while(pointerOne <= pointerTwo) {
      int front = Character.toLowerCase(s.charAt(pointerOne));
      int rear = Character.toLowerCase(s.charAt(pointerTwo));

      if(!(front >= 97 && front <= 122) && !(front >= 48 && front <= 57)) {
        pointerOne++;
        continue;
      }

      if(!(rear >= 97 && rear <= 122) && !(rear >= 48 && rear <= 57)) {
        pointerTwo--;
        continue;
      }

      if(rear != front) return false;

      pointerOne++;
      pointerTwo--;
    }

    return true;
  }
}

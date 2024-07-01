package in.rikthast.leetcode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {
  @Test
  void simpleNonPalindromeString() {
    String subject = "palindrome";
    boolean isPalindrome = false;

    assertEquals(isPalindrome, ValidPalindrome.call(subject));
  }

  @Test
  void simplePalindromeString() {
    String subject = "naman";
    boolean isPalindrome = true;

    assertEquals(isPalindrome, ValidPalindrome.call(subject));
  }

  @Test
  void palindromeStringWithSymmetricSpaces() {
    String subject = "na m an";
    boolean isPalindrome = true;

    assertEquals(isPalindrome, ValidPalindrome.call(subject));
  }

  @Test
  void palindromeStringWithNonSymmetricSpaces() {
    String subject = "n a  m an";
    boolean isPalindrome = true;

    assertEquals(isPalindrome, ValidPalindrome.call(subject));
  }

  @Test
  void palindromeStringWithSymmetricPunctuations() {
    String subject = "na,m,an";
    boolean isPalindrome = true;

    assertEquals(isPalindrome, ValidPalindrome.call(subject));
  }

  @Test
  void palindromeStringWithNonSymmetricPunctuations() {
    String subject = "n::a,m.a!n";
    boolean isPalindrome = true;

    assertEquals(isPalindrome, ValidPalindrome.call(subject));
  }

  @Test
  void palindromeStringWithPunctuationsAndSpaces() {
    String subject = "A man, a plan, a canal: Panama";
    boolean isPalindrome = true;

    assertEquals(isPalindrome, ValidPalindrome.call(subject));
  }
}

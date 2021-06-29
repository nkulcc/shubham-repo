package junit.junit;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestPalindrome {
	@Test
	public void whenEmptyString_thenAccept() {
	    Palindrome palindromeTester = new Palindrome();
	    assertTrue(palindromeTester.isPalindrome(""));
	}
}

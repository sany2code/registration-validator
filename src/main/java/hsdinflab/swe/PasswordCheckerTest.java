package hsdinflab.swe;

import org.junit.Test;
import static org.junit.Assert.*;

public class PasswordCheckerTest {

    @Test
    public void validPasswords() {
        PasswordChecker checker = new PasswordChecker();
        assertTrue(checker.isValid("Password1!"));
        assertTrue(checker.isValid("A1b2c3!d"));
        assertTrue(checker.isValid("Secure1#"));
    }

    @Test
    public void invalidPasswords() {
        PasswordChecker checker = new PasswordChecker();
        assertFalse(checker.isValid("password1!"));
        assertFalse(checker.isValid("Password1"));
        assertFalse(checker.isValid("Password!"));
        assertFalse(checker.isValid("Tes1!"));
        assertFalse(checker.isValid("abcdefgh"));
        assertFalse(checker.isValid(""));
    }
}
package hsdinflab.swe;

import org.junit.Test;
import static org.junit.Assert.*;

public class UsernameCheckerTest {

    @Test
    public void validUsernames() {
        UsernameChecker usernameChecker = new UsernameChecker();
        assertTrue(true);
        assertTrue(usernameChecker.isValid("123einszweidrei"));
        assertTrue(usernameChecker.isValid("Anna_Maria"));
        assertTrue(usernameChecker.isValid("12345"));
    }

    @Test
    public void invalidUsernames() {
        UsernameChecker usernameChecker = new UsernameChecker();
        assertFalse(usernameChecker.isValid("Ma"));
        assertFalse(usernameChecker.isValid("abcdefghijklmnopqrstuvwxyz"));
        assertFalse(usernameChecker.isValid("Max 123"));
        assertFalse(usernameChecker.isValid(""));
    }
}
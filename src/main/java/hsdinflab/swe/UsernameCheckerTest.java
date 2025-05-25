package hsdinflab.swe;

import org.junit.Test;
import static org.junit.Assert.*;

public class UsernameCheckerTest {

    @Test
    public void validUsernames() {
        UsernameChecker usernameChecker = new UsernameChecker();
        assertTrue(usernameChecker.isValid("123einszweidrei"));
        assertTrue(usernameChecker.isValid("Max123"));
        assertTrue(usernameChecker.isValid("12345"));
        assertTrue(usernameChecker.isValid("Max_123"));
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
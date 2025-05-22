package hsdinflab.swe;

import org.junit.Test;
import static org.junit.Assert.*;

public class EmailCheckerTest {

    @Test
    public void validEmails() {
        EmailChecker emailChecker = new EmailChecker();
        assertTrue(emailChecker.isValid("test@example.com"));
        assertTrue(emailChecker.isValid("a@b.c"));
        assertTrue(emailChecker.isValid("name@mail.co.uk"));
    }

    @Test
    public void invalidEmails() {
        EmailChecker emailChecker = new EmailChecker();
        assertFalse(emailChecker.isValid("namemail.com"));
        assertFalse(emailChecker.isValid("name@mailcom"));
        assertFalse(emailChecker.isValid("@mail.com"));
        assertFalse(emailChecker.isValid("name@.com"));
        assertFalse(emailChecker.isValid("name@mail."));
        assertFalse(emailChecker.isValid(""));
    }
}
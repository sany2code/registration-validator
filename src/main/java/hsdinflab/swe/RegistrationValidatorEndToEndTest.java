package hsdinflab.swe;

import org.junit.Test;
import static org.junit.Assert.*;

public class RegistrationValidatorEndToEndTest {

    @Test
    public void successfulRegistrationWithValidData() {
        RegistrationValidator validator = new RegistrationValidator(new EmailChecker(), new PasswordChecker(), new UsernameChecker());
        assertTrue(validator.validate("user@example.com", "Secure1#", "Valit"));
    }

    @Test
    public void failedRegistrationWithInvalidData() {
        RegistrationValidator validator = new RegistrationValidator(new EmailChecker(), new PasswordChecker(), new UsernameChecker());
        assertFalse(validator.validate("email.com", "test", " "));
    }

}
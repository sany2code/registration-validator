package hsdinflab.swe;

import org.junit.Test;
import static org.junit.Assert.*;

public class RegistrationValidatorEndToEndTest {

    @Test
    public void successfulRegistrationWithValidData() {
        RegistrationValidator validator = new RegistrationValidator(new EmailCheckerMock(), new PasswordChecker(), new UsernameChecker());
        String email = "user@example.com";
        String password = "Secure1#";
        String username = "Valit";
        assertTrue(validator.validate(email, password, username));
    }

    @Test
    public void failedRegistrationWithInvalidData() {
        RegistrationValidator validator = new RegistrationValidator(new EmailCheckerMock(), new PasswordChecker(), new UsernameChecker());
        String email = "email.com";
        String password = "test";
        String username = " ";
        assertFalse(validator.validate(email, password, username));
    }

}
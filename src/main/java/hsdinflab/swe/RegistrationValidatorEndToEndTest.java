package hsdinflab.swe;

import org.junit.Test;
import static org.junit.Assert.*;

public class RegistrationValidatorEndToEndTest {

    @Test
    public void successfulRegistrationWithValidData() {

        RegistrationValidator validator = new RegistrationValidator(new EmailCheckerMock(), new PasswordChecker(), new UsernameChecker());
        String email = "user@example.com";
        String username = "Valit";
        String password = "Secure1#";

        assertTrue(validator.validate(email, password, username));
    }

    @Test
    public void failedRegistrationWithInvalidData() {

        RegistrationValidator validator = new RegistrationValidator(new EmailCheckerMock(), new PasswordChecker(), new UsernameChecker());


        String email = "email.com";
        String username = "Valit";
        String password = "StrongPass1!";

        boolean result = validator.validate(email, password, username);

        assertFalse(result);
    }

}
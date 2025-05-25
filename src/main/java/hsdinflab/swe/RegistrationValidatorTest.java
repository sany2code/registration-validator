package hsdinflab.swe;

import org.junit.Test;
import static org.junit.Assert.*;

public class RegistrationValidatorTest {


    /*
        Wir mocken die EmailChecker-Klasse, weil E-Mail-Validierung oft externe Abhängigkeiten oder komplexe Regex umfasst.
        So können wir gezielt testen, wie sich Username und Passwort verhalten, unabhängig von der E-Mail-Struktur.
    */
    @Test
    public void testRegistrationWithMockedEmailChecker() {
        RegistrationValidator validator = new RegistrationValidator(new EmailCheckerMock(), new PasswordChecker(), new UsernameChecker());
        assertTrue(validator.validate("user@example.com", "Secure1#", "Valit"));
    }
}
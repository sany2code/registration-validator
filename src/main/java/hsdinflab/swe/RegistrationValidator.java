package hsdinflab.swe;

public class RegistrationValidator {

    private final IEmailChecker emailChecker;
    private final PasswordChecker passwordChecker;
    private final UsernameChecker usernameChecker;

    public RegistrationValidator(IEmailChecker emailChecker,
                                 PasswordChecker passwordChecker,
                                 UsernameChecker usernameChecker) {
        this.emailChecker = emailChecker;
        this.passwordChecker = passwordChecker;
        this.usernameChecker = usernameChecker;
    }

    public boolean validateEmail(String email) {
        return emailChecker.isValid(email);
    }

    public boolean validatePassword(String password) {
        return passwordChecker.isValid(password);
    }

    public boolean validateUsername(String username) {
        return usernameChecker.isValid(username);
    }

    public boolean validate(String email, String password, String username) {
        System.out.println(validateEmail(email) + " " + validatePassword(password) + " " + validateUsername(username));
        return validateEmail(email)
            && validatePassword(password)
            && validateUsername(username);

    }
}
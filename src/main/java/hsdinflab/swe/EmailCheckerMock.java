package hsdinflab.swe;

public class EmailCheckerMock implements IEmailChecker {

    @Override
    public boolean isValid(String email) {
        return true;
    }

}

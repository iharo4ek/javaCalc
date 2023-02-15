package my.tms_hw.validators;

import my.tms_hw.util.Validator;

import java.util.regex.Pattern;

public class ValidatorService implements Validator {
    private Pattern pattern = Pattern.compile("");

    public void setPattern(String regex){
        this.pattern = Pattern.compile(regex);
    }

    @Override
    public boolean validate(String string) {
        return pattern.matcher(string).matches();
    }
}

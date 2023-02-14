package my.tms_hw.util;

import java.util.regex.Pattern;

public interface Validator {
    public boolean validate(String string);

    public void setPattern(String regex);

}

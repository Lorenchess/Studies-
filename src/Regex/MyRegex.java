package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyRegex {

    public String zeroTo255
            = "(\\d{1,2}|(0|1)\\"
            + "d{2}|2[0-4]\\d|25[0-5])";

    public String regex = zeroTo255 + "\\."
                + zeroTo255 + "\\."
                + zeroTo255 + "\\."
                + zeroTo255;


    public boolean isValidIPAddress(String ip) {
        Pattern p = Pattern.compile(regex);
        if (ip == null) return false;
        Matcher m = p.matcher(ip);
        return m.matches();
    }
}

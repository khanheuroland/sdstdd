package samsungtdd.Common;

import java.util.regex.Pattern;

public class Utility {
    public static boolean validateEmail(String email)
    {
        if(email==null) return false;
        if(email.isEmpty()) return false;
        Pattern emailPattern = Pattern.compile("^[a-zA-Z0-9\\.\\_]+@\\w+\\.\\w{2,}$");
        return emailPattern.matcher(email).matches();
    }
}

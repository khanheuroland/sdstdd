package samsungtdd;

import samsungtdd.Common.Utility;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Subscription {
    List<String> lstEmail = new ArrayList<>();
    public boolean subscribe(String email) {
        if(Utility.validateEmail(email))
        {
            if(!lstEmail.contains(email)) {
                lstEmail.add(email);
                return true;
            }
            else
                return false;
        }
        else
        {
            throw new IllegalArgumentException("Email is invalid!");
        }
    }
}

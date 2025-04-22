package org.example.service;
import org.apache.commons.validator.routines.EmailValidator;
import org.example.model.EmailData;

import java.util.ArrayList;
import java.util.List;


public class AuthService extends EmailData{

    static EmailData emailData = new EmailData();

    public static boolean isValidEmail(String email){
        EmailValidator validator = EmailValidator.getInstance();
        return validator.isValid(email);
    }



}



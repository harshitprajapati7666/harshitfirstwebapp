package com.theharshitprajapati.harshitfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate(String username, String password) {

        boolean isValidUserName = username.equalsIgnoreCase("harshit");
        boolean isValidPassword = password.equalsIgnoreCase("prajapati");

        return isValidUserName && isValidPassword;
    }
}

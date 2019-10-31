package com.devloop.androidmvp.Login;

public class LoginCredentials {
    private final String email, password;

    LoginCredentials(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}

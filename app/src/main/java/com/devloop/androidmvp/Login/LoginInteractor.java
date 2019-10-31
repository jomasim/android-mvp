package com.devloop.androidmvp.Login;

import android.text.TextUtils;

public class LoginInteractor {

    void login(LoginCredentials credentials) {
    }

    boolean hasError(LoginCredentials credentials) {
        String email = credentials.getEmail();
        String password = credentials.getPassword();
        if (TextUtils.isEmpty(email)) {
            return true;
        }
        if (TextUtils.isEmpty(password)) {
            return true;
        }
        if (password.length() < 5) {
            return true;
        }
        return false;
    }
}

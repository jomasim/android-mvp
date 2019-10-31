package com.devloop.androidmvp.Login;

public interface LoginContract {
    interface LoginListener {
        void onSuccess();

        void onFailure(String message);
    }

    interface LoginView {

        void showProgress();

        void hideProgress();

        void onSuccess();

        void onFailure(String message);
    }
}

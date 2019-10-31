package com.devloop.androidmvp.Login;

public class LoginPresenter implements LoginContract.LoginListener {
    LoginInteractor interactor;
    private LoginContract.LoginView loginView;

    LoginPresenter(LoginContract.LoginView loginView) {
        this.loginView = loginView;
        interactor = new LoginInteractor();
    }

    void start(LoginCredentials credentials) {
        loginView.showProgress();
        interactor.login(credentials);
    }

    @Override
    public void onSuccess() {
        loginView.hideProgress();
        loginView.onSuccess();
    }

    @Override
    public void onFailure(String message) {
        loginView.hideProgress();
        loginView.onFailure(message);
    }
}

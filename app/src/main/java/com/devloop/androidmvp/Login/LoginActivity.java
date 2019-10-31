package com.devloop.androidmvp.Login;

import android.os.Bundle;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.devloop.androidmvp.R;
import com.google.android.material.textfield.TextInputEditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity implements LoginContract.LoginView {
    LoginPresenter presenter;
    String email, password;
    @BindView(R.id.email)
    EditText emailField;
    @BindView(R.id.password)
    EditText passwordField;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        // create new  presenter instance
        presenter = new LoginPresenter(this);

    }

    @OnClick(R.id.btn_sign_in)
    void submit() {
        email = emailField.getText().toString();
        password = passwordField.getText().toString();
        LoginCredentials credentials = new LoginCredentials(email, password);
        presenter.start(credentials);
    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void onSuccess() {

    }

    @Override
    public void onFailure(String message) {

    }
}

package com.example.jonmid.worldcupinternet.Login.presenter;

import android.support.design.widget.TextInputEditText;

import com.example.jonmid.worldcupinternet.Login.interactor.LoginActivityInteractor;
import com.example.jonmid.worldcupinternet.Login.interactor.LoginActivityInteractorImpl;
import com.example.jonmid.worldcupinternet.Login.model.Login;
import com.example.jonmid.worldcupinternet.Login.view.LoginActivityView;

import java.util.List;

public class LoginActivityPresenterImpl implements LoginActivityPresenter {

    private LoginActivityView loginActivityView;
    private LoginActivityInteractor loginActivityInteractor;

    public LoginActivityPresenterImpl(LoginActivityView loginActivityView) {
        this.loginActivityView = loginActivityView;
        loginActivityInteractor = new LoginActivityInteractorImpl(this);
    }

    @Override
    public void signIn(String user, String pass) {
        loginActivityInteractor.signIn(user, pass);
    }

    @Override
    public void showResult(List<Login> loginList) {
        loginActivityView.showResult(loginList);
    }

    @Override
    public void showError(String error) {
        loginActivityView.showError(error);
    }
}

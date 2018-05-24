package com.example.jonmid.worldcupinternet.Login.interactor;

import com.example.jonmid.worldcupinternet.Login.presenter.LoginActivityPresenter;

public class LoginActivityInteractorImpl implements LoginActivityInteractor {

    private LoginActivityPresenter loginActivityPresenter;

    public LoginActivityInteractorImpl(LoginActivityPresenter loginActivityPresenter) {
        this.loginActivityPresenter = loginActivityPresenter;
    }

    @Override
    public void signIn() {
        //Validar los datos de usuario y contraseña
        loginActivityPresenter.showResult();
    }
}

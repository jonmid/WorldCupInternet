package com.example.jonmid.worldcupinternet.Login.interactor;

import com.example.jonmid.worldcupinternet.Login.presenter.LoginActivityPresenter;
import com.example.jonmid.worldcupinternet.Login.repository.LoginActivityRepository;
import com.example.jonmid.worldcupinternet.Login.repository.LoginActivityRepositoryImpl;

public class LoginActivityInteractorImpl implements LoginActivityInteractor {

    private LoginActivityPresenter loginActivityPresenter;
    private LoginActivityRepository loginActivityRepository;

    public LoginActivityInteractorImpl(LoginActivityPresenter loginActivityPresenter) {
        this.loginActivityPresenter = loginActivityPresenter;
        loginActivityRepository = new LoginActivityRepositoryImpl(this);
    }

    @Override
    public void signIn(String user, String pass) {
        if ("".equals(user) || "".equals(pass)){
            loginActivityPresenter.showError("Los campos no pueden estar vacios");
        }else {
            loginActivityRepository.signIn(user, pass);
        }
    }
}

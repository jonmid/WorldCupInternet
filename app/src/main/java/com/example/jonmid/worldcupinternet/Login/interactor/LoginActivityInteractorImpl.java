package com.example.jonmid.worldcupinternet.Login.interactor;

import android.util.Log;

import com.example.jonmid.worldcupinternet.Login.model.Login;
import com.example.jonmid.worldcupinternet.Login.presenter.LoginActivityPresenter;
import com.example.jonmid.worldcupinternet.Login.repository.LoginActivityRepository;
import com.example.jonmid.worldcupinternet.Login.repository.LoginActivityRepositoryImpl;
import com.google.gson.Gson;

import java.util.List;

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

    @Override
    public void processData(List<Login> loginList) {
        Boolean searchUser = loginList.get(0).isSearchUser();

        if (searchUser){
            loginActivityPresenter.showResult(loginList);
        }else{
            loginActivityPresenter.showError("El usuario ingresado no existe");
        }
    }
}

package com.example.jonmid.worldcupinternet.Login.presenter;

import android.support.design.widget.TextInputEditText;

import com.example.jonmid.worldcupinternet.Login.model.Login;

import java.util.List;

public interface LoginActivityPresenter {
    void signIn(String user, String pass);
    void showResult(List<Login> loginList);
    void showError(String error);
}

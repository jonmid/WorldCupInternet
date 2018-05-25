package com.example.jonmid.worldcupinternet.Login.presenter;

import android.support.design.widget.TextInputEditText;

public interface LoginActivityPresenter {
    void signIn(String user, String pass);
    void showResult();
    void showError(String error);
}

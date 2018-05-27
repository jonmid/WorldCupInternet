package com.example.jonmid.worldcupinternet.Login.view;

import com.example.jonmid.worldcupinternet.Login.model.Login;

import java.util.List;

public interface LoginActivityView {
    void showResult(List<Login> loginList);
    void showError(String error);
}

package com.example.jonmid.worldcupinternet.Login.interactor;

import com.example.jonmid.worldcupinternet.Login.model.Login;

import java.util.List;

public interface LoginActivityInteractor {
    void signIn(String user, String pass);
    void processData(List<Login> loginList);
}

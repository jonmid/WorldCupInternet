package com.example.jonmid.worldcupinternet.Login.repository;

import com.example.jonmid.worldcupinternet.ApiRest.RestApiAdapter;
import com.example.jonmid.worldcupinternet.ApiRest.Service;
import com.example.jonmid.worldcupinternet.Login.interactor.LoginActivityInteractor;
import com.example.jonmid.worldcupinternet.Login.model.Login;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivityRepositoryImpl implements LoginActivityRepository {

    private LoginActivityInteractor loginActivityInteractor;
    List<Login> loginList;

    public LoginActivityRepositoryImpl(LoginActivityInteractor loginActivityInteractor) {
        this.loginActivityInteractor = loginActivityInteractor;
    }

    @Override
    public void signIn(String user, String pass) {

        RestApiAdapter restApiAdapter = new RestApiAdapter();
        Service service = restApiAdapter.getClientService();
        service.onSignIn(user, pass).enqueue(new Callback<List<Login>>() {
            @Override
            public void onResponse(Call<List<Login>> call, Response<List<Login>> response) {
                loginList = response.body();
                loginActivityInteractor.processData(loginList);
            }

            @Override
            public void onFailure(Call<List<Login>> call, Throwable t) {
                //
            }
        });

    }
}

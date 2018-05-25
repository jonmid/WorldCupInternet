package com.example.jonmid.worldcupinternet.Login.repository;

import android.util.Log;

import com.example.jonmid.worldcupinternet.ApiRest.RestApiAdapter;
import com.example.jonmid.worldcupinternet.ApiRest.Service;
import com.example.jonmid.worldcupinternet.Login.interactor.LoginActivityInteractor;
import com.example.jonmid.worldcupinternet.Login.model.Login;
import com.example.jonmid.worldcupinternet.Login.model.User;

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
        /*RestApiAdapter restApiAdapter = new RestApiAdapter();
        Service service = restApiAdapter.getClientService();
        service.onSignIn(user, pass).enqueue(new Callback<List<User>>() {
            @Override
            public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                userList = response.body();
                //calendarFragmentInteractor.showResultCelendar(calendarList);

                String json = new Gson().toJson(userList);
                Log.d("LoginPost", json);

                //for (Calendar i:calendarList) {
                //System.out.println("\n"+i.getMatchs());
                //Log.d("post", i.getTitle());
                //}
            }

            @Override
            public void onFailure(Call<List<User>> call, Throwable t) {
                //
            }
        });*/

        RestApiAdapter restApiAdapter = new RestApiAdapter();
        Service service = restApiAdapter.getClientService();
        service.onSignIn(user, pass).enqueue(new Callback<List<Login>>() {
            @Override
            public void onResponse(Call<List<Login>> call, Response<List<Login>> response) {
                loginList = response.body();
                Log.d("LoginPost", "datos login");
            }

            @Override
            public void onFailure(Call<List<Login>> call, Throwable t) {
                Log.d("ERROR", "dddd aaa bbbb");
            }
        });


    }
}

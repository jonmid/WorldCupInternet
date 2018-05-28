package com.example.jonmid.worldcupinternet.CreateAccount.repository;

import android.util.Log;

import com.example.jonmid.worldcupinternet.ApiRest.RestApiAdapter;
import com.example.jonmid.worldcupinternet.ApiRest.Service;
import com.example.jonmid.worldcupinternet.CreateAccount.Model.Account;
import com.example.jonmid.worldcupinternet.CreateAccount.interactor.CreateAccountActivityInteractor;
import com.google.gson.Gson;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CreateAccountActivityRepositoryImpl implements CreateAccountActivityRepository {

    private CreateAccountActivityInteractor createAccountActivityInteractor;
    List<Account> accountList;

    public CreateAccountActivityRepositoryImpl(CreateAccountActivityInteractor createAccountActivityInteractor) {
        this.createAccountActivityInteractor = createAccountActivityInteractor;
    }

    @Override
    public void createAccount(Account account) {
        RestApiAdapter restApiAdapter = new RestApiAdapter();
        Service service = restApiAdapter.getClientService();
        service.onSignUp(account.getUser(), account.getPassword(), account.getName(), account.getEmail()).enqueue(new Callback<List<Account>>() {
            @Override
            public void onResponse(Call<List<Account>> call, Response<List<Account>> response) {
                accountList = response.body();
                //loginActivityInteractor.processData(loginList);

                String json = new Gson().toJson(accountList);
                Log.d("AccountPost", json);

                //for (Calendar i:calendarList) {
                //System.out.println("\n"+i.getMatchs());
                //Log.d("post", i.getTitle());
                //}
            }

            @Override
            public void onFailure(Call<List<Account>> call, Throwable t) {
                Log.d("AccountPost", "error en la peticion");
            }
        });
    }
}

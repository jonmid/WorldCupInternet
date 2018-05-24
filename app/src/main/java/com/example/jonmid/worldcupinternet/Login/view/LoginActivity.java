package com.example.jonmid.worldcupinternet.Login.view;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.jonmid.worldcupinternet.Home.view.HomeActivity;
import com.example.jonmid.worldcupinternet.Login.presenter.LoginActivityPresenter;
import com.example.jonmid.worldcupinternet.Login.presenter.LoginActivityPresenterImpl;
import com.example.jonmid.worldcupinternet.R;

public class LoginActivity extends AppCompatActivity implements LoginActivityView {

    private LoginActivityPresenter loginActivityPresenter;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginActivityPresenter = new LoginActivityPresenterImpl(this);
    }

    public void showHome(View view){
        signIn();
    }

    @Override
    public void signIn() {
        loginActivityPresenter.signIn();
    }

    @Override
    public void showResult() {
        // Inicializar coleccion de preferencias llamada mis "PreferencesWorldCup"
        sharedPreferences = getSharedPreferences("PreferencesWorldCup", Context.MODE_PRIVATE);

        // Crear preferencias Clave - Valor
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("email", "jamideros@hotmail.com");
        editor.putString("name", "Jonathan Mideros");
        editor.putString("user", "jonmid");
        editor.commit();

        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

    @Override
    public void showError() {

    }

    /*public void showRegister(View view){
        Intent intent = new Intent(this, CreateAccountActivity.class);
        startActivity(intent);
    }*/
}

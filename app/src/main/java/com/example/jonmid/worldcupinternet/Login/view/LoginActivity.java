package com.example.jonmid.worldcupinternet.Login.view;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.jonmid.worldcupinternet.CreateAccount.view.CreateAccountActivity;
import com.example.jonmid.worldcupinternet.Home.view.HomeActivity;
import com.example.jonmid.worldcupinternet.Login.model.Login;
import com.example.jonmid.worldcupinternet.Login.presenter.LoginActivityPresenter;
import com.example.jonmid.worldcupinternet.Login.presenter.LoginActivityPresenterImpl;
import com.example.jonmid.worldcupinternet.R;

import java.util.List;

public class LoginActivity extends AppCompatActivity implements LoginActivityView {

    private LoginActivityPresenter loginActivityPresenter;
    SharedPreferences sharedPreferences;
    TextInputEditText textInputEditTextUserName;
    TextInputEditText textInputEditTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginActivityPresenter = new LoginActivityPresenterImpl(this);
        textInputEditTextUserName = findViewById(R.id.id_txv_login_username);
        textInputEditTextPassword = findViewById(R.id.id_txv_login_password);
    }

    public void onClickButton(View view){
        loginActivityPresenter.signIn(textInputEditTextUserName.getText().toString(), textInputEditTextPassword.getText().toString());
    }

    @Override
    public void showResult(List<Login> loginList) {
        // Inicializar coleccion de preferencias llamada mis "PreferencesWorldCup"
        sharedPreferences = getSharedPreferences("PreferencesWorldCup", Context.MODE_PRIVATE);

        // Crear preferencias Clave - Valor
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("email", loginList.get(0).getEmail());
        editor.putString("name", loginList.get(0).getName());
        editor.putString("user", loginList.get(0).getUser());
        editor.putString("img", loginList.get(0).getImg_user());
        editor.commit();

        Intent intent = new Intent(this, HomeActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }

    @Override
    public void showError(String error) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show();
    }

    public void onClickButtonCreateAccount(View view){
        Intent intent = new Intent(this, CreateAccountActivity.class);
        startActivity(intent);
    }
}

package com.example.jonmid.worldcupinternet.Home.view;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.jonmid.worldcupinternet.Home.presenter.HomeActivityPresenter;
import com.example.jonmid.worldcupinternet.Home.presenter.HomeActivityPresenterImpl;
import com.example.jonmid.worldcupinternet.Login.view.LoginActivity;
import com.example.jonmid.worldcupinternet.R;
import com.example.jonmid.worldcupinternet.Utilities.BottomNavigationViewHelper;

public class HomeActivity extends AppCompatActivity implements HomeActivityView {

    private HomeActivityPresenter homeActivityPresenter;
    BottomNavigationView bottomNavigationView;
    FragmentManager fragmentManager;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        homeActivityPresenter = new HomeActivityPresenterImpl(this);
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.id_bnv_index);
        BottomNavigationViewHelper.removeShiftMode(bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.id_menubn_news);
        fragmentManager = getSupportFragmentManager();

        initSharedPreferences();
    }

    public void initSharedPreferences(){
        // Inicializar coleccion de preferencias llamada mis "PreferencesWorldCup"
        sharedPreferences = getSharedPreferences("PreferencesWorldCup", Context.MODE_PRIVATE);

        String user = sharedPreferences.getString("user", null);

        if ( (user == null) || (user.equals("")) ){
            Intent intent = new Intent(this, LoginActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
        }else {
            initBottomNavigationView();
        }
    }

    public void initBottomNavigationView(){
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.id_menubn_calendar:
                        homeActivityPresenter.ChangeTab(0, fragmentManager);
                        break;
                    case R.id.id_menubn_group:
                        homeActivityPresenter.ChangeTab(1, fragmentManager);
                        break;
                    case R.id.id_menubn_news:
                        homeActivityPresenter.ChangeTab(2, fragmentManager);
                        break;
                    case R.id.id_menubn_stadium:
                        homeActivityPresenter.ChangeTab(3, fragmentManager);
                        break;
                    case R.id.id_menubn_profile:
                        homeActivityPresenter.ChangeTab(4, fragmentManager);
                        break;
                }

                return true;
            }
        });
    }

    @Override
    public void showResult() {

    }
}

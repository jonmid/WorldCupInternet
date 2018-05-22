package com.example.jonmid.worldcupinternet.Home.view;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.jonmid.worldcupinternet.Home.presenter.HomeActivityPresenter;
import com.example.jonmid.worldcupinternet.Home.presenter.HomeActivityPresenterImpl;
import com.example.jonmid.worldcupinternet.R;
import com.example.jonmid.worldcupinternet.Utilities.BottomNavigationViewHelper;

public class HomeActivity extends AppCompatActivity implements HomeActivityView {

    private HomeActivityPresenter homeActivityPresenter;
    BottomNavigationView bottomNavigationView;
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        homeActivityPresenter = new HomeActivityPresenterImpl(this);

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.id_bnv_index);
        BottomNavigationViewHelper.removeShiftMode(bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.id_menubn_news);

        fragmentManager = getSupportFragmentManager();

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

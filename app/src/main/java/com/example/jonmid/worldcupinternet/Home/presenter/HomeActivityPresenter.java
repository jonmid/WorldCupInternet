package com.example.jonmid.worldcupinternet.Home.presenter;

import android.content.Context;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;

public interface HomeActivityPresenter {
    void showResult();
    void ChangeTab(Integer position, FragmentManager fragmentManager);
}

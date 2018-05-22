package com.example.jonmid.worldcupinternet.Home.presenter;

import android.content.Context;
import android.support.v4.app.FragmentManager;

import com.example.jonmid.worldcupinternet.Home.interactor.HomeActivityInteractor;
import com.example.jonmid.worldcupinternet.Home.interactor.HomeActivityInteractorImpl;
import com.example.jonmid.worldcupinternet.Home.view.HomeActivityView;

public class HomeActivityPresenterImpl implements HomeActivityPresenter{

    private HomeActivityView homeActivityView;
    private HomeActivityInteractor homeActivityInteractor;

    public HomeActivityPresenterImpl(HomeActivityView homeActivityView) {
        this.homeActivityView = homeActivityView;
        homeActivityInteractor = new HomeActivityInteractorImpl(this);
    }

    @Override
    public void showResult() {

    }

    @Override
    public void ChangeTab(Integer position, FragmentManager fragmentManager) {
        homeActivityInteractor.ChangeTab(position, fragmentManager);
    }
}

package com.example.jonmid.worldcupinternet.Home.interactor;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.example.jonmid.worldcupinternet.Calendar.view.CalendarFragment;
import com.example.jonmid.worldcupinternet.Groups.view.GroupFragment;
import com.example.jonmid.worldcupinternet.News.view.NewsFragment;
import com.example.jonmid.worldcupinternet.Profile.view.ProfileFragment;
import com.example.jonmid.worldcupinternet.R;

import com.example.jonmid.worldcupinternet.Home.presenter.HomeActivityPresenter;
import com.example.jonmid.worldcupinternet.Stadiums.view.StadiumsFragment;

public class HomeActivityInteractorImpl implements HomeActivityInteractor{

    private HomeActivityPresenter homeActivityPresenter;

    public HomeActivityInteractorImpl(HomeActivityPresenter homeActivityPresenter) {
        this.homeActivityPresenter = homeActivityPresenter;
    }

    @Override
    public void ChangeTab(Integer position, FragmentManager fragmentManager) {
        switch (position){
            case 0:
                CalendarFragment calendarFragment = new CalendarFragment();
                fragmentManager
                        .beginTransaction()
                        .replace(R.id.id_fl_index, calendarFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                        .addToBackStack(null)
                        .commit();
                break;
            case 1:
                GroupFragment groupFragment = new GroupFragment();
                fragmentManager
                        .beginTransaction()
                        .replace(R.id.id_fl_index, groupFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                        .addToBackStack(null)
                        .commit();
                break;
            case 2:
                NewsFragment newsFragment = new NewsFragment();
                fragmentManager
                        .beginTransaction()
                        .replace(R.id.id_fl_index, newsFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                        .addToBackStack(null)
                        .commit();
                break;
            case 3:
                StadiumsFragment stadiumsFragment = new StadiumsFragment();
                fragmentManager
                        .beginTransaction()
                        .replace(R.id.id_fl_index, stadiumsFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                        .addToBackStack(null)
                        .commit();
                break;
            case 4:
                ProfileFragment profileFragment = new ProfileFragment();
                fragmentManager
                        .beginTransaction()
                        .replace(R.id.id_fl_index, profileFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                        .addToBackStack(null)
                        .commit();
                break;
        }
    }
}

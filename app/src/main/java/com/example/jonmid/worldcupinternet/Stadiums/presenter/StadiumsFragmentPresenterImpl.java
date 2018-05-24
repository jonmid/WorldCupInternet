package com.example.jonmid.worldcupinternet.Stadiums.presenter;

import com.example.jonmid.worldcupinternet.Stadiums.interactor.StadiumsFragmentInteractor;
import com.example.jonmid.worldcupinternet.Stadiums.interactor.StadiumsFragmentInteractorImpl;
import com.example.jonmid.worldcupinternet.Stadiums.model.Stadium;
import com.example.jonmid.worldcupinternet.Stadiums.view.StadiumsFragmentView;

import java.util.List;

public class StadiumsFragmentPresenterImpl implements StadiumsFragmentPresenter {

    private StadiumsFragmentView stadiumsFragmentView;
    private StadiumsFragmentInteractor stadiumsFragmentInteractor;

    public StadiumsFragmentPresenterImpl(StadiumsFragmentView stadiumsFragmentView) {
        this.stadiumsFragmentView = stadiumsFragmentView;
        stadiumsFragmentInteractor = new StadiumsFragmentInteractorImpl(this);
    }

    @Override
    public void showResultStadium(List<Stadium> stadiumList) {
        stadiumsFragmentView.showResultStadium(stadiumList);
    }

    @Override
    public void getDataStadium() {
        stadiumsFragmentInteractor.getDataStadium();
    }
}

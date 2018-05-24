package com.example.jonmid.worldcupinternet.Stadiums.interactor;

import com.example.jonmid.worldcupinternet.Stadiums.model.Stadium;
import com.example.jonmid.worldcupinternet.Stadiums.presenter.StadiumsFragmentPresenter;
import com.example.jonmid.worldcupinternet.Stadiums.repository.StadiumsFragmentRepository;
import com.example.jonmid.worldcupinternet.Stadiums.repository.StadiumsFragmentRepositoryImpl;

import java.util.List;

public class StadiumsFragmentInteractorImpl implements StadiumsFragmentInteractor {

    private StadiumsFragmentPresenter stadiumsFragmentPresenter;
    private StadiumsFragmentRepository stadiumsFragmentRepository;

    public StadiumsFragmentInteractorImpl(StadiumsFragmentPresenter stadiumsFragmentPresenter) {
        this.stadiumsFragmentPresenter = stadiumsFragmentPresenter;
        stadiumsFragmentRepository = new StadiumsFragmentRepositoryImpl(this);
    }

    @Override
    public void getDataStadium() {
        stadiumsFragmentRepository.getDataStadium();
    }

    @Override
    public void showResultStadium(List<Stadium> stadiumList) {
        stadiumsFragmentPresenter.showResultStadium(stadiumList);
    }
}

package com.example.jonmid.worldcupinternet.Stadiums.presenter;

import com.example.jonmid.worldcupinternet.Stadiums.model.Stadium;

import java.util.List;

public interface StadiumsFragmentPresenter {
    void showResultStadium(List<Stadium> stadiumList);
    void getDataStadium();
}

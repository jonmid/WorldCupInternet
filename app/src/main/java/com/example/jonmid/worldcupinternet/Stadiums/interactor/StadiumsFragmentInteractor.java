package com.example.jonmid.worldcupinternet.Stadiums.interactor;

import com.example.jonmid.worldcupinternet.Stadiums.model.Stadium;

import java.util.List;

public interface StadiumsFragmentInteractor {
    void getDataStadium();
    void showResultStadium(List<Stadium> stadiumList);
}

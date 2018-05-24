package com.example.jonmid.worldcupinternet.Stadiums.repository;

import com.example.jonmid.worldcupinternet.ApiRest.RestApiAdapter;
import com.example.jonmid.worldcupinternet.ApiRest.Service;
import com.example.jonmid.worldcupinternet.Stadiums.interactor.StadiumsFragmentInteractor;
import com.example.jonmid.worldcupinternet.Stadiums.model.Stadium;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class StadiumsFragmentRepositoryImpl implements StadiumsFragmentRepository {

    private StadiumsFragmentInteractor stadiumsFragmentInteractor;
    List<Stadium> stadiumList;

    public StadiumsFragmentRepositoryImpl(StadiumsFragmentInteractor stadiumsFragmentInteractor) {
        this.stadiumsFragmentInteractor = stadiumsFragmentInteractor;
    }

    @Override
    public void getDataStadium() {
        RestApiAdapter restApiAdapter = new RestApiAdapter();
        Service service = restApiAdapter.getClientService();
        Call<List<Stadium>> groups = service.getDataStadium();
        groups.enqueue(new Callback<List<Stadium>>() {
            @Override
            public void onResponse(Call<List<Stadium>> call, Response<List<Stadium>> response) {
                stadiumList = response.body();
                stadiumsFragmentInteractor.showResultStadium(stadiumList);
            }

            @Override
            public void onFailure(Call<List<Stadium>> call, Throwable t) {
                //
            }
        });
    }
}

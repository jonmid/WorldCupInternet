package com.example.jonmid.worldcupinternet.Calendar.repository;

import android.util.Log;

import com.example.jonmid.worldcupinternet.ApiRest.RestApiAdapter;
import com.example.jonmid.worldcupinternet.ApiRest.Service;
import com.example.jonmid.worldcupinternet.Calendar.interactor.CalendarFragmentInteractor;
import com.example.jonmid.worldcupinternet.Calendar.model.Calendar;
import com.google.gson.Gson;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CalendarFragmentRepositoryImpl implements CalendarFragmentRepository {

    private CalendarFragmentInteractor calendarFragmentInteractor;
    List<Calendar> calendarList;

    public CalendarFragmentRepositoryImpl(CalendarFragmentInteractor calendarFragmentInteractor) {
        this.calendarFragmentInteractor = calendarFragmentInteractor;
    }

    @Override
    public void getDataCalendar() {
        RestApiAdapter restApiAdapter = new RestApiAdapter();
        Service service = restApiAdapter.getClientService();
        Call<List<Calendar>> matchs = service.getDataCalendar();
        matchs.enqueue(new Callback<List<Calendar>>() {
            @Override
            public void onResponse(Call<List<Calendar>> call, Response<List<Calendar>> response) {
                calendarList = response.body();
                calendarFragmentInteractor.showResultCelendar(calendarList);

                //String json = new Gson().toJson(calendarList);
                //Log.d("CalendarGet", json);

                //for (Calendar i:calendarList) {
                //System.out.println("\n"+i.getMatchs());
                //Log.d("post", i.getTitle());
                //}
            }

            @Override
            public void onFailure(Call<List<Calendar>> call, Throwable t) {
                //
            }
        });
    }
}

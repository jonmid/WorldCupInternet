package com.example.jonmid.worldcupinternet.ApiRest;

import com.example.jonmid.worldcupinternet.Calendar.model.Calendar;
import com.example.jonmid.worldcupinternet.Groups.model.Group;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Service {
    @GET(Constants.URL_GET_CALENDAR)
    Call<List<Calendar>> getDataCalendar();

    @GET(Constants.URL_GET_GROUP)
    Call<List<Group>> getDataGroup();
}

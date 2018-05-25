package com.example.jonmid.worldcupinternet.ApiRest;

import com.example.jonmid.worldcupinternet.Calendar.model.Calendar;
import com.example.jonmid.worldcupinternet.Groups.model.Group;
import com.example.jonmid.worldcupinternet.Login.model.Login;
import com.example.jonmid.worldcupinternet.Login.model.User;
import com.example.jonmid.worldcupinternet.Stadiums.model.Stadium;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Service {
    @POST(Constants.URL_POST_LOGIN)
    @FormUrlEncoded
    Call<List<Login>> onSignIn(@Field("user") String user, @Field("pass") String pass);

    @GET(Constants.URL_GET_CALENDAR)
    Call<List<Calendar>> getDataCalendar();

    @GET(Constants.URL_GET_GROUP)
    Call<List<Group>> getDataGroup();

    @GET(Constants.URL_GET_STADIUM)
    Call<List<Stadium>> getDataStadium();
}

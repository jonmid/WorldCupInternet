package com.example.jonmid.worldcupinternet.Calendar.repository;

import android.util.Log;

import com.example.jonmid.worldcupinternet.ApiRest.RestApiAdapter;
import com.example.jonmid.worldcupinternet.ApiRest.Service;
import com.example.jonmid.worldcupinternet.Calendar.interactor.CalendarFragmentInteractor;
import com.example.jonmid.worldcupinternet.Calendar.model.Calendar;
import com.example.jonmid.worldcupinternet.Calendar.model.Post;
import com.example.jonmid.worldcupinternet.Calendar.model.RecyclerViewItem;
import com.google.gson.Gson;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CalendarFragmentRepositoryImpl implements CalendarFragmentRepository {

    private CalendarFragmentInteractor calendarFragmentInteractor;
    List<RecyclerViewItem> recyclerViewItemList;
    List<Calendar> calendarList;
    List<Post> postList;

    public CalendarFragmentRepositoryImpl(CalendarFragmentInteractor calendarFragmentInteractor) {
        this.calendarFragmentInteractor = calendarFragmentInteractor;
    }

    @Override
    public void getListDataCalendar() {
        /*
        RestApiAdapter restApiAdapter = new RestApiAdapter();
        Service service = restApiAdapter.getClientService();

        Call<List<Calendar>> matchs = service.getDataCalendar();

        matchs.enqueue(new Callback<List<Calendar>>() {
            @Override
            public void onResponse(Call<List<Calendar>> call, Response<List<Calendar>> response) {
                calendarList = response.body();
                //recyclerViewItemList = response.body();

                String json = new Gson().toJson(calendarList);
                Log.d("CalendarGet", json);

                calendarFragmentInteractor.showData(recyclerViewItemList);

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
        */

        RestApiAdapter restApiAdapter = new RestApiAdapter();
        Service service = restApiAdapter.getPostService();
        Call<List<Post>> matchs = service.getDataPost();
        matchs.enqueue(new Callback<List<Post>>() {
            @Override
            public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
                postList = response.body();

                //String json = new Gson().toJson(postList);
                //Log.d("CalendarGet", json);

                calendarFragmentInteractor.showResultPost(postList);

                //calendarFragmentInteractor.showData(recyclerViewItemList);

                //for (Calendar i:calendarList) {
                //System.out.println("\n"+i.getMatchs());
                //Log.d("post", i.getTitle());
                //}
            }

            @Override
            public void onFailure(Call<List<Post>> call, Throwable t) {
                //
            }
        });
    }
}

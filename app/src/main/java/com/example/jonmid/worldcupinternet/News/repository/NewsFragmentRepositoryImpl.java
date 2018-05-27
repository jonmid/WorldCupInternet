package com.example.jonmid.worldcupinternet.News.repository;

import com.example.jonmid.worldcupinternet.ApiRest.RestApiAdapter;
import com.example.jonmid.worldcupinternet.ApiRest.Service;
import com.example.jonmid.worldcupinternet.News.interactor.NewsFragmentInteractor;
import com.example.jonmid.worldcupinternet.News.model.News;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NewsFragmentRepositoryImpl implements NewsFragmentRepository {

    private NewsFragmentInteractor newsFragmentInteractor;
    List<News> newsList;

    public NewsFragmentRepositoryImpl(NewsFragmentInteractor newsFragmentInteractor) {
        this.newsFragmentInteractor = newsFragmentInteractor;
    }

    @Override
    public void getDataNews() {
        RestApiAdapter restApiAdapter = new RestApiAdapter();
        Service service = restApiAdapter.getClientService();
        Call<List<News>> news = service.getDataNews();
        news.enqueue(new Callback<List<News>>() {
            @Override
            public void onResponse(Call<List<News>> call, Response<List<News>> response) {
                newsList = response.body();
                newsFragmentInteractor.showResultNews(newsList);
            }

            @Override
            public void onFailure(Call<List<News>> call, Throwable t) {
                //
            }
        });
    }
}

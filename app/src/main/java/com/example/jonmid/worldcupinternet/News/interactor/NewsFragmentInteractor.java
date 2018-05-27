package com.example.jonmid.worldcupinternet.News.interactor;

import com.example.jonmid.worldcupinternet.News.model.News;

import java.util.List;

public interface NewsFragmentInteractor {
    void getDataNews();
    void showResultNews(List<News> newsList);
}

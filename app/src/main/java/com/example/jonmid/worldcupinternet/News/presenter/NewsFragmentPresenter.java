package com.example.jonmid.worldcupinternet.News.presenter;

import com.example.jonmid.worldcupinternet.News.model.News;

import java.util.List;

public interface NewsFragmentPresenter {
    void getDataNews();
    void showResultNews(List<News> newsList);
}

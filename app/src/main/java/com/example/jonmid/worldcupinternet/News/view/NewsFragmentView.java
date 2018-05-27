package com.example.jonmid.worldcupinternet.News.view;

import com.example.jonmid.worldcupinternet.News.model.News;

import java.util.List;

public interface NewsFragmentView {
    void getDataNews();
    void showResultNews(List<News> newsList);
}

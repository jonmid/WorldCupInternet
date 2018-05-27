package com.example.jonmid.worldcupinternet.News.presenter;

import com.example.jonmid.worldcupinternet.News.interactor.NewsFragmentInteractor;
import com.example.jonmid.worldcupinternet.News.interactor.NewsFragmentInteractorImpl;
import com.example.jonmid.worldcupinternet.News.model.News;
import com.example.jonmid.worldcupinternet.News.view.NewsFragmentView;

import java.util.List;

public class NewsFragmentPresenterImpl implements NewsFragmentPresenter {

    private NewsFragmentView newsFragmentView;
    private NewsFragmentInteractor newsFragmentInteractor;

    public NewsFragmentPresenterImpl(NewsFragmentView newsFragmentView) {
        this.newsFragmentView = newsFragmentView;
        newsFragmentInteractor = new NewsFragmentInteractorImpl(this);
    }

    @Override
    public void getDataNews() {
        newsFragmentInteractor.getDataNews();
    }

    @Override
    public void showResultNews(List<News> newsList) {
        newsFragmentView.showResultNews(newsList);
    }
}

package com.example.jonmid.worldcupinternet.News.interactor;

import com.example.jonmid.worldcupinternet.News.model.News;
import com.example.jonmid.worldcupinternet.News.presenter.NewsFragmentPresenter;
import com.example.jonmid.worldcupinternet.News.repository.NewsFragmentRepository;
import com.example.jonmid.worldcupinternet.News.repository.NewsFragmentRepositoryImpl;

import java.util.List;

public class NewsFragmentInteractorImpl implements NewsFragmentInteractor {

    private NewsFragmentPresenter newsFragmentPresenter;
    private NewsFragmentRepository newsFragmentRepository;

    public NewsFragmentInteractorImpl(NewsFragmentPresenter newsFragmentPresenter) {
        this.newsFragmentPresenter = newsFragmentPresenter;
        newsFragmentRepository = new NewsFragmentRepositoryImpl(this);
    }

    @Override
    public void getDataNews() {
        newsFragmentRepository.getDataNews();
    }

    @Override
    public void showResultNews(List<News> newsList) {
        newsFragmentPresenter.showResultNews(newsList);
    }
}

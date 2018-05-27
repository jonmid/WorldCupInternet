package com.example.jonmid.worldcupinternet.News.view;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.jonmid.worldcupinternet.News.adapter.NewsAdapter;
import com.example.jonmid.worldcupinternet.News.model.News;
import com.example.jonmid.worldcupinternet.News.presenter.NewsFragmentPresenter;
import com.example.jonmid.worldcupinternet.News.presenter.NewsFragmentPresenterImpl;
import com.example.jonmid.worldcupinternet.R;
import com.squareup.picasso.Picasso;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class NewsFragment extends Fragment implements NewsFragmentView {

    private NewsFragmentPresenter newsFragmentPresenter;
    ViewPager viewPager;
    ImageView imageViewVideo;

    public NewsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_news, container, false);

        viewPager = view.findViewById(R.id.id_vp_news);
        imageViewVideo = view.findViewById(R.id.id_img_video);
        Picasso.get().load("https://img.fifa.com/image/upload/t_tc1/he3biyilneapij0hkibc.jpg").into(imageViewVideo);
        newsFragmentPresenter = new NewsFragmentPresenterImpl(this);
        newsFragmentPresenter.getDataNews();

        return view;
    }

    @Override
    public void getDataNews() {
        newsFragmentPresenter.getDataNews();
    }

    @Override
    public void showResultNews(List<News> newsList) {
        viewPager.setAdapter(new NewsAdapter(newsList, getContext()));
    }
}

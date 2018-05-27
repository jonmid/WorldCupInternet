package com.example.jonmid.worldcupinternet.News.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jonmid.worldcupinternet.News.model.News;
import com.example.jonmid.worldcupinternet.R;
import com.example.jonmid.worldcupinternet.Stadiums.model.Stadium;
import com.squareup.picasso.Picasso;

import java.util.List;

public class NewsAdapter extends PagerAdapter {

    List<News> newsList;
    Context context;
    LayoutInflater layoutInflater;

    public NewsAdapter(List<News> newsList, Context context) {
        this.newsList = newsList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return newsList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        News object = newsList.get(position);
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.item_news, null);

        ImageView imageView = view.findViewById(R.id.id_img_news_image);
        TextView textViewTitle = view.findViewById(R.id.id_txv_news_title);
        TextView textViewSubTitle = view.findViewById(R.id.id_txv_news_subtitle);

        Picasso.get().load(object.getUrl_news()).into(imageView);
        textViewTitle.setText(object.getTitle());
        textViewSubTitle.setText(object.getSubtitle());

        ViewPager vp = (ViewPager) container;
        vp.addView(view, 0);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        ViewPager vp = (ViewPager) container;
        View view = (View) object;
        vp.removeView(view);
    }
}

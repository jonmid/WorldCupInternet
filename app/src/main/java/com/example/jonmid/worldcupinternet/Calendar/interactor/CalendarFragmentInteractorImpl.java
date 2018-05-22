package com.example.jonmid.worldcupinternet.Calendar.interactor;

import android.support.v7.widget.RecyclerView;

import com.example.jonmid.worldcupinternet.Calendar.model.Calendar;
import com.example.jonmid.worldcupinternet.Calendar.model.Post;
import com.example.jonmid.worldcupinternet.Calendar.model.RecyclerViewItem;
import com.example.jonmid.worldcupinternet.Calendar.presenter.CalendarFragmentPresenter;
import com.example.jonmid.worldcupinternet.Calendar.repository.CalendarFragmentRepository;
import com.example.jonmid.worldcupinternet.Calendar.repository.CalendarFragmentRepositoryImpl;

import java.util.List;

public class CalendarFragmentInteractorImpl implements CalendarFragmentInteractor {

    private CalendarFragmentPresenter calendarFragmentPresenter;
    private CalendarFragmentRepository calendarFragmentRepository;

    public CalendarFragmentInteractorImpl(CalendarFragmentPresenter calendarFragmentPresenter) {
        this.calendarFragmentPresenter = calendarFragmentPresenter;
        calendarFragmentRepository = new CalendarFragmentRepositoryImpl(this);
    }

    @Override
    public void getListDataCalendar() {
        calendarFragmentRepository.getListDataCalendar();
    }

    @Override
    public void showData(List<RecyclerViewItem> recyclerViewItemList) {
        calendarFragmentPresenter.showData(recyclerViewItemList);
    }

    @Override
    public void showResultPost(List<Post> postList) {
        calendarFragmentPresenter.showResultPost(postList);
    }
}

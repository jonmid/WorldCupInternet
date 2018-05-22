package com.example.jonmid.worldcupinternet.Calendar.presenter;

import com.example.jonmid.worldcupinternet.Calendar.interactor.CalendarFragmentInteractor;
import com.example.jonmid.worldcupinternet.Calendar.interactor.CalendarFragmentInteractorImpl;
import com.example.jonmid.worldcupinternet.Calendar.model.Calendar;
import com.example.jonmid.worldcupinternet.Calendar.model.Post;
import com.example.jonmid.worldcupinternet.Calendar.model.RecyclerViewItem;
import com.example.jonmid.worldcupinternet.Calendar.view.CalendarFragmentView;

import java.util.List;

public class CalendarFragmentPresenterImpl implements CalendarFragmentPresenter {

    private CalendarFragmentView calendarFragmentView;
    private CalendarFragmentInteractor calendarFragmentInteractor;

    public CalendarFragmentPresenterImpl(CalendarFragmentView calendarFragmentView) {
        this.calendarFragmentView = calendarFragmentView;
        calendarFragmentInteractor = new CalendarFragmentInteractorImpl(this);
    }

    @Override
    public void showResult(List<RecyclerViewItem> recyclerViewItemList) {
        //
    }

    @Override
    public void getListDataCalendar() {
        calendarFragmentInteractor.getListDataCalendar();
    }

    @Override
    public void showData(List<RecyclerViewItem> recyclerViewItemList) {
        calendarFragmentView.showResult(recyclerViewItemList);
    }

    @Override
    public void showResultPost(List<Post> postList) {
        calendarFragmentView.showResultPost(postList);
    }
}

package com.example.jonmid.worldcupinternet.Calendar.presenter;

import com.example.jonmid.worldcupinternet.Calendar.interactor.CalendarFragmentInteractor;
import com.example.jonmid.worldcupinternet.Calendar.interactor.CalendarFragmentInteractorImpl;
import com.example.jonmid.worldcupinternet.Calendar.model.Calendar;
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
    public void showResultCelendar(List<Calendar> calendarList) {
        calendarFragmentView.showResultCelendar(calendarList);
    }

    @Override
    public void getDataCalendar() {
        calendarFragmentInteractor.getDataCalendar();
    }
}

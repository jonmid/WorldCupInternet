package com.example.jonmid.worldcupinternet.Calendar.interactor;

import com.example.jonmid.worldcupinternet.Calendar.model.Calendar;
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
    public void getDataCalendar() {
        calendarFragmentRepository.getDataCalendar();
    }

    @Override
    public void showResultCelendar(List<Calendar> calendarList) {
        calendarFragmentPresenter.showResultCelendar(calendarList);
    }
}

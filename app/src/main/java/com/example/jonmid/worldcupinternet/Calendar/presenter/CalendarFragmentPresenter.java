package com.example.jonmid.worldcupinternet.Calendar.presenter;

import com.example.jonmid.worldcupinternet.Calendar.model.Calendar;

import java.util.List;

public interface CalendarFragmentPresenter {
    void showResultCelendar(List<Calendar> calendarList);
    void getDataCalendar();
}

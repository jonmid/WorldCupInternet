package com.example.jonmid.worldcupinternet.Calendar.interactor;

import com.example.jonmid.worldcupinternet.Calendar.model.Calendar;

import java.util.List;

public interface CalendarFragmentInteractor {
    void getDataCalendar();
    void showResultCelendar(List<Calendar> calendarList);
}

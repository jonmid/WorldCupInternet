package com.example.jonmid.worldcupinternet.Calendar.view;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.example.jonmid.worldcupinternet.Calendar.adapter.CalendarAdapter;
import com.example.jonmid.worldcupinternet.Calendar.model.Calendar;
import com.example.jonmid.worldcupinternet.Calendar.presenter.CalendarFragmentPresenter;
import com.example.jonmid.worldcupinternet.Calendar.presenter.CalendarFragmentPresenterImpl;
import com.example.jonmid.worldcupinternet.R;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class CalendarFragment extends Fragment implements CalendarFragmentView {

    private CalendarFragmentPresenter calendarFragmentPresenter;
    ProgressBar progressBarCalendar;
    RecyclerView recyclerViewCalendar;

    public CalendarFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_calendar, container, false);

        progressBarCalendar = (ProgressBar) view.findViewById(R.id.id_pgb_calendar);
        recyclerViewCalendar = (RecyclerView) view.findViewById(R.id.id_rcv_calendar);
        recyclerViewCalendar.setLayoutManager(new LinearLayoutManager(getContext()));

        calendarFragmentPresenter = new CalendarFragmentPresenterImpl(this);

        progressBarCalendar.setVisibility(View.VISIBLE);
        calendarFragmentPresenter.getDataCalendar();

        return view;
    }

    @Override
    public void showResultCelendar(List<Calendar> calendarList) {
        progressBarCalendar.setVisibility(View.GONE);
        recyclerViewCalendar.setAdapter(new CalendarAdapter(calendarList, getContext()));
    }
}

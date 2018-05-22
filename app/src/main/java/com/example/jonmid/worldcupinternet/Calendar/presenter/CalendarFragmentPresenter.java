package com.example.jonmid.worldcupinternet.Calendar.presenter;

import com.example.jonmid.worldcupinternet.Calendar.model.Calendar;
import com.example.jonmid.worldcupinternet.Calendar.model.Post;
import com.example.jonmid.worldcupinternet.Calendar.model.RecyclerViewItem;

import java.util.List;

public interface CalendarFragmentPresenter {
    void showResult(List<RecyclerViewItem> recyclerViewItemList);
    void getListDataCalendar();
    void showData(List<RecyclerViewItem> recyclerViewItemList);
    void showResultPost(List<Post> postList);
}

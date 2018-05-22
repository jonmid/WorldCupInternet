package com.example.jonmid.worldcupinternet.Calendar.interactor;

import com.example.jonmid.worldcupinternet.Calendar.model.Calendar;
import com.example.jonmid.worldcupinternet.Calendar.model.Post;
import com.example.jonmid.worldcupinternet.Calendar.model.RecyclerViewItem;

import java.util.List;

public interface CalendarFragmentInteractor {
    void getListDataCalendar();
    void showData(List<RecyclerViewItem> recyclerViewItemList);
    void showResultPost(List<Post> postList);
}

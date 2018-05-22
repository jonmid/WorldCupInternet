package com.example.jonmid.worldcupinternet.Calendar.view;

import com.example.jonmid.worldcupinternet.Calendar.model.Calendar;
import com.example.jonmid.worldcupinternet.Calendar.model.Post;
import com.example.jonmid.worldcupinternet.Calendar.model.RecyclerViewItem;

import java.util.List;

public interface CalendarFragmentView {
    void showResult(List<RecyclerViewItem> recyclerViewItemList);
    void showResultPost(List<Post> postList);
}

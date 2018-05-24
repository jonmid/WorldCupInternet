package com.example.jonmid.worldcupinternet.Groups.presenter;

import com.example.jonmid.worldcupinternet.Groups.model.Group;

import java.util.List;

public interface GroupFragmentPresenter {
    void showResultGroups(List<Group> calendarList);
    void getDataGroup();
}

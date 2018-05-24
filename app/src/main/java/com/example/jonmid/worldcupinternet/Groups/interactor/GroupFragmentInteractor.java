package com.example.jonmid.worldcupinternet.Groups.interactor;

import com.example.jonmid.worldcupinternet.Groups.model.Group;

import java.util.List;

public interface GroupFragmentInteractor {
    void getDataGroup();
    void showResultGroups(List<Group> calendarList);
}

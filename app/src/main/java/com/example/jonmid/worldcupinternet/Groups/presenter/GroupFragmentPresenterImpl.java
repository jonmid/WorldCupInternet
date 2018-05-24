package com.example.jonmid.worldcupinternet.Groups.presenter;

import com.example.jonmid.worldcupinternet.Groups.interactor.GroupFragmentInteractor;
import com.example.jonmid.worldcupinternet.Groups.interactor.GroupFragmentInteractorImpl;
import com.example.jonmid.worldcupinternet.Groups.model.Group;
import com.example.jonmid.worldcupinternet.Groups.view.GroupFragmentView;

import java.util.List;

public class GroupFragmentPresenterImpl implements GroupFragmentPresenter {

    private GroupFragmentView groupFragmentView;
    private GroupFragmentInteractor groupFragmentInteractor;

    public GroupFragmentPresenterImpl(GroupFragmentView groupFragmentView) {
        this.groupFragmentView = groupFragmentView;
        groupFragmentInteractor = new GroupFragmentInteractorImpl(this);
    }

    @Override
    public void showResultGroups(List<Group> calendarList) {
        groupFragmentView.showResultGroups(calendarList);
    }

    @Override
    public void getDataGroup() {
        groupFragmentInteractor.getDataGroup();
    }
}

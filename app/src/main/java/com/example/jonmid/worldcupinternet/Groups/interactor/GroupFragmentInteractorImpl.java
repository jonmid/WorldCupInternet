package com.example.jonmid.worldcupinternet.Groups.interactor;

import com.example.jonmid.worldcupinternet.Groups.model.Group;
import com.example.jonmid.worldcupinternet.Groups.presenter.GroupFragmentPresenter;
import com.example.jonmid.worldcupinternet.Groups.repository.GroupFragmentRepository;
import com.example.jonmid.worldcupinternet.Groups.repository.GroupFragmentRepositoryImpl;

import java.util.List;

public class GroupFragmentInteractorImpl implements GroupFragmentInteractor {

    private GroupFragmentPresenter groupFragmentPresenter;
    private GroupFragmentRepository groupFragmentRepository;

    public GroupFragmentInteractorImpl(GroupFragmentPresenter groupFragmentPresenter) {
        this.groupFragmentPresenter = groupFragmentPresenter;
        groupFragmentRepository = new GroupFragmentRepositoryImpl(this);
    }

    @Override
    public void getDataGroup() {
        groupFragmentRepository.getDataGroup();
    }

    @Override
    public void showResultGroups(List<Group> calendarList) {
        groupFragmentPresenter.showResultGroups(calendarList);
    }
}

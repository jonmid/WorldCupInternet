package com.example.jonmid.worldcupinternet.Groups.repository;

import com.example.jonmid.worldcupinternet.ApiRest.RestApiAdapter;
import com.example.jonmid.worldcupinternet.ApiRest.Service;
import com.example.jonmid.worldcupinternet.Groups.interactor.GroupFragmentInteractor;
import com.example.jonmid.worldcupinternet.Groups.model.Group;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GroupFragmentRepositoryImpl implements GroupFragmentRepository {

    private GroupFragmentInteractor groupFragmentInteractor;
    List<Group> groupList;

    public GroupFragmentRepositoryImpl(GroupFragmentInteractor groupFragmentInteractor) {
        this.groupFragmentInteractor = groupFragmentInteractor;
    }

    @Override
    public void getDataGroup() {
        RestApiAdapter restApiAdapter = new RestApiAdapter();
        Service service = restApiAdapter.getClientService();
        Call<List<Group>> groups = service.getDataGroup();
        groups.enqueue(new Callback<List<Group>>() {
            @Override
            public void onResponse(Call<List<Group>> call, Response<List<Group>> response) {
                groupList = response.body();
                groupFragmentInteractor.showResultGroups(groupList);
            }

            @Override
            public void onFailure(Call<List<Group>> call, Throwable t) {
                //
            }
        });
    }
}

package com.example.jonmid.worldcupinternet.Groups.view;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.example.jonmid.worldcupinternet.Groups.adapter.GroupAdapter;
import com.example.jonmid.worldcupinternet.Groups.model.Group;
import com.example.jonmid.worldcupinternet.Groups.presenter.GroupFragmentPresenter;
import com.example.jonmid.worldcupinternet.Groups.presenter.GroupFragmentPresenterImpl;
import com.example.jonmid.worldcupinternet.R;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class GroupFragment extends Fragment implements GroupFragmentView {

    private GroupFragmentPresenter groupFragmentPresenter;
    ProgressBar progressBarGroup;
    RecyclerView recyclerViewGroup;

    public GroupFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_group, container, false);

        progressBarGroup = (ProgressBar) view.findViewById(R.id.id_pgb_group);
        recyclerViewGroup = (RecyclerView) view.findViewById(R.id.id_rcv_group);
        recyclerViewGroup.setLayoutManager(new LinearLayoutManager(getContext()));

        groupFragmentPresenter = new GroupFragmentPresenterImpl(this);

        progressBarGroup.setVisibility(View.VISIBLE);
        groupFragmentPresenter.getDataGroup();

        return view;
    }

    @Override
    public void showResultGroups(List<Group> calendarList) {
        progressBarGroup.setVisibility(View.GONE);
        recyclerViewGroup.setAdapter(new GroupAdapter(calendarList, getContext()));
    }
}

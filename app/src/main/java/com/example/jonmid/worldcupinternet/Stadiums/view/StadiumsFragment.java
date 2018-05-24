package com.example.jonmid.worldcupinternet.Stadiums.view;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.example.jonmid.worldcupinternet.R;
import com.example.jonmid.worldcupinternet.Stadiums.adapter.StadiumAdapter;
import com.example.jonmid.worldcupinternet.Stadiums.model.Stadium;
import com.example.jonmid.worldcupinternet.Stadiums.presenter.StadiumsFragmentPresenter;
import com.example.jonmid.worldcupinternet.Stadiums.presenter.StadiumsFragmentPresenterImpl;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class StadiumsFragment extends Fragment implements StadiumsFragmentView {

    private StadiumsFragmentPresenter stadiumsFragmentPresenter;
    ProgressBar progressBarStadium;
    RecyclerView recyclerViewStadium;

    public StadiumsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_stadiums, container, false);

        progressBarStadium = (ProgressBar) view.findViewById(R.id.id_pgb_stadium);
        recyclerViewStadium = (RecyclerView) view.findViewById(R.id.id_rcv_stadium);
        recyclerViewStadium.setLayoutManager(new LinearLayoutManager(getContext()));

        stadiumsFragmentPresenter = new StadiumsFragmentPresenterImpl(this);

        progressBarStadium.setVisibility(View.VISIBLE);
        stadiumsFragmentPresenter.getDataStadium();

        return view;
    }

    @Override
    public void showResultStadium(List<Stadium> stadiumList) {
        progressBarStadium.setVisibility(View.GONE);
        recyclerViewStadium.setAdapter(new StadiumAdapter(stadiumList, getContext()));
    }
}

package com.example.jonmid.worldcupinternet.Calendar.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jonmid.worldcupinternet.Calendar.model.Calendar;
import com.example.jonmid.worldcupinternet.Calendar.model.Match;
import com.example.jonmid.worldcupinternet.Calendar.model.RecyclerViewItem;
import com.example.jonmid.worldcupinternet.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class CalendarAdapter extends RecyclerView.Adapter {

    List<RecyclerViewItem> recyclerViewItemList;
    Context context;

    private static final int HEADER_ITEM = 0;
    private static final int FOOTER_ITEM = 1;
    private static final int FOOD_ITEM = 2;

    public CalendarAdapter(List<RecyclerViewItem> recyclerViewItemList, Context context) {
        this.recyclerViewItemList = recyclerViewItemList;
        this.context = context;
    }

    // *******************************************************************************************

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View row;

        if (viewType == HEADER_ITEM) {
            row = inflater.inflate(R.layout.item_head_calendar, parent, false);
            return new HeaderHolder(row);
        } else if (viewType == FOOD_ITEM) {
            row = inflater.inflate(R.layout.item_calendar, parent, false);
            return new FoodItemHolder(row);

        }
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        RecyclerViewItem recyclerViewItem = recyclerViewItemList.get(position);

        if (holder instanceof HeaderHolder) {
            HeaderHolder headerHolder = (HeaderHolder) holder;
            //Calendar header = (Calendar) recyclerViewItem;

            headerHolder.textViewHeadCalendar.setText("hfdbgj");
        } else if (holder instanceof FoodItemHolder) {
            FoodItemHolder foodItemHolder = (FoodItemHolder) holder;
            //Match foodItem = (Match) recyclerViewItem;

            //foodItemHolder.textViewTeamLocal.setText(foodItem.getLocal());
            //foodItemHolder.textViewTeamHourMatch.setText(foodItem.getHour());
            //foodItemHolder.textViewTeamVisitor.setText(foodItem.getVisitor());
        }
    }

    @Override
    public int getItemViewType(int position) {
        RecyclerViewItem recyclerViewItem = recyclerViewItemList.get(position);

        if (recyclerViewItem instanceof Calendar)
            return HEADER_ITEM;
        else if (recyclerViewItem instanceof Match)
            return FOOD_ITEM;
        else
            return super.getItemViewType(position);
    }

    @Override
    public int getItemCount() {
        return recyclerViewItemList.size();
    }

    // *******************************************************************************************

    //Food item holder
    private class FoodItemHolder extends RecyclerView.ViewHolder {
        TextView textViewTeamLocal, textViewTeamHourMatch, textViewTeamVisitor;
        CircleImageView circleImageViewLocal, circleImageViewVisitor;

        FoodItemHolder(View itemView) {
            super(itemView);
            textViewTeamLocal = itemView.findViewById(R.id.id_txv_team_local);
            textViewTeamHourMatch = itemView.findViewById(R.id.id_txv_team_hourmatch);
            textViewTeamVisitor = itemView.findViewById(R.id.id_txv_team_visitor);
            circleImageViewLocal = itemView.findViewById(R.id.id_img_team_local);
            circleImageViewVisitor = itemView.findViewById(R.id.id_img_team_visitor);
        }
    }

    //header holder
    private class HeaderHolder extends RecyclerView.ViewHolder {
        TextView textViewHeadCalendar;

        HeaderHolder(View itemView) {
            super(itemView);
            textViewHeadCalendar = itemView.findViewById(R.id.id_txv_head_calendar);
        }
    }
}

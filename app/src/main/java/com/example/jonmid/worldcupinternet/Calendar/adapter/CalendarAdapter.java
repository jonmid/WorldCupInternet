package com.example.jonmid.worldcupinternet.Calendar.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jonmid.worldcupinternet.Calendar.model.Calendar;
import com.example.jonmid.worldcupinternet.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class CalendarAdapter extends RecyclerView.Adapter {
    List<Calendar> calendarList;
    Context context;

    public CalendarAdapter(List<Calendar> calendarList, Context context) {
        this.calendarList = calendarList;
        this.context = context;
    }

    // ********************************************************************************************

    @Override
    public int getItemViewType(int position) {
        switch (calendarList.get(position).getwType()) {
            case 0:
                return Calendar.MATCH_TYPE;
            case 1:
                return Calendar.TITLE_TYPE;
            default:
                return -1;
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View item;
        switch (viewType) {
            case Calendar.MATCH_TYPE:
                item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_calendar_match, parent, false);
                return new ViewHolderMatch(item);
            case Calendar.TITLE_TYPE:
                item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_calendar_title, parent, false);
                return new ViewHolderTitle(item);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Calendar object = calendarList.get(position);
        if (object != null) {
            switch (object.getwType()) {
                case Calendar.MATCH_TYPE:
                    ViewHolderMatch viewHolderMatch = (ViewHolderMatch) holder;
                    viewHolderMatch.textViewTeamLocal.setText(object.getLocal());
                    viewHolderMatch.textViewTeamHourMatch.setText(object.getHour());
                    viewHolderMatch.textViewTeamVisitor.setText(object.getVisitor());
                    break;
                case Calendar.TITLE_TYPE:
                    ViewHolderTitle viewHolderTitle = (ViewHolderTitle) holder;
                    viewHolderTitle.textViewCalendarTitle.setText(object.getDay());
                    break;
            }
        }
    }

    @Override
    public int getItemCount() {
        return calendarList.size();
    }

    // ********************************************************************************************

    public class ViewHolderTitle extends RecyclerView.ViewHolder{
        TextView textViewCalendarTitle;

        public ViewHolderTitle(View item) {
            super(item);
            textViewCalendarTitle = item.findViewById(R.id.id_txv_calendar_title);
        }
    }

    public class ViewHolderMatch extends RecyclerView.ViewHolder{
        TextView textViewTeamLocal, textViewTeamHourMatch, textViewTeamVisitor;
        CircleImageView circleImageViewLocal, circleImageViewVisitor;

        public ViewHolderMatch(View item) {
            super(item);
            textViewTeamLocal = item.findViewById(R.id.id_txv_team_local);
            textViewTeamHourMatch = item.findViewById(R.id.id_txv_team_hourmatch);
            textViewTeamVisitor = item.findViewById(R.id.id_txv_team_visitor);
            circleImageViewLocal = item.findViewById(R.id.id_img_team_local);
            circleImageViewVisitor = item.findViewById(R.id.id_img_team_visitor);
        }
    }
}

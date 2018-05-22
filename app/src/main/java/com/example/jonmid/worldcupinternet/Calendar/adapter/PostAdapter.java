package com.example.jonmid.worldcupinternet.Calendar.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jonmid.worldcupinternet.Calendar.model.Post;
import com.example.jonmid.worldcupinternet.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class PostAdapter extends RecyclerView.Adapter {

    List<Post> postList;
    Context context;

    public PostAdapter(List<Post> postList, Context context) {
        this.postList = postList;
        this.context = context;
    }

    // ******************************************************************************

    @Override
    public int getItemViewType(int position) {
        if(position % 3==0){
            return R.layout.item_head_calendar;
        }else{
            return R.layout.item_calendar;
        }
        //return super.getItemViewType(position);
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        final RecyclerView.ViewHolder holder;
        View view;

        switch (viewType){
            case R.layout.item_head_calendar:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_head_calendar, parent, false);
                holder = new ViewHolderHeader(view);
                break;
            case R.layout.item_calendar:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_calendar, parent, false);
                holder = new ViewHolderItem(view);
                break;
            default:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_head_calendar, parent, false);
                holder = new ViewHolderHeader(view);
                break;
        }

        return holder;

        //View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_head_calendar, parent, false);
        //ViewHolder viewHolder = new ViewHolder(item);
        //return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        if(holder instanceof ViewHolderHeader){
            ((ViewHolderHeader) holder).textViewHeadCalendar.setText(postList.get(position).getTitle());
        }else if(holder instanceof ViewHolderItem){
            ((ViewHolderItem) holder).textViewTeamLocal.setText(String.valueOf(postList.get(position).getId()));
        }

        //ViewHolder viewHolder = (ViewHolder) holder;
        //viewHolder.textViewHeadCalendar.setText(postList.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

    // ******************************************************************************

    public class ViewHolderHeader extends RecyclerView.ViewHolder{
        TextView textViewHeadCalendar;

        public ViewHolderHeader(View item) {
            super(item);
            textViewHeadCalendar = (TextView) item.findViewById(R.id.id_txv_head_calendar);
        }
    }

    public class ViewHolderItem extends RecyclerView.ViewHolder {
        TextView textViewTeamLocal, textViewTeamHourMatch, textViewTeamVisitor;
        CircleImageView circleImageViewLocal, circleImageViewVisitor;

        ViewHolderItem(View itemView) {
            super(itemView);
            textViewTeamLocal = itemView.findViewById(R.id.id_txv_team_local);
            textViewTeamHourMatch = itemView.findViewById(R.id.id_txv_team_hourmatch);
            textViewTeamVisitor = itemView.findViewById(R.id.id_txv_team_visitor);
            circleImageViewLocal = itemView.findViewById(R.id.id_img_team_local);
            circleImageViewVisitor = itemView.findViewById(R.id.id_img_team_visitor);
        }
    }
}

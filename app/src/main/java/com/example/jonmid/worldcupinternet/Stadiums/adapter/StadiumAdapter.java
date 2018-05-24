package com.example.jonmid.worldcupinternet.Stadiums.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jonmid.worldcupinternet.R;
import com.example.jonmid.worldcupinternet.Stadiums.model.Stadium;
import com.squareup.picasso.Picasso;

import java.util.List;

public class StadiumAdapter extends RecyclerView.Adapter {

    List<Stadium> stadiumList;
    Context context;

    public StadiumAdapter(List<Stadium> stadiumList, Context context) {
        this.stadiumList = stadiumList;
        this.context = context;
    }

    // ********************************************************************************************

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_stadium, parent, false);
        return new ViewHolderStadium(item);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Stadium object = stadiumList.get(position);
        ViewHolderStadium viewHolderStadium = (ViewHolderStadium) holder;
        viewHolderStadium.textViewStadiumName.setText(object.getName());
        Picasso.get().load(object.getUrl_img()).into(viewHolderStadium.imageViewStadiumImg);
    }

    @Override
    public int getItemCount() {
        return stadiumList.size();
    }

    // ********************************************************************************************

    public class ViewHolderStadium extends RecyclerView.ViewHolder{
        TextView textViewStadiumName;
        ImageView imageViewStadiumImg;

        public ViewHolderStadium(View item) {
            super(item);
            textViewStadiumName = item.findViewById(R.id.id_txv_stadium_name);
            imageViewStadiumImg = item.findViewById(R.id.id_img_stadium);
        }
    }
}

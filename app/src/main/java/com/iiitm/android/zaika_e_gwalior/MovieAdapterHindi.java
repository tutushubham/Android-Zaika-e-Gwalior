package com.iiitm.android.zaika_e_gwalior;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by rohit on 16/11/17.
 */

public class MovieAdapterHindi extends RecyclerView.Adapter<MovieAdapterHindi.MyViewHolder> {




    public List<Adapterhindi> adapterlist;
    private Context mContext;
    MovieAdapterHindi(List<Adapterhindi> adapterlist,Context mContext)
    {
        this.adapterlist=adapterlist;
        this.mContext=mContext;

    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.layout, parent,false);
        return new MovieAdapterHindi.MyViewHolder(view,adapterlist,mContext);
    }


    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Adapterhindi adapter = adapterlist.get(position);
        holder.imageView.setImageResource(adapter.getImage());
        holder.textView.setText(adapter.getName());

    }

    @Override
    public int getItemCount() {
        return adapterlist.size();
    }

    public  class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imageView;
        TextView textView;
        List<Adapterhindi> adapterlist; Context mContext;
        public MyViewHolder(View itemView,List<Adapterhindi> adapterlist,Context mContext) {
            super(itemView);
            this.adapterlist=adapterlist;
            this.mContext=mContext;
            itemView.setOnClickListener(this);
            imageView = (ImageView)itemView.findViewById(R.id.imageView);
            textView= (TextView)itemView.findViewById(R.id.textView);
        }

        @Override
        public void onClick(View view) {

            int position = getAdapterPosition();
            if(position==0){
                Adapterhindi adapter = adapterlist.get(position);
                Intent intent = new Intent(this.mContext, Main12Activity.class);
                this.mContext.startActivity(intent);
            }
            if(position==1){
                Adapterhindi adapter = adapterlist.get(position);
                Intent intent = new Intent(this.mContext, worshipHindiActivity.class);
                this.mContext.startActivity(intent);
            }

            if(position==2){
                Adapterhindi adapter = adapterlist.get(position);
                Intent intent = new Intent(this.mContext, NearByPlacesHindiActivity.class);
                this.mContext.startActivity(intent);
            }
            if(position==3){
                Adapterhindi adapter = adapterlist.get(position);
                Intent intent = new Intent(this.mContext, HotelsHindiActivity.class);
                this.mContext.startActivity(intent);
            }
            if(position==4){
                Adapterhindi adapter = adapterlist.get(position);
                Intent intent = new Intent(this.mContext, MedicalHindiActivity.class);
                this.mContext.startActivity(intent);
            }
            if(position==5){
                Adapterhindi adapter = adapterlist.get(position);
                Intent intent = new Intent(this.mContext, KeyNumbersHindiActivity.class);
                this.mContext.startActivity(intent);
            }
            if(position==6){
                Adapterhindi adapter = adapterlist.get(position);
                Intent intent = new Intent(this.mContext, ToiletsHindiActivity.class);
                this.mContext.startActivity(intent);
            }
            if(position==7){
                Adapterhindi adapter = adapterlist.get(position);
                Intent intent = new Intent(this.mContext, FeedbackHindiActivity.class);
                this.mContext.startActivity(intent);
            }
            if(position==8){
                Adapterhindi adapter = adapterlist.get(position);
                Intent intent = new Intent(this.mContext, TransportationHindiActivity.class);
                this.mContext.startActivity(intent);
            }

        }
    }
}

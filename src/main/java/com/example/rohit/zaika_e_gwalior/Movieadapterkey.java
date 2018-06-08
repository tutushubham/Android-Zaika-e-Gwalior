package com.iiitm.android.zaika_e_gwalior;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by rohit on 20/9/17.
 */

public class Movieadapterkey extends RecyclerView.Adapter<Movieadapterkey.MyViewHolder>{
    List<Adapterkey> adapterkeyList;
    Context mContext;
    Movieadapterkey( List<Adapterkey> adapterkeyList,Context mContext)
    {
        this.adapterkeyList=adapterkeyList;
        this.mContext=mContext;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.layoutkey, parent,false);
        return new MyViewHolder(view);
    }
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Adapterkey adapter = adapterkeyList.get(position);

        holder.textView1.setText(adapter.getName1());
        holder.textView2.setText(adapter.getName2());


    }

    @Override
    public int getItemCount() {
        return adapterkeyList.size();
    }

    public  class  MyViewHolder extends  RecyclerView.ViewHolder {
        TextView textView1,textView2;
        public MyViewHolder(View itemView) {

            super(itemView);
            textView1= (TextView)itemView.findViewById(R.id.textView1);
            textView2= (TextView)itemView.findViewById(R.id.textView2);
        }
    }


}

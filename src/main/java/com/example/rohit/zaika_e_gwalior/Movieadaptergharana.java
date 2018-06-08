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
 * Created by rohit on 20/9/17.
 */

public class Movieadaptergharana extends RecyclerView.Adapter<Movieadaptergharana.MyViewHolder> {

    List<Adaptergharana> adaptergharanaList;
    Context mContext;
    Movieadaptergharana(List<Adaptergharana> adaptergharanaList,Context mContext)
    {
        this.adaptergharanaList=adaptergharanaList;
        this.mContext=mContext;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.layout, parent,false);
        return new MyViewHolder(view,adaptergharanaList,mContext);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Adaptergharana adapter = adaptergharanaList.get(position);
        holder.imageView.setImageResource(adapter.getImage());
        holder.textView.setText(adapter.getName1());

    }

    @Override
    public int getItemCount() {
        return adaptergharanaList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imageView;
        TextView textView;
        List<Adaptergharana> adaptergharanaList;
        Context mContext;
        public MyViewHolder(View itemView, List<Adaptergharana> adaptergharanaList,Context mContext) {
            super(itemView);
            this.adaptergharanaList=adaptergharanaList;
            this.mContext=mContext;
            itemView.setOnClickListener(this);
            imageView = (ImageView)itemView.findViewById(R.id.imageView);
            textView= (TextView)itemView.findViewById(R.id.textView);
        }

        @Override
        public void onClick(View view) {


            int position = getAdapterPosition();
            Adaptergharana adapter = adaptergharanaList.get(position);
            Intent intent = new Intent(this.mContext, Main42Activity.class);

            intent.putExtra("imageView",adapter.getImage());
            intent.putExtra("textView1",adapter.getName1());
            intent.putExtra("textView2",adapter.getName2());
            this.mContext.startActivity(intent);

        }
    }
}

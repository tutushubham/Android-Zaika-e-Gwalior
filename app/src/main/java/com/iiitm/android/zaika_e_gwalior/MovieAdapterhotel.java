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
 * Created by rohit on 29/9/17.
 */

public class MovieAdapterhotel extends RecyclerView.Adapter<MovieAdapterhotel.MyViewHolder> {
    List<Adapterhotel> adapterhotelList;
    Context mContext;
    MovieAdapterhotel( List<Adapterhotel> adapterhotelList, Context mContext)
    {
        this.adapterhotelList=adapterhotelList;
        this.mContext=mContext;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.layoutfood, parent,false);
        return new MyViewHolder(view,adapterhotelList,mContext);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Adapterhotel adapter = adapterhotelList.get(position);
        holder.imageView.setImageResource(adapter.getImage());
        holder.textView1.setText(adapter.getName1());
        holder.textView2.setText(adapter.getName2());
        holder.textView3.setText(adapter.getName3());

    }

    @Override
    public int getItemCount() {
        return adapterhotelList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imageView;
        TextView textView1,textView2,textView3;
        List<Adapterhotel> adapterhotelList;
        Context mContext;
        public MyViewHolder(View itemView, List<Adapterhotel> adapterhotelList,Context mContext) {
            super(itemView);
            this.adapterhotelList=adapterhotelList;
            this.mContext=mContext;
            itemView.setOnClickListener(this);
            imageView = (ImageView)itemView.findViewById(R.id.imageView);
            textView1= (TextView)itemView.findViewById(R.id.textView1);
            textView2= (TextView)itemView.findViewById(R.id.textView2);
            textView3= (TextView)itemView.findViewById(R.id.textView3);
        }

        @Override
        public void onClick(View view) {

            int position = getAdapterPosition();
            Adapterhotel adapter = adapterhotelList.get(position);
            Intent intent = new Intent(this.mContext, Main82Activity.class);

            intent.putExtra("imageView",adapter.getImage());
            intent.putExtra("textView1",adapter.getName4());
            intent.putExtra("textView2",adapter.getName5());
            intent.putExtra("textView3",adapter.getName6());
            intent.putExtra("textView4",adapter.getName7());
            this.mContext.startActivity(intent);


        }
    }
}

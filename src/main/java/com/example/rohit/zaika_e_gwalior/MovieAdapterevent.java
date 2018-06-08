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
 * Created by rohit on 19/9/17.
 */

public class MovieAdapterevent extends RecyclerView.Adapter <MovieAdapterevent.MyViewHolder>{
     List<Adapterevent> adaptereventList;
    Context mContext;
      MovieAdapterevent( List<Adapterevent> adaptereventList, Context mContext)
      {
          this.adaptereventList=adaptereventList;
          this.mContext=mContext;
      }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.layoutfood, parent,false);
        return new MyViewHolder(view,adaptereventList,mContext);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Adapterevent adapter = adaptereventList.get(position);
        holder.imageView.setImageResource(adapter.getImage());
        holder.textView1.setText(adapter.getName1());
        holder.textView2.setText(adapter.getName2());
        holder.textView3.setText(adapter.getName3());


    }

    @Override
    public int getItemCount() {
        return adaptereventList.size();
    }

    public  class  MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView imageView;
        TextView textView1,textView2,textView3;
        List<Adapterevent> adaptereventList;
        Context mContext;
        public MyViewHolder(View itemView,List<Adapterevent> adaptereventList,Context mContext) {
            super(itemView);
            this.adaptereventList=adaptereventList;
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
            Adapterevent adapter = adaptereventList.get(position);
            Intent intent = new Intent(this.mContext, Main32Activity.class);

            intent.putExtra("imageView",adapter.getImage());
            intent.putExtra("textView1",adapter.getName4());
            intent.putExtra("textView2",adapter.getName5());
            intent.putExtra("textView3",adapter.getName6());
            intent.putExtra("textView4",adapter.getName7());
            intent.putExtra("textView5",adapter.getName8());
            mContext.startActivity(intent);


        }
    }
}


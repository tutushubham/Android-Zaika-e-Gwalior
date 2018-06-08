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

class MovieAdapterHindiHis extends RecyclerView.Adapter<MovieAdapterHindiHis.MyViewHolder> {



    List<AdapterHindiHistorical> adapterhistoricalList;
    Context mcontext;
    public MovieAdapterHindiHis(List<AdapterHindiHistorical> adapterhistoricalList, Context mcontext)
    {
        this.adapterhistoricalList=adapterhistoricalList;
        this.mcontext=mcontext;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.layoutfood, parent,false);
        return new MovieAdapterHindiHis.MyViewHolder(view,adapterhistoricalList,mcontext);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {


        AdapterHindiHistorical adapter = adapterhistoricalList.get(position);
        holder.imageView.setImageResource(adapter.getImage());
        holder.textView1.setText(adapter.getName1());
        holder.textView2.setText(adapter.getName2());
        holder.textView3.setText(adapter.getName3());

    }

    @Override
    public int getItemCount() {
        return adapterhistoricalList.size();
    }

    public class MyViewHolder extends  RecyclerView.ViewHolder implements View.OnClickListener{

        ImageView imageView;
        TextView textView1,textView2,textView3;

        List<AdapterHindiHistorical> adapterhistoricalList;
        Context mcontext;
        public MyViewHolder(View itemView, List<AdapterHindiHistorical> adapterhistoricalList,Context mcontext) {
            super(itemView);
            this.adapterhistoricalList=adapterhistoricalList;
            this.mcontext=mcontext;
            itemView.setOnClickListener(this);


            imageView = (ImageView)itemView.findViewById(R.id.imageView);
            textView1= (TextView)itemView.findViewById(R.id.textView1);
            textView2= (TextView)itemView.findViewById(R.id.textView2);
            textView3= (TextView)itemView.findViewById(R.id.textView3);
        }

        @Override
        public void onClick(View view) {



            int position = getAdapterPosition();
            AdapterHindiHistorical adapter = adapterhistoricalList.get(position);
            Intent intent = new Intent(this.mcontext, Main2historicalActivity.class);

            intent.putExtra("imageView",adapter.getImage());
            intent.putExtra("textView1",adapter.getName4());
            intent.putExtra("textView2",adapter.getName5());
            intent.putExtra("textView3",adapter.getName6());
            intent.putExtra("textView4",adapter.getName7());
            intent.putExtra("textView5",adapter.getName8());
            this.mcontext.startActivity(intent);


        }
    }
}

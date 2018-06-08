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
 * Created by rohit on 16/9/17.
 */


public class MovieAdapter extends RecyclerView.Adapter <MovieAdapter.MyViewHolder>
{
    public List<Adapter> adapterlist;
    private Context mContext;
    MovieAdapter(List<Adapter> adapterlist,Context mContext)
    {
          this.adapterlist=adapterlist;
          this.mContext=mContext;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.layout, parent,false);
        return new MyViewHolder(view,adapterlist,mContext);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Adapter adapter = adapterlist.get(position);
        holder.imageView.setImageResource(adapter.getImage());
        holder.textView.setText(adapter.getName());


    }

    @Override
    public int getItemCount() {

        return adapterlist.size();
    }

    public  class  MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imageView;
        TextView textView;
        List<Adapter> adapterlist; Context mContext;
        public MyViewHolder(View itemView,List<Adapter> adapterlist,Context mContext) {
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
            if(position==0)
            {
                Adapter adapter = adapterlist.get(position);
                Intent intent = new Intent(this.mContext, MainfoodActivity.class);
                this.mContext.startActivity(intent);
            }

            if(position==1)
            {
                Adapter adapter = adapterlist.get(position);
                Intent intent = new Intent(this.mContext, MainhistoricalActivity.class);
                this.mContext.startActivity(intent);
            }
            if(position==2)
            {
                Adapter adapter = adapterlist.get(position);
                Intent intent = new Intent(this.mContext, MainworshipActivity.class);
                this.mContext.startActivity(intent);
            }
            if(position==3)
            {
                Adapter adapter = adapterlist.get(position);
                Intent intent = new Intent(this.mContext, MainshoppingActivity.class);
                this.mContext.startActivity(intent);
            }
            if(position==4)
            {
                Adapter adapter = adapterlist.get(position);
                Intent intent = new Intent(this.mContext, Main2Activity.class);
                this.mContext.startActivity(intent);
            }
            if(position==5)
            {
                Adapter adapter = adapterlist.get(position);
                Intent intent = new Intent(this.mContext, Main3Activity.class);
                this.mContext.startActivity(intent);
            }
            if(position==6)
            {
                Adapter adapter = adapterlist.get(position);
                Intent intent = new Intent(this.mContext, Main4Activity.class);
                this.mContext.startActivity(intent);
            }
            if(position==7)
            {
                Adapter adapter = adapterlist.get(position);
                Intent intent = new Intent(this.mContext, Main5Activity.class);
                this.mContext.startActivity(intent);
            }
            if(position==8)
            {
                Adapter adapter = adapterlist.get(position);
                Intent intent = new Intent(this.mContext, Main6Activity.class);
                this.mContext.startActivity(intent);
            }
            if(position==9)
            {
                Adapter adapter = adapterlist.get(position);
                Intent intent = new Intent(this.mContext, Main8Activity.class);
                this.mContext.startActivity(intent);
            }
            if(position==10)
            {
                Adapter adapter = adapterlist.get(position);
                Intent intent = new Intent(this.mContext, Main9Activity.class);
                this.mContext.startActivity(intent);
            }
            if(position==11)
            {
                Adapter adapter = adapterlist.get(position);
                Intent intent = new Intent(this.mContext, Main7Activity.class);
                this.mContext.startActivity(intent);
            }

        }
    }
}

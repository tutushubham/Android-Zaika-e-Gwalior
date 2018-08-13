package com.iiitm.android.gwalior_jharoka;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.iiitm.android.gwalior_jharoka.cardslidertry.MainActivitySliderHistorical;
import com.iiitm.android.gwalior_jharoka.cardslidertry.MainActivitySliderHotels;
import com.iiitm.android.gwalior_jharoka.cardslidertry.MainActivitySliderMedical;
import com.iiitm.android.gwalior_jharoka.cardslidertry.MainActivitySliderNear;
import com.iiitm.android.gwalior_jharoka.cardslidertry.MainActivitySliderWorship;

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
        Button textView;
        List<Adapter> adapterlist; Context mContext;
        public MyViewHolder(View itemView,List<Adapter> adapterlist,Context mContext) {
            super(itemView);
            this.adapterlist=adapterlist;
            this.mContext=mContext;
            itemView.setOnClickListener(this);
            imageView = (ImageView) itemView.findViewById(R.id.imageView);
            textView= (Button) itemView.findViewById(R.id.button);
        }

        @Override
        public void onClick(View view) {
            int position = getAdapterPosition();
            if(position==0)
            {
                Adapter adapter = adapterlist.get(position);
                Intent intent = new Intent(this.mContext, MainActivitySliderHistorical.class); //historical
                this.mContext.startActivity(intent);
            }

            if(position==1)
            {
                Adapter adapter = adapterlist.get(position);
                Intent intent = new Intent(this.mContext, MainActivitySliderWorship.class);
                this.mContext.startActivity(intent);
            }
            if(position==2)
            {
                Adapter adapter = adapterlist.get(position);
                Intent intent = new Intent(this.mContext, MainActivitySliderNear.class);
                this.mContext.startActivity(intent);
            }
            if(position==3)
            {
                Adapter adapter = adapterlist.get(position);
                Intent intent = new Intent(this.mContext, MainActivitySliderHotels.class);
                this.mContext.startActivity(intent);
            }
            if(position==4)
            {
                Adapter adapter = adapterlist.get(position);
                Intent intent = new Intent(this.mContext, MainActivitySliderMedical.class);
                this.mContext.startActivity(intent);
            }
            if(position==5)
            {
                Adapter adapter = adapterlist.get(position);
                Intent intent = new Intent(this.mContext, KeyNumberActivity.class);
                this.mContext.startActivity(intent);
            }
            if(position==6)
            {
                Adapter adapter = adapterlist.get(position);
                Intent intent = new Intent(this.mContext, MapsActivity.class);
                intent.putExtra("lang",0);
                this.mContext.startActivity(intent);
            }
            if(position==7)
            {
                Adapter adapter = adapterlist.get(position);
                Intent intent = new Intent(this.mContext, EnglishAboutActivity.class);
                this.mContext.startActivity(intent);
            }
           /*if(position==8)
            {
                Adapter adapter = adapterlist.get(position);
                Intent intent = new Intent(this.mContext, MaintransportationActivity.class);
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
                Intent intent = new Intent(this.mContext, ToiletActivity.class);
                this.mContext.startActivity(intent);
            }
            if(position==11)
            {
                Adapter adapter = adapterlist.get(position);
                Intent intent = new Intent(this.mContext, EnglishAboutActivity.class);
                this.mContext.startActivity(intent);
            }*/

        }
    }
}

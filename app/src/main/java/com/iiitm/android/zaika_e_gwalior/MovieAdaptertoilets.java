package com.iiitm.android.zaika_e_gwalior;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by rohit on 30/9/17.
 */

public class MovieAdaptertoilets extends RecyclerView.Adapter<MovieAdaptertoilets.MyViewHolder> {

    List<Adaptertoilets> adaptertoiletsList;
    Context mContext;
    MovieAdaptertoilets(List<Adaptertoilets> adaptertoiletsList,Context mContext)
    {
        this.adaptertoiletsList=adaptertoiletsList;
        this.mContext= mContext;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.layouttoilet, parent,false);
        return new MyViewHolder(view,adaptertoiletsList,mContext);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {


        Adaptertoilets adapter = adaptertoiletsList.get(position);
        holder.textView1.setText(adapter.getName1());
        holder.textView2.setText(adapter.getName2());
        holder.textView3.setText(adapter.getName3());
        holder.textView4.setText(adapter.getName4());

    }

    @Override
    public int getItemCount() {
        return adaptertoiletsList.size();
    }

    public  class  MyViewHolder extends RecyclerView.ViewHolder  implements View.OnClickListener{
        TextView textView1,textView2,textView3,textView4;
        List<Adaptertoilets> adaptertoiletsList;
        Context mContext;
        public MyViewHolder(View itemView, List<Adaptertoilets> adaptertoiletsList,Context mContext) {
            super(itemView);
          this.adaptertoiletsList= adaptertoiletsList;
            this.mContext=mContext;
            itemView.setOnClickListener(this);
            textView1= (TextView)itemView.findViewById(R.id.textView11);
            textView2= (TextView)itemView.findViewById(R.id.textView12);
            textView3= (TextView)itemView.findViewById(R.id.textView13);
            textView4= (TextView)itemView.findViewById(R.id.textView14);
        }

        @Override
        public void onClick(View view) {
            int position = getAdapterPosition();
            Adaptertoilets adapter = adaptertoiletsList.get(position);

            String address;
            // address="City Centre, Opp Tadon Kothi, Gole ka Mandir, Kalpi Road, Gwalior, Madhya Pradesh 474005";
            address = adapter.getName4();
            String url = "http://maps.google.com/maps?daddr="+address;
            Intent intent = new Intent(android.content.Intent.ACTION_VIEW,  Uri.parse(url));

            this.mContext.startActivity(intent);

        }
    }
}

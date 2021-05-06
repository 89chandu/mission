package com.chandu.missionhealthy;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProductsAdapter   extends RecyclerView.Adapter<ProductsAdapter.myviwholder>{

    ArrayList<ProductsModel> productholder;

    public ProductsAdapter(ArrayList<ProductsModel> productholder) {
        this.productholder = productholder;
    }

    @NonNull
    @Override
    public myviwholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.sample_mainfood,parent,false);
        return  new myviwholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviwholder holder, int position) {

        holder.img.setImageResource(productholder.get(position).getImage());
        holder.name.setText(productholder.get(position).getHeader());
        holder.price.setText(productholder.get(position).getPrice());
        holder.descrption.setText(productholder.get(position).getDesc());


    }

    @Override
    public int getItemCount() {
        return productholder.size();
    }

    class myviwholder extends RecyclerView.ViewHolder
    {
        ImageView img;
        TextView name,price,descrption;

        public myviwholder(@NonNull View itemView) {
            super(itemView);
            img=itemView.findViewById(R.id.img1);
            name=itemView.findViewById(R.id.name);
            price=itemView.findViewById(R.id.orderPrice);
            descrption=itemView.findViewById(R.id.description);

        }
    }

}

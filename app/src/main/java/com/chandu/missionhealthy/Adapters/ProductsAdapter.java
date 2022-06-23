package com.chandu.missionhealthy.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.chandu.missionhealthy.Activity.DetailActivity;
import com.chandu.missionhealthy.Models.ProductsModel;
import com.chandu.missionhealthy.R;

import java.util.ArrayList;

public class ProductsAdapter  extends RecyclerView.Adapter<ProductsAdapter.myviwholder>{

    ArrayList<ProductsModel> productholder;
    Context context;


    public ProductsAdapter(ArrayList<ProductsModel> productholder, Context context) {
        this.productholder = productholder;
        this.context = context;
    }

    @NonNull
    @Override
    public myviwholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.sample_mainfood, parent, false);
        return  new myviwholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviwholder holder, int position) {

        final  ProductsModel model =productholder.get(position);

        holder.image.setImageResource(productholder.get(position).getImage());
        holder.name.setText(productholder.get(position).getName());
        holder.price.setText(productholder.get(position).getPrice());
        holder.descrption.setText(productholder.get(position).getDesc());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context, DetailActivity.class);
                intent.putExtra("image",model.getImage());
                intent.putExtra("name",model.getName());
                intent.putExtra("price",model.getPrice());
                intent.putExtra("desc",model.getDesc());
                intent.putExtra("type",1);
                context.startActivity(intent);
            }
        });



    }

    @Override
    public int getItemCount() {
        return productholder.size();
    }

    class myviwholder extends RecyclerView.ViewHolder
    {
        ImageView image;
        TextView name,price,descrption;

        public myviwholder(@NonNull View itemView) {
            super(itemView);
            image=itemView.findViewById(R.id.image);
            name=itemView.findViewById(R.id.name);
            price=itemView.findViewById(R.id.orderPrice);
            descrption=itemView.findViewById(R.id.description);

        }
    }

}

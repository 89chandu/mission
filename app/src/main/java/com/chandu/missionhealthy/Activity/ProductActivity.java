package com.chandu.missionhealthy.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.chandu.missionhealthy.Adapters.ProductsAdapter;
import com.chandu.missionhealthy.Models.ProductsModel;
import com.chandu.missionhealthy.R;
import com.chandu.missionhealthy.databinding.ActivityMainBinding;
import com.chandu.missionhealthy.databinding.ActivityProductBinding;

import java.util.ArrayList;

public class ProductActivity extends AppCompatActivity {


    ActivityProductBinding binding;

//    RecyclerView recyclerView;
//    ArrayList<ProductsModel> productsholder;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_product);
//
//
////        recyclerView=view.findViewById(R.id.recyclerview);
////
////        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
//        productsholder=new ArrayList<>();
//
//        ProductsModel ob1=new ProductsModel(R.drawable.accumat,"Accupressure Mate","Acupressure mate Helps In feet Pain ","250");
//        productsholder.add(ob1);
//
//        ProductsModel ob2=new ProductsModel(R.drawable.accupressure_kit,"Accupressure Kit","All Accupressure Equipments","450");
//        productsholder.add(ob2);
//
//        ProductsModel ob3=new ProductsModel(R.drawable.magnets_all,"Magnets","All magnets for Sujok therapy","654");
//        productsholder.add(ob3);
//
//        ProductsModel ob4=new ProductsModel(R.drawable.chakra_magnet,"Chakra Magnet","This Magnet Helps In Chakkar","908");
//        productsholder.add(ob4) ;
//
//        ProductsModel ob5=new ProductsModel(R.drawable.cluster_byol_magnets,"Cluster And Byol Magnet","Cluster And Byol","499");
//        productsholder.add(ob5);
//
//        ProductsModel ob6=new ProductsModel(R.drawable.star_magnet,"Star Magnet","Star magnet Helps You In Making star","599");
//        productsholder.add(ob6);
//
//        recyclerView.setAdapter(new ProductsAdapter(productsholder));
//
//        return  ;
//
//
//    }
//}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProductBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<ProductsModel> list = new ArrayList<>();

        list.add(new ProductsModel(R.drawable.acu_kit, "Acupressure Kit ", "500",R.string.accu_kit));
        list.add(new ProductsModel(R.drawable.acu_mate, "Acupressure Mate", "200",R.string.accu_mate));
        list.add(new ProductsModel(R.drawable.sujok_ring, "Sujok Ring ", "180",R.string.sujok_ring));
        list.add(new ProductsModel(R.drawable.str, "Star And Byol Magnets", "250",R.string.sujok_ring));
        list.add(new ProductsModel(R.drawable.tp, "Tap,Prob And Ring", "150",R.string.accu_mate));
        list.add(new ProductsModel(R.drawable.tap_prob, "Tap And Prob", "250",R.string.accu_kit));
        list.add(new ProductsModel(R.drawable.chakra_magnets, "Chakra Magnets", "250",R.string.sujok_ring));
        list.add(new ProductsModel(R.drawable.star_mag, "Star Magnets", "250",R.string.accu_kit));
        list.add(new ProductsModel(R.drawable.byol_mag, "Byol Magnets", "250",R.string.accu_mate));

        ProductsAdapter adapter = new ProductsAdapter(list, this);
        binding.recyclerview.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recyclerview.setLayoutManager(layoutManager);
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu, menu);
//        return super.onCreateOptionsMenu(menu);
//    }

//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        switch (item.getItemId()) {
//            case R.id.img1:
//                startActivity(new Intent(ProductActivity.this, DetailActivity.class));
//                break;
//        }
//        return super.onOptionsItemSelected(item);
//    }
}


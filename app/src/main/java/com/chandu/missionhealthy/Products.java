package com.chandu.missionhealthy;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Products#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Products extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    RecyclerView recyclerView;
    ArrayList<ProductsModel>productsholder;

    public Products() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Products.
     */
    // TODO: Rename and change types and number of parameters
    public static Products newInstance(String param1, String param2) {
        Products fragment = new Products();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
     View view =inflater.inflate(R.layout.fragment_products, container, false);
     recyclerView=view.findViewById(R.id.recyclerview);
     recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
     productsholder=new ArrayList<>();

     ProductsModel ob1=new ProductsModel(R.drawable.accumat,"Accupressure Mate","Acupressure mate Helps In feet Pain ","250");
     productsholder.add(ob1);

     ProductsModel ob2=new ProductsModel(R.drawable.accupressure_kit,"Accupressure Kit","All Accupressure Equipments","450");
     productsholder.add(ob2);

     ProductsModel ob3=new ProductsModel(R.drawable.magnets_all,"Magnets","All magnets for Sujok therapy","654");
     productsholder.add(ob3);

     ProductsModel ob4=new ProductsModel(R.drawable.chakra_magnet,"Chakra Magnet","This Magnet Helps In Chakkar","908");
     productsholder.add(ob4) ;

     ProductsModel ob5=new ProductsModel(R.drawable.cluster_byol_magnets,"Cluster And Byol Magnet","Cluster And Byol","499");
     productsholder.add(ob5);

     ProductsModel ob6=new ProductsModel(R.drawable.star_magnet,"Star Magnet","Star magnet Helps You In Making star","599");
     productsholder.add(ob6);

     recyclerView.setAdapter(new ProductsAdapter(productsholder));

     return  view;

    }
}
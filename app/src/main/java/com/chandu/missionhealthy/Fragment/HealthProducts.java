//package com.chandu.missionhealthy.Fragment;
//
//import android.os.Bundle;
//
//import androidx.fragment.app.Fragment;
//
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//
//import com.chandu.missionhealthy.R;
//
///**
// * A simple {@link Fragment} subclass.
// * Use the {@link HealthProducts#newInstance} factory method to
// * create an instance of this fragment.
// */
//public class HealthProducts extends Fragment {
//
//    // TODO: Rename parameter arguments, choose names that match
//    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//    private static final String ARG_PARAM1 = "param1";
//    private static final String ARG_PARAM2 = "param2";
//
//    // TODO: Rename and change types of parameters
//    private String mParam1;
//    private String mParam2;
//
//    public HealthProducts() {
//        // Required empty public constructor
//    }
//
//    /**
//     * Use this factory method to create a new instance of
//     * this fragment using the provided parameters.
//     *
//     * @param param1 Parameter 1.
//     * @param param2 Parameter 2.
//     * @return A new instance of fragment HealthProducts.
//     */
//    // TODO: Rename and change types and number of parameters
//    public static HealthProducts newInstance(String param1, String param2) {
//        HealthProducts fragment = new HealthProducts();
//        Bundle args = new Bundle();
//        args.putString(ARG_PARAM1, param1);
//        args.putString(ARG_PARAM2, param2);
//        fragment.setArguments(args);
//        return fragment;
//    }
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        if (getArguments() != null) {
//            mParam1 = getArguments().getString(ARG_PARAM1);
//            mParam2 = getArguments().getString(ARG_PARAM2);
//        }
//    }
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_health_products, container, false);
//    }
//}
//
//package com.chandu.missionhealthy.Fragment;
//
//import androidx.annotation.NonNull;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.fragment.app.Fragment;
//import androidx.fragment.app.FragmentActivity;
//import androidx.recyclerview.widget.LinearLayoutManager;
//
//import android.app.Activity;
//import android.os.Bundle;
//
//import com.chandu.missionhealthy.Adapters.MainAdapter;
//import com.chandu.missionhealthy.Models.MainModel;
//import com.chandu.missionhealthy.R;
////import com.chandu.missionhealthy.Fragment.HealthProducts.databinding;
//import com.chandu.missionhealthy.databinding.ActivityMainBinding;
////import com.chandu.missionhealthy.databinding.;
//
//import java.util.ArrayList;
//
//public class HealthProducts extends Fragment {
//
//    @NonNull
//    ActivityMainBinding binding;
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        binding=ActivityMainBinding.inflate(getLayoutInflater());
//        return binding.getRoot();
//
//
//        ArrayList<MainModel>list=new ArrayList<>();
//
//        list.add(new MainModel(R.drawable.logo, "Burger", "250", "Chicken Burger"));
//        list.add(new MainModel(R.drawable.logo,"Pizza","150","Chicken Burger"));
//        list.add(new MainModel(R.drawable.logo,"Samose","250","Chicken Burger"));
//        list.add(new MainModel(R.drawable.logo,"Dosa","350","Chicken Burger"));
//        list.add(new MainModel(R.drawable.logo,"Dahi puri","450","Chicken Burger"));
//        list.add(new MainModel(R.drawable.logo,"Sandwitch","950","Chicken Burger"));
//        list.add(new MainModel(R.drawable.logo,"Samose","850","Chicken Burger"));
//        list.add(new MainModel(R.drawable.logo,"Noodles","750","Chicken Burger"));
//
//        MainAdapter adapter= new MainAdapter(list,this);
//        binding.recyclerview.setAdapter(adapter);
//
//        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
//        binding.recyclerview.setLayoutManager(layoutManager);
//    }
//}

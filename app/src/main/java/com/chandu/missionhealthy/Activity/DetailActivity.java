package com.chandu.missionhealthy.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.chandu.missionhealthy.R;
import com.chandu.missionhealthy.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {

    ActivityDetailBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        if (getIntent().getIntExtra("type", 0) == 1) {

             int image = getIntent().getIntExtra("image", 0);
             int price = Integer.parseInt(getIntent().getStringExtra("price"));
            String name = getIntent().getStringExtra("name");
            int description = getIntent().getIntExtra("desc",0);

            binding.detailImage.setImageResource(image);
            binding.priceLbl.setText(String.format("%d", price));
            binding.foodname.setText(name);
            binding.detailDescription.setText(description);


            binding.insertBtn.setOnClickListener(view -> {
               Intent intent= new Intent(DetailActivity.this, OrderActivity.class);
                startActivity(intent);
            });









//                            (binding.nameBox.getText().toString(),
//                             binding.phoneBox.getText().toString(),
//                             price,
//                             image,
//                             name,
//                             description;
//                            );

//                    if (isInserted)
//                        Toast.makeText(DetailActivity.this, "Data Success", Toast.LENGTH_SHORT).show();
//                    else
//                        Toast.makeText(DetailActivity.this, "Data Error", Toast.LENGTH_SHORT).show();

                }

//
//        } else {
//            int id = getIntent().getIntExtra("id", 0);
//            Cursor cursor = helper.getOrderById(id);
//            final int image = cursor.getInt(5);
//            binding.detailImage.setImageResource(image);
//            binding.priceLbl.setText(String.format("%d", cursor.getInt(4)));
//            binding.foodname.setText(cursor.getString(8));
//            binding.detailDescription.setText(cursor.getString(7));
//            binding.nameBox.setText(cursor.getString(2));
//            binding.phoneBox.setText(cursor.getString(3));
//            binding.insertBtn.setText("Update Now");
//            binding.insertBtn.setOnClickListener(new View.OnClickListener() {
//
//                @Override
//                public void onClick(View view) {
//                    boolean isUpdated =  helper.updateOrder (
//                            binding.nameBox.getText().toString(),
//                            binding.phoneBox.getText().toString(),
//                            Integer.parseInt(binding.priceLbl.getText().toString()),
//                            image,
//                            binding.detailDescription.getText().toString(),
//                            binding.foodname.getText().toString(),
//                            1,
//                            id
//                    );
//
//                    if (isUpdated)
//                        Toast.makeText(DetailActivity.this,"Updated",Toast.LENGTH_SHORT).show();
//                    else
//                        Toast.makeText(DetailActivity.this,"Failed",Toast.LENGTH_SHORT).show();
//                }
//            });

        }
    }

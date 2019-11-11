package com.example.recyclerPresident.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.recyclerPresident.R;

public class DisplaySpinnerActivity extends AppCompatActivity {

    TextView tvName,tvNationality,tvPhone,tvEmail,tvAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_spinner);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        tvName = findViewById(R.id.yName);
        tvPhone= findViewById(R.id.pNumber);
        tvEmail = findViewById(R.id.email);
        tvAddress = findViewById(R.id.address);
        tvNationality = findViewById(R.id.nNationality);


        Bundle bundleForm = getIntent().getExtras();
        if(bundleForm != null){
            tvName.setText(bundleForm.getString("forName"));
            tvNationality.setText(bundleForm.getString("forNationality"));
            tvPhone.setText(bundleForm.getString("forPhone"));
            tvEmail.setText(bundleForm.getString("forEmail"));
            tvAddress.setText(bundleForm.getString("forAddress"));


        }
        else{
            Toast.makeText(this, "Sorry, we can't get your data", Toast.LENGTH_SHORT).show();
        }

    }
}

package com.si51.mashupmusic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvData;
    private ArrayList<DataModel> dataModelArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvData = findViewById(R.id.rv_data);
        rvData.setHasFixedSize(true);

        dataModelArrayList.addAll(Data.getData());
        showData();
    }
    private void showData() {
        rvData.setLayoutManager(new LinearLayoutManager(this));
        AdapterData adapterData = new AdapterData(dataModelArrayList);
        rvData.setAdapter(adapterData);
    }
}
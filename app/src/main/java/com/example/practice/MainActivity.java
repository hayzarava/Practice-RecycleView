package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private PegawaiAdapter pegawaiAdapter;
    private ArrayList<Pegawai> pegawaiArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        pegawaiAdapter = new PegawaiAdapter(pegawaiArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(pegawaiAdapter);
    }

    void addData(){
        pegawaiArrayList = new ArrayList<>();
        pegawaiArrayList.add(new Pegawai("Gusti Trianurcahya", "JL. Karanganyar"));
        pegawaiArrayList.add(new Pegawai("Ibadurohman", "JL. Ramajaksa"));
        pegawaiArrayList.add(new Pegawai("Laurensius", "JL. Cigugur"));
        pegawaiArrayList.add(new Pegawai("Rike", "JL. Ciniru"));
    }
}
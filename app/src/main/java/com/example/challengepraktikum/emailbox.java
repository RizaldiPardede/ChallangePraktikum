package com.example.challengepraktikum;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class emailbox extends AppCompatActivity {
    private RecyclerView recyclerView;
    private Adapter adapter;
    private ArrayList<email> listemail;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        ImageView setting;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycle_view);
        setting = findViewById(R.id.setting);
        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(emailbox.this, setting.class);
                startActivity(intent);
            }
        });
        getlist();
        recyclerView = findViewById(R.id.recycleview);
        adapter = new Adapter(listemail);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(emailbox.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }
    public  void getlist(){
        listemail = new ArrayList<>();
        listemail.add(new email("April 10, 2019 5:08 PM","Hai senang bertemu denganmu",R.drawable.pp_recycle));
        listemail.add(new email("April 10, 2019 5:08 PM","Hai senang bertemu denganmu",R.drawable.pp_recycle));
        listemail.add(new email("April 10, 2019 5:08 PM","Hai senang bertemu denganmu",R.drawable.pp_recycle));
        listemail.add(new email("April 10, 2019 5:08 PM","Hai senang bertemu denganmu",R.drawable.pp_recycle));
        listemail.add(new email("April 10, 2019 5:08 PM","Hai senang bertemu denganmu",R.drawable.pp_recycle));
        listemail.add(new email("April 10, 2019 5:08 PM","Hai senang bertemu denganmu",R.drawable.pp_recycle));
        listemail.add(new email("April 10, 2019 5:08 PM","Hai senang bertemu denganmu",R.drawable.pp_recycle));
        listemail.add(new email("April 10, 2019 5:08 PM","Hai senang bertemu denganmu",R.drawable.pp_recycle));
        listemail.add(new email("April 10, 2019 5:08 PM","Hai senang bertemu denganmu",R.drawable.pp_recycle));
        listemail.add(new email("April 10, 2019 5:08 PM","Hai senang bertemu denganmu",R.drawable.pp_recycle));
        listemail.add(new email("April 10, 2019 5:08 PM","Hai senang bertemu denganmu",R.drawable.pp_recycle));
        listemail.add(new email("April 10, 2019 5:08 PM","Hai senang bertemu denganmu",R.drawable.pp_recycle));
        listemail.add(new email("April 10, 2019 5:08 PM","Hai senang bertemu denganmu",R.drawable.pp_recycle));
        listemail.add(new email("April 10, 2019 5:08 PM","Hai senang bertemu denganmu",R.drawable.pp_recycle));
        listemail.add(new email("April 10, 2019 5:08 PM","Hai senang bertemu denganmu",R.drawable.pp_recycle));
    }
}

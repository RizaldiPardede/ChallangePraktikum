package com.example.challengepraktikum;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.emailviewholder> {
    private ArrayList<email> listemail;

    public Adapter(ArrayList<email> listemail) {
        this.listemail = listemail;
    }

    @NonNull
    @Override
    public Adapter.emailviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.rows,parent,false);

        return new emailviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.emailviewholder holder, int position) {
        holder.tvtime.setText(listemail.get(position).getTime());
        holder.tvmessage.setText(listemail.get(position).getMessage());
        holder.pp.setImageResource(listemail.get(position).getPp());

    }

    @Override
    public int getItemCount() {
        return (listemail != null) ? listemail.size() : 0;
    }

    public class emailviewholder extends  RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView tvtime, tvmessage;
        private ImageView pp;
        public  emailviewholder(View view){
            super(view);
            tvtime = view.findViewById(R.id.time);
            tvmessage = view.findViewById(R.id.message);
            pp = view.findViewById(R.id.pp);
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int position =getAdapterPosition();
            Toast.makeText(view.getContext(), "This is email",Toast.LENGTH_SHORT).show();

        }
    }
}

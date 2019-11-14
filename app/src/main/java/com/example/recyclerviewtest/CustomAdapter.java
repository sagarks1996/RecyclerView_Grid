package com.example.recyclerviewtest;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {
    private Context context;
    private ArrayList<ModelClass> arrayList;

    public CustomAdapter(MainActivity parent, ArrayList<ModelClass> arrayList) {

        this.arrayList = arrayList;
        this.context = parent;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_view,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        ModelClass modelClass = arrayList.get(position);
        String name = modelClass.getName();
        int avatar  = modelClass.getAvatar();

        holder.imageView.setImageResource(avatar);
        holder.textView.setText(name);


    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView textView;
        ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.textview);
            imageView = itemView.findViewById(R.id.imageview);

            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {

            ModelClass modelClass = arrayList.get(getAdapterPosition());
            String name = modelClass.getName();
            int avatar  = modelClass.getAvatar();

            Toast.makeText(context,"Selected Profile :"+name,Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(context,SecondActivity.class);
            intent.putExtra("name",name);
            intent.putExtra("avatar",avatar);
            context.startActivity(intent);

        }
    }
}

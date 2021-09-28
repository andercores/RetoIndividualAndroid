package com.example.retoindividualandroid.ui.galeria;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.retoindividualandroid.R;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>
{

    String[] list;
    String[] img;
    Context context;

    public RecyclerAdapter(String[] list, String[] img, Context context) {
        this.list = list;
        this.img = img;
        this.context = context;

    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_grid, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position)
    {
     holder.textView.setText(list[position]);
     //holder.imageView.setImageResource(Integer.parseInt(img[position]));
     ImageView imageView;
     imageView = holder.imageView.findViewById(R.id.ivGrid);
     Glide.with(context).load(img[position]).into(imageView);


        TextView textView = holder.textView.findViewById(R.id.tvGrid);

         holder.itemView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(view.getContext(), "Has clicado en: " + textView.getText(), Toast.LENGTH_SHORT).show();
                DialogFragment dialogFragment = new DialogFragment();

                Bundle bundle = new Bundle();
                bundle.putString("pos", img[holder.getAdapterPosition()]);
                dialogFragment.setArguments(bundle);

                dialogFragment.show(((FragmentActivity) context).getSupportFragmentManager(), "Imagen");

            }
        });


    }

    @Override
    public int getItemCount()
    {
        return list.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView textView;
        ImageView imageView;

        public MyViewHolder(@NonNull View itemView)
        {
            super(itemView);
            textView = itemView.findViewById(R.id.tvGrid);
            imageView = itemView.findViewById(R.id.ivGrid);


        }
    }


}
